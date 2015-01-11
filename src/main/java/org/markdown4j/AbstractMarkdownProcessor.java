package org.markdown4j;

import java.io.IOException;
import java.io.Reader;

import com.github.rjeschke.txtmark.Configuration;
import com.github.rjeschke.txtmark.Configuration.Builder;
import com.github.rjeschke.txtmark.Processor;

public abstract class AbstractMarkdownProcessor {

	private Builder builder;
	private ExtDecorator decorator;

	public AbstractMarkdownProcessor() {
		this.builder = builder();
		registerPlugins();
	}

	protected Builder builder() {
		decorator = new ExtDecorator();

		return Configuration.builder().forceExtentedProfile().convertNewline2Br().registerPlugins(new YumlPlugin()).setDecorator(decorator)
				.setCodeBlockEmitter(new CodeBlockEmitter());
	}

	protected abstract void registerPlugins();

	public AbstractMarkdownProcessor registerPlugins(Plugin... plugins) {
		builder.registerPlugins(plugins);
		return this;
	}

	public AbstractMarkdownProcessor setDecorator(ExtDecorator decorator) {
		this.decorator = decorator;
		builder.setDecorator(decorator);
		return this;
	}

	public AbstractMarkdownProcessor addHtmlAttribute(String name, String value, String... tags) {
		decorator.addHtmlAttribute(name, value, tags);
		return this;
	}

	public AbstractMarkdownProcessor addStyleClass(String styleClass, String... tags) {
		decorator.addStyleClass(styleClass, tags);
		return this;
	}

	public String process(Reader reader) throws IOException {
		return Processor.process(reader, builder.build());
	}

	public String process(String input) throws IOException {
		return Processor.process(input, builder.build());
	}

}
