package Project;

import java.util.Scanner;

public class Menus {
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
			System.out.println("| 5 - Encerrar Programa      |");
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
				System.out.println("| 4 - Cancelar                      |");
				System.out.println("|___________________________________|");
				
				System.out.print("\nDigite uma das opções acima: ");
				opcao = leia.nextInt();
				if (opcao == 1) {
					tart.odono();
					System.out.println("\nInformações cadastradas com sucesso!");
				} else if (opcao == 2) {
					tart.oanimal();
					System.out.println("\nInformações cadastradas com sucesso!");

				} else if (opcao == 3) {
					tart.odono();
					System.out.println("\nInformações cadastradas com sucesso!");
					tart.oanimal();
					System.out.println("\nInformações cadastradas com sucesso!");

				}
			} else if (opcaoMenuPrincipal == 2) {
				System.out.println("1- Dono \n" + "2-Animal \n" + "3-Ambos \n" + "4-Procedimento animal \n" + "5-Cancelar");
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
				System.out.println();
			} else if (opcaoMenuPrincipal == 3) {
				tart.oprocedimento();
				
			} else if(opcaoMenuPrincipal == 4){
				tart.caixa();
			}
		} while (opcaoMenuPrincipal != 5);
		System.out.println("Programa encerrado.");
	}
}
