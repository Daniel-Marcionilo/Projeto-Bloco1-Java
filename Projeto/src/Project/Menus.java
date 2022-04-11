package Project;

import java.util.Scanner;

public class Menus {
	
	public static void limparTela() {
		for (int cont = 0; cont < 50; cont++) {
			System.out.println("");
		}
	}
	
	Camaleao tart = new Camaleao();

	int opcaoMenuPrincipal, opcao;

	Scanner leia = new Scanner(System.in);

	public void main() {
		System.out.println(ConsoleColors.ORANGE + "BEM-VINDOS AO " + ConsoleColors.BANANA_YELLOW + "PET"
				+ ConsoleColors.LIGHT_BLUE + " SHOP" + ConsoleColors.GREEN_BRIGHT + " NUKKlES!!!"
				+ ConsoleColors.RESET);
		do {
			System.out.println();
			System.out.println(" ____________________________");
			System.out.println("| O que deseja fazer?        |");
			System.out.println("|                            |");
			System.out.println("| 1 - Cadastrar animal       |");
			System.out.println("| 2 - Visualizar Informações |");
			System.out.println("| 3 - Checklist do animal    |");
			System.out.println("| 4 - Montar pedido          |");
			System.out.println("| 0 - Encerrar Programa      |");
			System.out.println("|____________________________|");
			
			System.out.print("\nDigite uma das opções acima: ");
			opcaoMenuPrincipal = leia.nextInt();

			if (opcaoMenuPrincipal == 1) {
				System.out.println(" ___________________________________");
				System.out.println("| Quais informações deseja inserir? |");
				System.out.println("|                                   |");
				System.out.println("| 1 - Dono                          |");
				System.out.println("| 2 - Animal                        |");
				System.out.println("| 3 - Ambos                         |");
				System.out.println("| 0 - Cancelar                      |");
				System.out.println("|___________________________________|");
				
				System.out.print("\nDigite uma das opções acima: ");
				opcao = leia.nextInt();
				if (opcao == 1) {
					tart.odono();
					if(tart.erro == true) {
						System.out.println("");
					}
					else {
						System.out.println("\n" + ConsoleColors.GREEN_BOLD + "Informações cadastradas com sucesso!" + ConsoleColors.RESET);
					}
				} else if (opcao == 2) {
					tart.oanimal();
					if(tart.erro == true) {
						System.out.println("");
					}else {
						System.out.println("\n" + ConsoleColors.GREEN_BOLD + "Informações cadastradas com sucesso!" + ConsoleColors.RESET);
					}
				} else if (opcao == 3) {
					tart.odono();
					tart.oanimal();
					System.out.println("\n" + ConsoleColors.GREEN_BOLD + "Informações cadastradas com sucesso!" + ConsoleColors.RESET);

				}
			} else if (opcaoMenuPrincipal == 2) {
				
				System.out.println(" ______________________________________");
				System.out.println("| Quais informações deseja visualizar? |");
				System.out.println("|                                      |");
				System.out.println("| 1 - Dono                             |");
				System.out.println("| 2 - Animal                           |");
				System.out.println("| 3 - Ambos                            |");
				System.out.println("| 4 - Procedimento animal              |");
				System.out.println("| 5 - Verificar animais permitidos     |");
				System.out.println("| 0 - Cancelar                         |");
				System.out.println("|______________________________________|");
				
				System.out.print("\nDigite uma das opções acima: ");
				opcao = leia.nextInt();
				
				if (opcao == 1) {
					tart.statusdono();
				} else if (opcao == 2) {
					tart.statusanimal();
				} else if (opcao == 3) {
					tart.statusdono();
					System.out.println();
					tart.statusanimal();
				} else if (opcao == 4) {
					tart.statusprocedimento();
				}
				else if (opcao == 5) {
					tart.verificarAnimais();
				}
				System.out.println();
			} else if (opcaoMenuPrincipal == 3) {
				tart.oprocedimento();
				
			} else if(opcaoMenuPrincipal == 4){
				tart.caixa();
			}
		} while (opcaoMenuPrincipal != 0);
		System.out.println("\nPrograma encerrado.");
	}
}
