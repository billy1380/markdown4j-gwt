//  
//  PluginContentReadyEvent.java
//  markdown4j-gwt
//
//  Created by William Shakour on December 31, 2014.
//  Copyrights © 2014 SPACEHOPPER STUDIOS LTD. All rights reserved.
//
package org.markdown4j.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;

public interface PluginContentReadyEventHandler extends EventHandler {
	public static final GwtEvent.Type<PluginContentReadyEventHandler> TYPE = new GwtEvent.Type<PluginContentReadyEventHandler>();

	public void ready(PluginContentReadyEvent event, String id, String content);

	public class PluginContentReadyEvent extends GwtEvent<PluginContentReadyEventHandler> {
		private String id;
		private String content;

		public PluginContentReadyEvent(String id, String content) {
			this.id = id;
			this.content = content;
		}

		@Override
		public GwtEvent.Type<PluginContentReadyEventHandler> getAssociatedType() {
			return TYPE;
		}

		@Override
		protected void dispatch(PluginContentReadyEventHandler handler) {
			handler.ready(this, id, content);
		}
	}

}