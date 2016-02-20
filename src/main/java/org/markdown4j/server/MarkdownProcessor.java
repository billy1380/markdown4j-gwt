//
//  MarkdownProcessor.java
//  markdown4j-gwt
//
//  Created by William Shakour (billy1380) on 11 Jan 2015.
//  Copyright © 2015 WillShex Limited. All rights reserved.
//
package org.markdown4j.server;

import org.markdown4j.AbstractMarkdownProcessor;

import com.github.rjeschke.txtmark.Decorator;
import com.github.rjeschke.txtmark.EmojiEmitter;
import com.github.rjeschke.txtmark.MarkdownUtils;

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
		return new EmojiEmitter() {

			@Override
			public void emitEmoji (StringBuilder out, String name,
					Decorator decorator) {
				String link = "http://www.emoji.org/" + name;
				String comment = name + " emoji";

				decorator.openImage(out, link, name);
				out.append(" class=\"emoji\" src=\"");
				MarkdownUtils.appendValue(out, link, 0, link.length());
				out.append("\" alt=\"");
				MarkdownUtils.appendValue(out, name, 0, name.length());
				out.append('"');
				if (comment != null) {
					out.append(" title=\"");
					MarkdownUtils
							.appendValue(out, comment, 0, comment.length());
					out.append('"');
				}
				out.append(" />");
			}
		};
	}

}
