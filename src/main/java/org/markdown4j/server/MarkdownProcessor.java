//
//  MarkdownProcessor.java
//  markdown4j-gwt
//
//  Created by William Shakour (billy1380) on 11 Jan 2015.
//  Copyright © 2015 SPACEHOPPER STUDIOS Ltd. All rights reserved.
//
package org.markdown4j.server;

import org.markdown4j.AbstractMarkdownProcessor;

/**
 * @author William Shakour (billy1380)
 *
 */
public class MarkdownProcessor extends AbstractMarkdownProcessor {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.markdown4j.AbstractMarkdownProcessor#registerPlugins()
	 */
	@Override
	protected void registerPlugins() {
		registerPlugins(new IncludePlugin(), new WebSequencePlugin());
	}

}
