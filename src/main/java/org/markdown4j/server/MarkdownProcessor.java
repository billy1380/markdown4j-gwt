//
//  MarkdownProcessor.java
//  markdown4j-gwt
//
//  Created by William Shakour (billy1380) on 11 Jan 2015.
//  Copyright © 2015 WillShex Limited. All rights reserved.
//
package org.markdown4j.server;

import org.markdown4j.AbstractMarkdownProcessor;
import org.markdown4j.client.shared.DefaultEmojiEmitter;

import com.github.rjeschke.txtmark.EmojiEmitter;

/**
 * @author William Shakour (billy1380)
 *
 */
public class MarkdownProcessor extends AbstractMarkdownProcessor {

	/* (non-Javadoc)
	 * 
	 * @see org.markdown4j.AbstractMarkdownProcessor#registerPlugins() */
	@Override
	protected void registerPlugins () {}

	@Override
	protected EmojiEmitter emojiEmitter () {
		return new DefaultEmojiEmitter();
	}

}
