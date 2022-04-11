package Project;
public class Camaleao extends Animais{
	
	private double tamLingua;
	
	public double getTamLingua() {
		return tamLingua;
	}

	public void setTamLingua(double tamLingua) {
		this.tamLingua = tamLingua;
	}

	
	public void subirNaArvore() {
		System.out.println("\nEscalando a árvore lentamente...");
	}
	
	public void imprimirCamaleao() {
		
		System.out.println("\n");
		System.out.println(ConsoleColors.YELLOW_BOLD + ""
				+ "    _.-~~-.__\r\n"
				+ " _-~ _-=-_   ''-,,\r\n"
				+ "('___ ~~~   0     ~''-_,,,,,,,,,,,,,,,,\r\n"
				+ " \\~~~~~~--'                            '''''''--,,,,\r\n"
				+ "  ~`-,_      ()                                     '''',,,\r\n"
				+ "       '-,_      \\                           /             '', _~/|\r\n"
				+ "  ,.       \\||/~--\\ \\_________              / /______...---.  ;  /\r\n"
				+ "  \\ ~~~~~~~~~~~~~  \\ )~~------~`~~~~~~~~~~~( /----         /,'/ /\r\n"
				+ "   |   -           / /                      \\ \\           /;/  /\r\n"
				+ "  / -             / /                        / \\         /;/  / -.\r\n"
				+ " /         __.---/  \\__                     /, /|       |:|    \\  \\\r\n"
				+ "/_.~`-----~      \\.  \\ ~~~~~~~~~~~~~---~`---\\\\\\\\ \\---__ \\:\\    /  /\r\n"
				+ "                  `\\\\\\`                     ' \\\\' '    --\\'\\, /  /\r\n"
				+ "                                               '\\,        ~-_'''\"" + ConsoleColors.RESET);
	}

	@Override
	public void permitirAnimais() {
		// TODO Auto-generated method stub
		
	}
}
