//
//  Emoji.java
//  markdown4j-gwt
//
//  Created by William Shakour (billy1380) on 18 Jan 2015.
//  Copyright © 2015 SPACEHOPPER STUDIOS Ltd. All rights reserved.
//
package org.markdown4j.client;

import com.github.rjeschke.txtmark.Decorator;
import com.github.rjeschke.txtmark.EmojiEmitter;
import com.github.rjeschke.txtmark.MarkdownUtils;
import com.google.gwt.safehtml.shared.SafeUri;

/**
 * @author William Shakour (billy1380)
 *
 */
public class GwtEmojiEmitter implements EmojiEmitter {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.github.rjeschke.txtmark.EmojiEmitter#emitEmoji(java.lang.StringBuilder, java.lang.String, com.github.rjeschke.txtmark.Decorator)
	 */
	@Override
	public void emitEmoji(StringBuilder out, String name, Decorator decorator) {
		SafeUri safeLink = emoji.gwt.emoji.Emoji.get().safeUri(name);
		String link;
		String comment;
		if (safeLink != null && (link = safeLink.asString()).length() != 0) {
			comment = name + " Emoji";

			decorator.openImage(out);
			out.append(" class=\"emoji\" src=\"");
			MarkdownUtils.appendValue(out, link, 0, link.length());
			out.append("\" alt=\"");
			MarkdownUtils.appendValue(out, name, 0, name.length());
			out.append('"');
			if (comment != null) {
				out.append(" title=\"");
				MarkdownUtils.appendValue(out, comment, 0, comment.length());
				out.append('"');
			}
			out.append(" />");
		} else {
			out.append(name);
		}
	}

}
