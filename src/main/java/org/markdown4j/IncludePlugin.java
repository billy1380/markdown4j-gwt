package org.markdown4j;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.markdown4j.event.PluginContentReadyEventHandler.PluginContentReadyEvent;

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

						if (manager != null) {
							manager.fireEvent(new PluginContentReadyEvent(id, content));
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
