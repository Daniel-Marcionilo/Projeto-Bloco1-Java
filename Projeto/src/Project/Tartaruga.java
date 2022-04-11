package Project;
public class Tartaruga extends Animais{
	
	private double espessura;
	private boolean levantada_abaixada;
	
	public double getEspessura() {
		return espessura;
	}

	public void setEspessura(double espessura) {
		this.espessura = espessura;
	}

	public boolean isLevantada_abaixada() {
		return levantada_abaixada;
	}

	public void setLevantada_abaixada(boolean levantada_abaixada) {
		this.levantada_abaixada = levantada_abaixada;
	}
	
	public void nadar() {
		System.out.println("\nContinue a nadar...");
	}
	
	@Override
	public void permitirAnimais() {
		// TODO Auto-generated method stub
		
	}
	
	public void imprimirTartaruga() {
		System.out.println("\n");
		System.out.println(ConsoleColors.CYAN_BOLD + "                            ___-------___\r\n"
				+ "                         _-~~             ~~-_\r\n"
				+ "                      _-~                    /~-_\r\n"
				+ "   /^\\__/^\\         /~  \\                   /    \\\r\n"
				+ " /|  O|| O|        /      \\_______________/        \\\r\n"
				+ "| |___||__|      /       /                \\          \\\r\n"
				+ "|          \\    /      /                    \\          \\\r\n"
				+ "|   (_______) /______/                        \\_________ \\\r\n"
				+ "|         / /         \\                      /            \\\r\n"
				+ " \\         \\^\\\\         \\                  /               \\     /\r\n"
				+ "   \\         ||           \\______________/      _-_       //\\__//\r\n"
				+ "     \\       ||------_-~~-_ ------------- \\ --/~   ~\\    || __/\r\n"
				+ "       ~-----||====/~     |==================|       |/~~~~~\r\n"
				+ "        (_(__/  ./     /                    \\_\\      \\.\r\n"
				+ "               (_(___/                         \\_____)_)" + ConsoleColors.RESET);
	}
}
