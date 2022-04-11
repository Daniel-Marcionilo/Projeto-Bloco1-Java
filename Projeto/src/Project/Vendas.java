package Project;

import java.util.Scanner;

public class Vendas {

	public static int getQtdeBrinquedos() {
		return qtdeBrinquedos;
	}

	public static void setQtdeBrinquedos(int qtdeBrinquedos) {
		Vendas.qtdeBrinquedos = qtdeBrinquedos;
	}

	private static double comida = 45.00, brinquedos = 5.00;
	private static int qtdeBrinquedos = 0, qtdeComida = 0;

	public static int getQtdeComida() {
		return qtdeComida;
	}

	public static void setQtdeComida(int qtdeComida) {
		Vendas.qtdeComida = qtdeComida;
	}

	public static double getComida() {
		return comida;
	}

	public static void setComida(double comida) {
		Vendas.comida = comida;
	}

	public static double getBrinquedos() {
		return brinquedos;
	}

	public static void setBrinquedos(double brinquedos) {
		Vendas.brinquedos = brinquedos;
	}

	public static Scanner getLeitor() {
		return leitor;
	}

	public static void setLeitor(Scanner leitor) {
		Vendas.leitor = leitor;
	}

	private static Scanner leitor = new Scanner(System.in);

	private static double calcular(double comidas) {
		return (comidas * getQtdeComida());
	}

	private static double calcular(double comidas, double brinquedos) {
		return ((comidas * getQtdeComida()) + (brinquedos * getQtdeBrinquedos()));
	}

	public static void menuProdutos() {
		double carrinho = 0;

		System.out.println(" _________________________________");
		System.out.println("| Listagem dos Produtos           |");
		System.out.println("|                                 |");
		System.out.println("| 1 - Comida              R$45,00 |");
		System.out.println("| 2 - Brinquedos          R$5,00  |");
		System.out.println("|_________________________________|");

		System.out.print("Deseja incluir Comida? ");
		if (leitor.next().equals("sim")) {
			System.out.print("Digite a quantidade de Comida: ");
			setQtdeComida(leitor.nextInt());
			if (getQtdeComida() > 0) {
				carrinho = carrinho * getQtdeComida();
			}
		}

		System.out.print("\nDeseja incluir Brinquedos? ");
		if (leitor.next().equals("sim") || leitor.next().equals("SIM") || leitor.next().equals("Sim")) {
			System.out.print("Digite a quantidade de Brinquedos: ");
			setQtdeBrinquedos(leitor.nextInt());
			if (getQtdeBrinquedos() > 0) {
				carrinho = carrinho * getQtdeBrinquedos();
			}
		} else {
			carrinho = 0;
		}
			if (getQtdeComida() > 0 && getQtdeBrinquedos() > 0) {
				System.out.println("Total Pedido: " + calcular(comida, brinquedos));
			} else {
				System.out.println("Total Pedido: " + calcular(comida));
			
		}
	}

	/*
	 * public static void main(String[] args) { int opcaoDigitada;
	 * System.out.println("\nMenu Principal");
	 * System.out.println(" _______________________");
	 * System.out.println("| O que deseja fazer?   |");
	 * System.out.println("|                       |");
	 * System.out.println("| 1 - Inserir Pedido    |");
	 * System.out.println("|_______________________|");
	 * 
	 * System.out.print("Digite uma das opções acima: "); opcaoDigitada =
	 * leitor.nextInt();
	 * 
	 * switch (opcaoDigitada) { case 1: menuProdutos(); break; default: break; } }
	 */
}
