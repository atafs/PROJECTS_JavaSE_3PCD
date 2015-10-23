package enums;

import log.LogMessage;

public enum ContactState {
	// CONSTANTS
	POR_ENVIAR("Mensagem Nao Enviada Ainda..."), ENVIADO("Mensagem Enviada!!");
	
	// ATTRIBUTES
	private final String text;
	private static LogMessage logger = new LogMessage();

	// CONSTRUCTOR
	private ContactState(final String text) {
		this.text = text;
	}
	
	// TOSTRING
	@Override
	public String toString() {
		return text;
	}
	
	/** SELECT ACTION */
	public static void selecionaAccaoMensagem(ContactState estado) {
		try {
			switch (estado) {
			case POR_ENVIAR:
				//...
				break;
					
			case ENVIADO:
				//...
				break;

			default:
				logger.getLog().info("THE APP WENT TO DEFAUT VALUE IN CONTACTO_ESTADO...");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}