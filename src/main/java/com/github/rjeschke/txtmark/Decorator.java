/*
 * Copyright (C) 2011 René Jeschke <rene_jeschke@yahoo.de>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.rjeschke.txtmark;

/**
 * Decorator interface.
 * 
 * @author René Jeschke <rene_jeschke@yahoo.de>
 */
public interface Decorator
{
    /**
     * Called when a paragraph is opened.
     * 
     * <p>
     * Default implementation is:
     * </p>
     * 
     * <pre>
     * <code>out.append("&lt;p>");</code>
     * </pre>
     * 
     * @param out
     *            The StringBuilder to write to.
     * @param block 
     */
    public void openParagraph(final StringBuilder out, Block block);

    /**
     * Called when a paragraph is closed.
     * 
     * <p>
     * Default implementation is:
     * </p>
     * 
     * <pre>
     * <code>out.append("&lt;/p>\n");</code>
     * </pre>
     * 
     * @param out
     *            The StringBuilder to write to.
     * @param block 
     */
    public void closeParagraph(final StringBuilder out, Block block);

    /**
     * Called when a blockquote is opened.
     * 
     * Default implementation is:
     * 
     * <pre>
     * <code>out.append("&lt;blockquote>");</code>
     * </pre>
     * 
     * @param out
     *            The StringBuilder to write to.
     * @param block 
     */
    public void openBlockquote(final StringBuilder out, Block block);

    /**
     * Called when a blockquote is closed.
     * 
     * <p>
     * Default implementation is:
     * </p>
     * 
     * <pre>
     * <code>out.append("&lt;/blockquote>\n");</code>
     * </pre>
     * 
     * @param out
     *            The StringBuilder to write to.
     * @param block 
     */
    public void closeBlockquote(final StringBuilder out, Block block);

    /**
     * Called when a code block is opened.
     * 
     * <p>
     * Default implementation is:
     * </p>
     * 
     * <pre>
     * <code>out.append("&lt;pre>&lt;code>");</code>
     * </pre>
     * 
     * @param out
     *            The StringBuilder to write to.
     * @param block 
     */
    public void openCodeBlock(final StringBuilder out, Block block);

    /**
     * Called when a code block is closed.
     * 
     * <p>
     * Default implementation is:
     * </p>
     * 
     * <pre>
     * <code>out.append("&lt;/code>&lt;/pre>\n");</code>
     * </pre>
     * 
     * @param out
     *            The StringBuilder to write to.
     * @param block 
     */
    public void closeCodeBlock(final StringBuilder out, Block block);

    /**
     * Called when a code span is opened.
     * 
     * <p>
     * Default implementation is:
     * </p>
     * 
     * <pre>
     * <code>out.append("&lt;code>");</code>
     * </pre>
     * 
     * @param out
     *            The StringBuilder to write to.
     */
    public void openCodeSpan(final StringBuilder out);

    /**
     * Called when a code span is closed.
     * 
     * <p>
     * Default implementation is:
     * </p>
     * 
     * <pre>
     * <code>out.append("&lt;/code>");</code>
     * </pre>
     * 
     * @param out
     *            The StringBuilder to write to.
     */
    public void closeCodeSpan(final StringBuilder out);

    /**
     * Called when a headline is opened.
     * 
     * <p>
     * <strong>Note:</strong> Don't close the HTML tag!
     * </p>
     * <p>
     * Default implementation is:
     * </p>
     * 
     * <pre>
     * <code> out.append("&lt;h");
     * out.append(level);</code>
     * </pre>
     * 
     * @param out
     *            The StringBuilder to write to.
     */
    public void openHeadline(final StringBuilder out, Block block);

    /**
     * Called when a headline is closed.
     * 
     * <p>
     * Default implementation is:
     * </p>
     * 
     * <pre>
     * <code> out.append("&lt;/h");
     * out.append(level);
     * out.append(">\n");</code>
     * </pre>
     * 
     * @param out
     *            The StringBuilder to write to.
     */
    public void closeHeadline(final StringBuilder out, Block block);

    /**
     * Called when a strong span is opened.
     * 
     * <p>
     * Default implementation is:
     * </p>
     * 
     * <pre>
     * <code>out.append("&lt;strong>");</code>
     * </pre>
     * 
     * @param out
     *            The StringBuilder to write to.
     * @param value 
     */
    public void openStrong(final StringBuilder out, String value);

    /**
     * Called when a strong span is closed.
     * 
     * <p>
     * Default implementation is:
     * </p>
     * 
     * <pre>
     * <code>out.append("&lt;/strong>");</code>
     * </pre>
     * 
     * @param out
     *            The StringBuilder to write to.
     * @param value 
     */
    public void closeStrong(final StringBuilder out, String value);
    
    /**
     * Called when a strike span is opened.
     * 
     * <p>
     * Default implementation is:
     * </p>
     * 
     * <pre>
     * <code>out.append("&lt;s>");</code>
     * </pre>
     * 
     * @param out
     *            The StringBuilder to write to.
     * @param value 
     */
    public void openStrike(final StringBuilder out, String value);

    /**
     * Called when a strike span is closed.
     * 
     * <p>
     * Default implementation is:
     * </p>
     * 
     * <pre>
     * <code>out.append("&lt;/s>");</code>
     * </pre>
     * 
     * @param out
     *            The StringBuilder to write to.
     * @param value 
     */
    public void closeStrike(final StringBuilder out, String value);
    

    /**
     * Called when an emphasis span is opened.
     * 
     * <p>
     * Default implementation is:
     * </p>
     * 
     * <pre>
     * <code>out.append("&lt;em>");</code>
     * </pre>
     * 
     * @param out
     *            The StringBuilder to write to.
     * @param value 
     */
    public void openEmphasis(final StringBuilder out, String value);

    /**
     * Called when an emphasis span is closed.
     * 
     * <p>
     * Default implementation is:
     * </p>
     * 
     * <pre>
     * <code>out.append("&lt;/em>");</code>
     * </pre>
     * 
     * @param out
     *            The StringBuilder to write to.
     * @param value
     */
    public void closeEmphasis(final StringBuilder out, String value);

    /**
     * Called when a superscript span is opened.
     * 
     * <p>
     * Default implementation is:
     * </p>
     * 
     * <pre>
     * <code>out.append("&lt;sup>");</code>
     * </pre>
     * 
     * @param out
     *            The StringBuilder to write to.
     * @param value 
     */
    public void openSuper(final StringBuilder out, String value);

    /**
     * Called when a superscript span is closed.
     * 
     * <p>
     * Default implementation is:
     * </p>
     * 
     * <pre>
     * <code>out.append("&lt;/sup>");</code>
     * </pre>
     * 
     * @param out
     *            The StringBuilder to write to.
     * @param value 
     */
    public void closeSuper(final StringBuilder out, String value);

    /**
     * Called when an ordered list is opened.
     * 
     * <p>
     * Default implementation is:
     * </p>
     * 
     * <pre>
     * <code>out.append("&lt;ol>\n");</code>
     * </pre>
     * 
     * @param out
     *            The StringBuilder to write to.
     * @param block 
     */
    public void openOrderedList(final StringBuilder out, Block block);

    /**
     * Called when an ordered list is closed.
     * 
     * <p>
     * Default implementation is:
     * </p>
     * 
     * <pre>
     * <code>out.append("&lt;/ol>\n");</code>
     * </pre>
     * 
     * @param out
     *            The StringBuilder to write to.
     * @param block 
     */
    public void closeOrderedList(final StringBuilder out, Block block);

    /**
     * Called when an unordered list is opened.
     * 
     * <p>
     * Default implementation is:
     * </p>
     * 
     * <pre>
     * <code>out.append("&lt;ul>\n");</code>
     * </pre>
     * 
     * @param out
     *            The StringBuilder to write to.
     * @param block 
     */
    public void openUnorderedList(final StringBuilder out, Block block);

    /**
     * Called when an unordered list is closed.
     * 
     * <p>
     * Default implementation is:
     * </p>
     * 
     * <pre>
     * <code>out.append("&lt;/ul>\n");</code>
     * </pre>
     * 
     * @param out
     *            The StringBuilder to write to.
     * @param block 
     */
    public void closeUnorderedList(final StringBuilder out, Block block);

    /**
     * Called when a list item is opened.
     * 
     * <p>
     * <strong>Note:</strong> Don't close the HTML tag!
     * </p>
     * <p>
     * Default implementation is:
     * </p>
     * 
     * <pre>
     * <code>out.append("&lt;li");</code>
     * </pre>
     * 
     * @param out
     *            The StringBuilder to write to.
     * @param block 
     */
    public void openListItem(final StringBuilder out, Block block);

    /**
     * Called when a list item is closed.
     * 
     * <p>
     * Default implementation is:
     * </p>
     * 
     * <pre>
     * <code>out.append("&lt;/li>\n");</code>
     * </pre>
     * 
     * @param out
     *            The StringBuilder to write to.
     * @param block 
     */
    public void closeListItem(final StringBuilder out, Block block);

    /**
     * Called when a horizontal ruler is encountered.
     * 
     * <p>
     * Default implementation is:
     * </p>
     * 
     * <pre>
     * <code>out.append("&lt;hr />\n");</code>
     * </pre>
     * 
     * @param out
     *            The StringBuilder to write to.
     * @param block 
     */
    public void horizontalRuler(final StringBuilder out, Block block);

    /**
     * Called when a link is opened.
     * 
     * <p>
     * <strong>Note:</strong> Don't close the HTML tag!
     * </p>
     * <p>
     * Default implementation is:
     * </p>
     * 
     * <pre>
     * <code>out.append("&lt;a");</code>
     * </pre>
     * 
     * @param out
     *            The StringBuilder to write to.
     * @param title 
     * @param link 
     */
    public void openLink(final StringBuilder out, String link, String title);

    /**
     * Called when an image is opened.
     * 
     * <p>
     * <strong>Note:</strong> Don't close the HTML tag!
     * </p>
     * <p>
     * Default implementation is:
     * </p>
     * 
     * <pre>
     * <code>out.append("&lt;img");</code>
     * </pre>
     * 
     * @param out
     *            The StringBuilder to write to.
     * @param title 
     * @param link 
     */
    public void openImage(final StringBuilder out, String link, String title);
}
