//
//  ResourceGenerator.java
//  markdown4j-gwt
//
//  Created by William Shakour (billy1380) on 18 Jan 2015.
//  Copyright © 2015 SPACEHOPPER STUDIOS Ltd. All rights reserved.
//
package org.markdown4j.gwt.generator;

import java.net.URL;

import org.markdown4j.client.Markdown;
import org.markdown4j.server.MarkdownProcessor;

import com.google.gwt.core.ext.TreeLogger;
import com.google.gwt.core.ext.UnableToCompleteException;
import com.google.gwt.core.ext.typeinfo.JMethod;
import com.google.gwt.dev.util.Util;
import com.google.gwt.resources.ext.AbstractResourceGenerator;
import com.google.gwt.resources.ext.ResourceContext;
import com.google.gwt.resources.ext.ResourceGeneratorUtil;
import com.google.gwt.user.rebind.SourceWriter;
import com.google.gwt.user.rebind.StringSourceWriter;

/**
 * @author William Shakour (billy1380)
 *
 */
public class MarkdownResourceGenerator extends AbstractResourceGenerator {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.google.gwt.resources.ext.AbstractResourceGenerator#createAssignment(com.google.gwt.core.ext.TreeLogger,
	 * com.google.gwt.resources.ext.ResourceContext, com.google.gwt.core.ext.typeinfo.JMethod)
	 */
	@Override
	public String createAssignment(TreeLogger logger, ResourceContext context, JMethod method) throws UnableToCompleteException {
		URL[] resources = ResourceGeneratorUtil.findResources(logger, context, method);

		if (resources.length != 1) {
			logger.log(TreeLogger.ERROR, "Exactly one resource must be specified", null);
			throw new UnableToCompleteException();
		}

		URL resource = resources[0];
		String processedMarkdown = null;
		try {
			processedMarkdown = new MarkdownProcessor().process(Util.readURLAsString(resource));
		} catch (Exception e) {
			logger.log(TreeLogger.ERROR, "Error processing markdown", e);
			throw new UnableToCompleteException();
		}

		SourceWriter sw = new StringSourceWriter();
		// Convenience when examining the generated code.
		if (!AbstractResourceGenerator.STRIP_COMMENTS) {
			sw.println("// " + resource.toExternalForm());
		}
		sw.println("new " + Markdown.class.getCanonicalName() + "() {");
		sw.indent();
		sw.println("public String asString() { return \"" + processedMarkdown.replace("\"", "\\\"").replace("\n", "\\n\"\n + \"") + "\"; }");
		sw.println("public String getName() { return \"" + method.getName() + "\"; }");
		sw.outdent();
		sw.println("}");

		return sw.toString();
	}

}
