package enums;

public enum ServidorEstado {
	LIGADO("Ligado - OnLine"), DESLIGADO("Desligado - OffLine");
	
	// ATTRIBUTES
	private final String text;

	// CONSTRUCTOR
	private ServidorEstado(final String text) {
		this.text = text;
	}
	
	// TOSTRING
	@Override
	public String toString() {
		return text;
	}
}