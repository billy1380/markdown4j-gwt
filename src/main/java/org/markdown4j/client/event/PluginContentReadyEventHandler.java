//  
//  PluginContentReadyEvent.java
//  markdown4j-gwt
//
//  Created by William Shakour on December 31, 2014.
//  Copyrights © 2014 WillShex Limited. All rights reserved.
//
package org.markdown4j.client.event;

import java.util.List;
import java.util.Map;

import org.markdown4j.Plugin;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;

public interface PluginContentReadyEventHandler extends EventHandler {
	public static final GwtEvent.Type<PluginContentReadyEventHandler> TYPE = new GwtEvent.Type<PluginContentReadyEventHandler>();

	public void ready(PluginContentReadyEvent event, Plugin plugin, List<String> lines, Map<String, String> params, String id, String content);

	public class PluginContentReadyEvent extends GwtEvent<PluginContentReadyEventHandler> {
		private Plugin plugin;
		private List<String> lines;
		private Map<String, String> params;
		private String id;
		private String content;

		public PluginContentReadyEvent(Plugin plugin, List<String> lines, Map<String, String> params, String id, String content) {
			this.plugin = plugin;
			this.lines = lines;
			this.params = params;
			this.id = id;
			this.content = content;
		}

		@Override
		public GwtEvent.Type<PluginContentReadyEventHandler> getAssociatedType() {
			return TYPE;
		}

		@Override
		protected void dispatch(PluginContentReadyEventHandler handler) {
			handler.ready(this, plugin, lines, params, id, content);
		}
	}

}