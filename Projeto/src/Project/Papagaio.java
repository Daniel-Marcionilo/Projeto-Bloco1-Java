package Project;
public class Papagaio extends Animais{
	
	private String corDasAsas;
	private int qtdeDedos;
	private int tamBico;

	public String getCorDasAsas() {
		return corDasAsas;
	}

	public void setCorDasAsas(String corDasAsas) {
		this.corDasAsas = corDasAsas;
	}

	public int getQtdeDedos() {
		return qtdeDedos;
	}

	public void setQtdeDedos(int qtdeDedos) {
		this.qtdeDedos = qtdeDedos;
	}

	public int getTamBico() {
		return tamBico;
	}

	public void setTamBico(int tamBico) {
		this.tamBico = tamBico;
	}
	
	public void falar() {
		System.out.println("\nPapagaio falou: Palmeiras não tem mundial!");
	}
	
	@Override
	public void permitirAnimais() {
		// TODO Auto-generated method stub
		
	}

	public void imprimirPapagaio() {
		System.out.println("\n");
		System.out.println(ConsoleColors.GREEN_BOLD + "" 
				+ "       .-~~``~~-,\r\n"
				+ "      (          \\\r\n"
				+ "   .--'`-.__,     \\\r\n"
				+ "  /      |\\O/      |\r\n"
				+ " |,      /         |\r\n"
				+ " \\   ,--`\\         |\r\n"
				+ "  `.(   /          \\\r\n"
				+ "       /            \\\r\n"
				+ "      / .  ;    :.   \\\r\n"
				+ "     /__;   \\   | \\   \\\r\n"
				+ "     /   '. |\\_ /-.'-._\\\r\n"
				+ "    |      `   `        \\\r\n"
				+ "    |    /               \\\r\n"
				+ "    |    |                |\r\n"
				+ "    |    |                \\\r\n"
				+ "    \\    \\                 |\r\n"
				+ "     \\    |  |   |   \\     \\\r\n"
				+ "      \\   \\  \\   \\    \\     |\r\n"
				+ "       '.  \\  \\  ' \\   \\     \\\r\n"
				+ "         \\  \\  `\\   `\\  `\\    \\\r\n"
				+ "          |  `\\  `\\   `.  '.   \\\r\n"
				+ "           \\   `-. '._  '-. '._/\\\r\n"
				+ "            |     \\-._;-._ '-._  \\\r\n"
				+ "            \\      `\\     `--` `--\\\r\n"
				+ "             ;_      `-.           |\r\n"
				+ "~==~==jgs==~,-.-.-'`;'=~=-.,_   __/=~=~=~~=\r\n"
				+ "  =_ = -_ -( ( ( .-`( ( ( .-``\"`-_ = - _ -\r\n"
				+ "- -   =   - ` ` ` _= ` ` `   =  -  -    =\r\n"
				+ "~~==~=~~==~=~~=~~=~=~==~~=~~==~~=~~=~~~===~~\r\n"
				+ "                         \\ . \\  . '|\r\n"
				+ "                          \\   . .' /\r\n"
				+ "                           '.   \\.'|\r\n"
				+ "                             '-.__/" + ConsoleColors.RESET);
	}
}
