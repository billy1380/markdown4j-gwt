//
//  GwtMarkdownProcessor.java
//  markdown4j-gwt
//
//  Created by William Shakour (billy1380) on 11 Jan 2015.
//  Copyright © 2015 SPACEHOPPER STUDIOS Ltd. All rights reserved.
//
package org.markdown4j.client;

import java.io.IOException;
import java.io.Reader;

import org.markdown4j.AbstractMarkdownProcessor;
import org.markdown4j.client.event.PluginContentReadyEventHandler;

import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.event.shared.HandlerRegistration;

/**
 * @author William Shakour (billy1380)
 *
 */
public class MarkdownProcessor extends AbstractMarkdownProcessor {
	private HandlerManager manager;

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

	public String process(Reader reader) {
		String processed = null;
		try {
			processed = super.process(reader);
		} catch (IOException ioe) {
			// this is very unlikely - but better to throw as runtime exception than getting lost
			throw new RuntimeException(ioe);
		}

		return processed;
	}

	public HandlerRegistration addPluginContentReadyHandler(PluginContentReadyEventHandler handler) {
		return manager.addHandler(PluginContentReadyEventHandler.TYPE, handler);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.markdown4j.AbstractMarkdownProcessor#registerPlugins()
	 */
	@Override
	protected void registerPlugins() {
		if (manager == null) {
			manager = new HandlerManager(this);
		}

		registerPlugins(new WebSequencePlugin(manager), new IncludePlugin(manager));
	}
}
