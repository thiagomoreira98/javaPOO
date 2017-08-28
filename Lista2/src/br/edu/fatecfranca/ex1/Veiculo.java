package br.edu.fatecfranca.ex1;

public class Veiculo {

	String tipo;
	int nroRodas;
	String cor;
	int ano;
	public static String nomeDono;
	
	public Veiculo() {
		this.tipo = "carro";
		this.nroRodas = 4;
		this.cor = "azul";
		this.ano = 2017;
	}
	
	public Veiculo(String t, int nRodas, String c, int y) {
		this.tipo = t;
		this.nroRodas = nRodas;
		this.cor = c;
		this.ano = y;
	}
	
	public void alteraTipo(String t) {
		this.tipo = t;
	}
	
	public String mostra() {
		return "nome do dono: " + Veiculo.nomeDono +
				"\n tipo: " + this.tipo +
				"\n numero de rodas: " + this.nroRodas +
				"\n cor: " + this.cor +
				"\n ano: " +this.ano;
	}
	
	public static void alteraNome(String n) {
		Veiculo.nomeDono = n;
	}
	
	public static String retornaNome() {
		return Veiculo.nomeDono;
	}
	
	public static String nroRodas(Veiculo v1) {
		return (v1.nroRodas % 2 == 0) ? "par" : "impar";
	}
	
	public static Veiculo retornaNovoVeiculo(Veiculo v1, Veiculo v2) {
		Veiculo v3 = new Veiculo();
		v3.tipo = v1.tipo;
		v3.nroRodas = v1.nroRodas + v2.nroRodas;
		v3.cor = v2.cor;
		v3.ano = (v1.ano > v2.ano) ? v1.ano : v2.ano;
		return v3;
	}
}
