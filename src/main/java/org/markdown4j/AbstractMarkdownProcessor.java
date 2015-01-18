package org.markdown4j;

import java.io.IOException;
import java.io.Reader;

import com.github.rjeschke.txtmark.Configuration;
import com.github.rjeschke.txtmark.Configuration.Builder;
import com.github.rjeschke.txtmark.EmojiEmitter;
import com.github.rjeschke.txtmark.Processor;
import com.github.rjeschke.txtmark.SpanEmitter;

public abstract class AbstractMarkdownProcessor {

	private Builder builder;
	private ExtDecorator decorator;

	protected abstract void registerPlugins();

	protected EmojiEmitter emojiEmitter() {
		return null;
	}

	protected SpanEmitter spanEmitter() {
		return null;
	}

	protected CodeBlockEmitter codeBlockEmitter() {
		return new CodeBlockEmitter();
	}

	public AbstractMarkdownProcessor() {
		this.builder = builder();
		registerPlugins();
	}

	protected Builder builder() {
		decorator = new ExtDecorator();

		return Configuration.builder().forceExtentedProfile().convertNewline2Br().registerPlugins(new YumlPlugin()).setDecorator(decorator)
				.setCodeBlockEmitter(codeBlockEmitter()).setSpecialLinkEmitter(spanEmitter()).setEmojiEmitter(emojiEmitter());
	}

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
