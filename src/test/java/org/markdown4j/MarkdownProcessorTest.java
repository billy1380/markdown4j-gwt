//
//  MarkdownProcessorTest.java
//  markdown4j-gwt
//
//  Created by William Shakour (billy1380) on 2 Jun 2015.
//  Copyright © 2015 WillShex Limited. All rights reserved.
//
package org.markdown4j;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.github.rjeschke.txtmark.Decorator;
import com.github.rjeschke.txtmark.EmojiEmitter;

/**
 * @author billy1380
 *
 */
public class MarkdownProcessorTest {

	AbstractMarkdownProcessor test = new AbstractMarkdownProcessor() {

		@Override
		protected void registerPlugins() {
		}

		@Override
		protected EmojiEmitter emojiEmitter() {
			return new EmojiEmitter() {

				@Override
				public void emitEmoji(StringBuilder out, String name, Decorator decorator) {
					out.append("£" + name + "£");
				}
			};
		}
	};

	@Test
	public void emojiTest() throws IOException {
		String markup = test.process("This is a test test :grin: test");

		assertEquals("<p>This is a test test £:grin:£ test</p>\n", markup);
	}

	@Test
	public void emojiBugTest() throws IOException {
		String markup = test.process("This is\\: a test test :grin: test");

		assertEquals("<p>This is: a test test £:grin:£ test</p>\n", markup);
	}
}
