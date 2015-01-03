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

/**
 * Warning: This is not a good candidate for live updating
 *
 */
public class WebSequencePlugin extends AbstractAsyncPlugin {

	public WebSequencePlugin(HandlerManager manager) {
		super("sequence", manager);
	}

	@Override
	public void emit(final StringBuilder out, final List<String> lines, final Map<String, String> params) {
		String style = params.get("style");
		if (style == null) {
			style = "default";
		}
		String content = null;
		for (String line : lines) {
			if (content == null) {
				content = line;
			} else {
				content = content + "\n" + line;
			}
		}

		content = content + "\n";

		try {
			String id = params.get("id");
			if (id != null) {
				out.append("<div id=\"");
				out.append(id);
				out.append("\">Loading...</div>");

				getSequenceDiagram(content, style, id);
			} else {
				// Do nothing
			}
		} catch (IOException e) {
			throw new RuntimeException("Error while rendering websequenceplugin", e);
		}
	}

	private void getSequenceDiagram(String text, String style, final String id) throws IOException {
		// Build parameter string
		String data = "style=" + style + "&message=" + URL.encode(text) + "&apiVersion=1";

		// Send the request
		RequestBuilder builder = new RequestBuilder(RequestBuilder.POST, URL.encode("http://spchoprcors.appspot.com/www.websequencediagrams.com"));
		try {
			builder.sendRequest(data, new RequestCallback() {

				@Override
				public void onResponseReceived(Request request, Response response) {
					if (response.getStatusCode() >= 200 && response.getStatusCode() < 300) {
						String json = response.getText();

						int start = json.indexOf("?png=");
						int end = json.indexOf("\"", start);

						if (start != -1 && end != -1) {
							String content = "<img src=\"http://www.websequencediagrams.com/" + json.substring(start, end) + "\">";

							if (manager != null) {
								manager.fireEvent(new PluginContentReadyEvent(id, content));
							}
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
