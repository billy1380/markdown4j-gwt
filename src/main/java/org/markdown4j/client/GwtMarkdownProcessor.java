//
//  GwtMarkdownProcessor.java
//  markdown4j-gwt
//
//  Created by William Shakour (billy1380) on 11 Jan 2015.
//  Copyright © 2015 SPACEHOPPER STUDIOS Ltd. All rights reserved.
//
package org.markdown4j.client;

import java.io.IOException;

import org.markdown4j.Markdown4jProcessor;
import org.markdown4j.client.event.PluginContentReadyEventHandler;

import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.event.shared.HandlerRegistration;

/**
 * @author William Shakour (billy1380)
 *
 */
public class GwtMarkdownProcessor extends Markdown4jProcessor {
	private HandlerManager manager = new HandlerManager(this);

	public String process(String markdown) {
		String processed = null;
		try {
			processed = super.process(markdown);
		} catch (IOException ioe) {
			// this is very unlikely - but better to throw as runtime exception than getting lost
			throw new RuntimeException(ioe);
		}

		return processed;
	}

	public GwtMarkdownProcessor registerAsyncPlugins() {
		registerPlugins(new WebSequencePlugin(manager), new IncludePlugin(manager));
		return this;
	}

	public HandlerRegistration addPluginContentReadyHandler(PluginContentReadyEventHandler handler) {
		return manager.addHandler(PluginContentReadyEventHandler.TYPE, handler);
	}
}
