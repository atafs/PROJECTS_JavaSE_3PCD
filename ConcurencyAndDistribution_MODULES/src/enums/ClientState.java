package enums;

import log.LogMessage;

public enum ClientState {
	LIGADO("Ligado - OnLine"), DESLIGADO("Desligado - OffLine");
	
	// ATTRIBUTES
	private final String text;
	private static LogMessage logger = new LogMessage();

	// CONSTRUCTOR
	private ClientState(final String text) {
		this.text = text;
	}
	
	// TOSTRING
	@Override
	public String toString() {
		return text;
	}
	
	/** SELECT ACTION */
	public static void selecionaAccaoMensagem(ClientState estado) {
		try {
			switch (estado) {
			case LIGADO:
				//...
				break;
					
			case DESLIGADO:
				//...
				break;

			default:
				logger.getLog().info("THE APP WENT TO DEFAUT VALUE IN CLIENTE_ESTADO...");
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}