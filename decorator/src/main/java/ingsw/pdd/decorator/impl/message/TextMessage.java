package ingsw.pdd.decorator.impl.message;

public class TextMessage implements IMessage {

	private String content;

	public TextMessage() {

	}

	/** Añadir constructor de clase con parámetro content de tipo String */
	
	public TextMessage(String content) {
		this.content=content;
	}
	
	@Override
	public IMessage processMessage() {

		return this;
	}

	@Override

	public String getContent() {
		return content;

	}

	@Override
	public void setContent(String content) {

		this.content = content;
	}
	
	
	
	
}