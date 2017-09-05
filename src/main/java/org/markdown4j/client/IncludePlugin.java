package org.markdown4j.client;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.markdown4j.client.event.PluginContentReadyEventHandler.PluginContentReadyEvent;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.http.client.URL;
import com.google.gwt.user.client.ui.HTMLPanel;

/**
 * Warning: This is not a good candidate for live updating
 *
 */
public class IncludePlugin extends AbstractAsyncPlugin {

	private MarkdownProcessor processor = null;
	private Request request;

	public IncludePlugin (HandlerManager manager) {
		super("include", manager);
	}

	@Override
	public void emit (final StringBuilder out, final List<String> lines,
			final Map<String, String> params) {
		String src = params.get("src");
		try {
			String id = null;
			out.append("<div id=\"");
			out.append(id = HTMLPanel.createUniqueId());
			out.append("\">Loading...</div>");

			if (src != null && src.length() > 0) {
				getContent(src, id, lines, params);
			}
		} catch (Exception e) {
			throw new RuntimeException(
					"Error while rendering " + this.getClass().getName(), e);
		}
	}

	protected void getContent (final String src, final String id,
			final List<String> lines, final Map<String, String> params)
			throws IOException {
		if (request != null && request.isPending()) {
			request.cancel();
		}

		String corsProxy = src.replace("http://", "").replace("https://", "");

		// Send the request
		RequestBuilder builder = new RequestBuilder(RequestBuilder.POST,
				URL.encode("http://spchoprcors.appspot.com/" + corsProxy));
		try {
			request = builder.sendRequest("", new RequestCallback() {

				@Override
				public void onResponseReceived (Request request,
						Response response) {
					if (response.getStatusCode() >= 200
							&& response.getStatusCode() < 300) {
						String content = response.getText();
						gotContent(content, processContent(content), src, id,
								lines, params);
					}
				}

				@Override
				public void onError (Request request, Throwable exception) {
					GWT.log("Error getting [" + src + "]", exception);
				}
			});
		} catch (RequestException rex) {
			throw new IOException(rex);
		}
	}

	protected void gotContent (String content, String processed, String src,
			String id, List<String> lines, Map<String, String> params) {
		if (manager != null) {
			manager.fireEvent(new PluginContentReadyEvent(IncludePlugin.this,
					lines, params, id,
					processed == null ? content : processed));
		}
	}

	private String processContent (String content) {
		return ensureProcessor().process(content);
	}

	private MarkdownProcessor ensureProcessor () {
		return (processor == null ? (processor = new MarkdownProcessor() {

			/* (non-Javadoc)
			 * 
			 * @see org.markdown4j.client.MarkdownProcessor#
			 * registerPlugins() */
			protected void registerPlugins () {
				// don't register any especially not the include plugin to avoid recursive content and also because there are no listeners
			};

		}) : processor);
	}

	public void setProcessor (MarkdownProcessor processor) {
		this.processor = processor;
	}
}
