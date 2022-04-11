package Project;

import java.util.*;

public abstract class Animais implements InterfacePetShop {

	public static void limparTela() {
		for (int cont = 0; cont < 15; cont++) {
			System.out.println("");
		}
	}

	Scanner leia = new Scanner(System.in);
	private String nome, especie, tipo, cuidado, dono, cuidado2, banho2, comer2;
	private String dormir, telefone, cep;
	private byte idade;
	private float peso;
	private long ibama;
	
	public static Papagaio ZecaUrubu = new Papagaio();
	public static Camaleao Rambo = new Camaleao();
	public static Tartaruga Squirtle = new Tartaruga();

	// GETTERS AND SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCuidado() {
		return cuidado;
	}

	public void setCuidado(String cuidado) {
		this.cuidado = cuidado;
	}

	public int getIdade() {
		return idade;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public String getCuidado2() {
		return cuidado2;
	}

	public void setCuidado2(String cuidado2) {
		this.cuidado2 = cuidado2;
	}

	public String getBanho2() {
		return banho2;
	}

	public void setBanho2(String banho2) {
		this.banho2 = banho2;
	}

	public String getComer2() {
		return comer2;
	}

	public void setComer2(String comer2) {
		this.comer2 = comer2;
	}

	public String getDormir() {
		return dormir;
	}

	public void setDormir(String dormir) {
		this.dormir = dormir;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setIdade(byte idade) {
		this.idade = idade;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public long getIbama() {
		return ibama;
	}

	public void setIbama(long ibama) {
		this.ibama = ibama;
	}

	// INTERFACE
	@Override
	public void odono() {
		System.out.print("\nInsira o nome do dono: ");
		this.setDono(leia.nextLine());
		System.out.println("");
		System.out.print("Insira o telefone do dono: ");
		this.setTelefone(leia.nextLine());

		System.out.print("Insira o cep do dono: ");
		this.setCep(leia.nextLine());
	}
	
	@Override
	public void oanimal() {		
		System.out.print("\nMatricula do Ibama: ");
		this.setIbama(leia.nextLong());

		System.out.print("Insira o nome do animal: ");
		this.setNome(leia.next());
		
		System.out.print("Insira a idade do animal: ");
		this.setIdade(leia.nextByte());

		System.out.print("Insira o peso do animal: ");
		this.setPeso(leia.nextFloat());

		System.out.print("Qual a esp�cie do animal? ");
		this.setEspecie(leia.next());
		
		System.out.print("Qual o tipo do animal? ");
		this.setTipo(leia.next());
		
		String tipo = getTipo();
		
		if(tipo.equals("Tartaruga")) {	
			System.out.print("Digite a espessura da Tartaruga: ");
			Squirtle.setEspessura(leia.nextDouble());
		}	
		if (tipo.equals("Camaleao") || tipo.equals("Camale�o")) {
			
			System.out.print("Digite o tamanho da l�ngua: ");
			Rambo.setTamLingua(leia.nextDouble());
		}
		
		if (tipo.equals("Papagaio")) {			
			System.out.print("Digite a cor das asas: ");
			ZecaUrubu.setCorDasAsas(leia.next());
		}

		System.out.print("O animal tem cuidados especiais? ");
		this.setCuidado(leia.next());

	}

	@Override
	public void oprocedimento() {
		System.out.println("O animal j� tomou banho? ");
		this.setBanho2(leia.next());

		System.out.println("O animal j� comeu? ");
		this.setComer2(leia.next());

		System.out.println("O animal dormiu? ");
		this.setDormir(leia.next());

		System.out.println("O animal tem cuidados especiais? ");
		this.setCuidado(leia.next());

		if (cuidado.equals("sim") || cuidado.equals("Sim") || cuidado.equals("SIM")) {
			System.out.println("Os cuidados foram aplicados? ");
			this.setCuidado2(leia.next());
		} else {
			System.out.println("O animal n�o tem cuidados especiais.");
		}

	}
	
	@Override
	public void caixa() {
		Vendas v = new Vendas();
		v.menuProdutos();
	}

	public void statusdono() {
		System.out.println("Dono: " + this.getDono());
		System.out.println("Telefone: " + this.getTelefone());
		System.out.println("cep: " + this.getCep());
		System.out.println();
	}

	public void statusanimal() {
		System.out.println("Matricula do Ibama: " + this.getIbama());
		System.out.println("Nome do animal: " + this.getNome());
		System.out.println("Idade do animal: " + this.getIdade() + " anos");
		System.out.println("Peso do animal: " + this.getPeso());
		System.out.println("Esp�cie: " + this.getEspecie());
		System.out.println("Tipo: " + this.getTipo());
		
		String testando = this.getTipo();
		
		if(testando.equals("Tartaruga")) {	
			System.out.println("Espessura: " + Squirtle.getEspessura());
			Squirtle.imprimirTartaruga();
			Squirtle.nadar();
			limparTela();
		}	
		if (testando.equals("Camaleao") || testando.equals("Camale�o")) {
			System.out.println("Tamanho da L�ngua: " + Rambo.getTamLingua());
			Rambo.imprimirCamaleao();
			Rambo.subirNaArvore();			
			limparTela();
		}
		
		if (testando.equals("Papagaio")) {
			String cor;
			cor = ZecaUrubu.getCorDasAsas();
			System.out.println("Cor das Asas: " + cor); 
			ZecaUrubu.imprimirPapagaio();
			ZecaUrubu.falar();
			limparTela();
		}

	}

	public void statusprocedimento() {
		System.out.println("O animal comeu? " + this.getComer2());
		System.out.println("O animal tomou banho? " + this.getBanho2());
		System.out.println("O animal dormiu? " + this.getDormir());
		System.out.println("O animal possui cuidados especiais? " + this.getCuidado());

	}
}
