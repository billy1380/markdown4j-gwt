package org.markdown4j;

import java.io.IOException;
import java.io.Reader;

import org.markdown4j.event.PluginContentReadyEventHandler;

import com.github.rjeschke.txtmark.Configuration;
import com.github.rjeschke.txtmark.Configuration.Builder;
import com.github.rjeschke.txtmark.Processor;
import com.google.gwt.event.shared.HandlerManager;

public class Markdown4jProcessor {

	private HandlerManager manager = new HandlerManager(this);
	private Builder builder;
	private ExtDecorator decorator;

	public Markdown4jProcessor() {
		this.builder = builder();
	}

	private Builder builder() {
		decorator = new ExtDecorator();

		return Configuration.builder().forceExtentedProfile().registerPlugins(new YumlPlugin(), new WebSequencePlugin(manager)/* , new IncludePlugin(manager) */)
				.convertNewline2Br().setDecorator(decorator).setCodeBlockEmitter(new CodeBlockEmitter());
	}

	public Markdown4jProcessor registerPlugins(Plugin... plugins) {
		builder.registerPlugins(plugins);
		return this;
	}

	public Markdown4jProcessor setDecorator(ExtDecorator decorator) {
		this.decorator = decorator;
		builder.setDecorator(decorator);
		return this;
	}

	public Markdown4jProcessor addHtmlAttribute(String name, String value, String... tags) {
		decorator.addHtmlAttribute(name, value, tags);
		return this;
	}

	public Markdown4jProcessor addStyleClass(String styleClass, String... tags) {
		decorator.addStyleClass(styleClass, tags);
		return this;
	}

	public String process(Reader reader) throws IOException {
		return Processor.process(reader, builder.build());
	}

	public String process(String input) throws IOException {
		return Processor.process(input, builder.build());
	}

	public void addPluginContentReadyHandler(PluginContentReadyEventHandler handler) {
		manager.addHandler(PluginContentReadyEventHandler.TYPE, handler);
	}
}
