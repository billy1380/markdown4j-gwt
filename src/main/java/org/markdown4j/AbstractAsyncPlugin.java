//
//  AbstractAsyncPlugin.java
//  markdown4j-gwt
//
//  Created by William Shakour (billy1380) on 3 Jan 2015.
//  Copyright © 2015 SPACEHOPPER STUDIOS Ltd. All rights reserved.
//
package org.markdown4j;

import com.google.gwt.event.shared.HandlerManager;

/**
 * @author William Shakour (billy1380)
 *
 */
public abstract class AbstractAsyncPlugin extends Plugin {
	protected HandlerManager manager;

	public AbstractAsyncPlugin(String idPlugin, HandlerManager manager) {
		super(idPlugin);
		this.manager = manager;
	}

}
