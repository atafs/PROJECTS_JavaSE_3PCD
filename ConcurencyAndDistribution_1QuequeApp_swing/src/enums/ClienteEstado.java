package enums;

public enum ClienteEstado {
	LIGADO("Ligado - OnLine"), DESLIGADO("Desligado - OffLine");
	
	// ATTRIBUTES
	private final String text;

	// CONSTRUCTOR
	private ClienteEstado(final String text) {
		this.text = text;
	}
	
	// TOSTRING
	@Override
	public String toString() {
		return text;
	}
}