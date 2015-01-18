//
//  Markdown.java
//  markdown4j-gwt
//
//  Created by William Shakour (billy1380) on 18 Jan 2015.
//  Copyright © 2015 SPACEHOPPER STUDIOS Ltd. All rights reserved.
//
package org.markdown4j.client;

import org.markdown4j.gwt.generator.MarkdownResourceGenerator;

import com.google.gwt.resources.client.ResourcePrototype;
import com.google.gwt.resources.ext.ResourceGeneratorType;
import com.google.gwt.safehtml.shared.SafeHtml;

/**
 * @author William Shakour (billy1380)
 *
 */
@ResourceGeneratorType(MarkdownResourceGenerator.class)
public interface Markdown extends ResourcePrototype, SafeHtml {}
