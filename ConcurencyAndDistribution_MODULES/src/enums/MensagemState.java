package enums;

import log.LogMessage;

public enum MensagemState {
	// CONSTANTS
	POR_ENVIAR("Mensagem Nao Enviada Ainda..."), ENVIADO("Mensagem Enviada!!");
	
	// ATTRIBUTES
	private final String text;
	private static LogMessage logger = new LogMessage();

	// CONSTRUCTOR
	private MensagemState(final String text) {
		this.text = text;
	}
	
	// TOSTRING
	@Override
	public String toString() {
		return text;
	}
	
	/** SELECT ACTION */
	public static void selecionaAccaoMensagem(MensagemState estado) {
		try {
			switch (estado) {
			case POR_ENVIAR:
				//...
				break;
					
			case ENVIADO:
				//...
				break;

			default:
				logger.getLog().info("THE APP WENT TO DEFAUT VALUE IN MENSAGEM_ESTADO...");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}