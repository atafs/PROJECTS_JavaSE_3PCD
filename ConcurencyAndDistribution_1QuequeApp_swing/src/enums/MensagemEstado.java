package enums;

import interfaces.MensagemInterface;

public enum MensagemEstado {
	// CONSTANTS
	POR_ENVIAR("Mensagem Nao Enviada Ainda..."), ENVIADO("Mensagem Enviada!!");
	
	// ATTRIBUTES
	private final String text;

	// CONSTRUCTOR
	private MensagemEstado(final String text) {
		this.text = text;
	}
	
	// TOSTRING
	@Override
	public String toString() {
		return text;
	}
	
	// OTHER METHODS
	/** */
	public static MensagemInterface selecionaAccaoMensagem(MensagemEstado estado) {
		try {
			switch (estado) {
			case POR_ENVIAR:
				//...
				break;
					
			case ENVIADO:
				//...
				break;

			default:
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}