//
//  EmojiEmitter.java
//  markdown4j-gwt
//
//  Created by William Shakour (billy1380) on 18 Jan 2015.
//  Copyright © 2015 SPACEHOPPER STUDIOS Ltd. All rights reserved.
//
package com.github.rjeschke.txtmark;

/**
 * @author William Shakour (billy1380)
 *
 */
public interface EmojiEmitter {
	/**
	 * Emits an img with an emoji element.
	 * 
	 * @param out
	 *            The StringBuilder to append to.
	 * @param content
	 *            The emoji name.
	 * 
	 * @param decorator
	 *            The decorator in case we need to emit markup
	 */
	public void emitEmoji(StringBuilder out, String name, Decorator decorator);
}
