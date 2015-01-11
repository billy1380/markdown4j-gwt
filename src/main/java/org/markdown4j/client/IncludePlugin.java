package org.markdown4j.client;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.markdown4j.client.event.PluginContentReadyEventHandler.PluginContentReadyEvent;

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

	public IncludePlugin(HandlerManager manager) {
		super("include", manager);
	}

	@Override
	public void emit(final StringBuilder out, final List<String> lines, final Map<String, String> params) {
		String src = params.get("src");
		try {
			String id = null;
			out.append("<div id=\"");
			out.append(id = HTMLPanel.createUniqueId());
			out.append("\">Loading...</div>");

			getContent(src, id);
		} catch (Exception e) {
			throw new RuntimeException("Error while rendering " + this.getClass().getName(), e);
		}
	}

	private void getContent(String src, final String id) throws IOException {
		String corsProxy = src.replace("http://", "").replace("https://", "");

		// Send the request
		RequestBuilder builder = new RequestBuilder(RequestBuilder.POST, URL.encode("http://spchoprcors.appspot.com/" + corsProxy));
		try {
			builder.sendRequest("", new RequestCallback() {

				@Override
				public void onResponseReceived(Request request, Response response) {
					if (response.getStatusCode() >= 200 && response.getStatusCode() < 300) {
						String content = response.getText();
						String markdownContent = null;

						if (manager != null) {
							markdownContent = (new MarkdownProcessor() {

								/*
								 * (non-Javadoc)
								 * 
								 * @see org.markdown4j.client.MarkdownProcessor#registerPlugins()
								 */
								protected void registerPlugins() {
									// don't register any especially not the include plugin to avoid recursive content and also because there are no listeners
								};

							}).process(content);
							manager.fireEvent(new PluginContentReadyEvent(id, markdownContent == null ? content : markdownContent));
						}
					}
				}

				@Override
				public void onError(Request request, Throwable exception) {}
			});
		} catch (RequestException rex) {
			throw new IOException(rex);
		}
	}
}
