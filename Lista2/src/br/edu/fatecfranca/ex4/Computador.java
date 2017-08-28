package br.edu.fatecfranca.ex4;

public class Computador {

	String processador;
	static int ram;
	
	public Computador() {
		this.processador = "corei7";
		Computador.ram = 16000;
	}
	
	public Computador(String p, int r) {
		this.processador = p;
		Computador.ram = r;
	}
	
	public void alteraProcessador(String p) {
		this.processador = p;
	}
	
	public static void alteraRam(int r) {
		Computador.ram = r;
	}
	
	public static void aumetarRam() {
		Computador.ram += 256;
	}
	
	public String mostra() {
		return "processador: " + this.processador +
				"\n ram: " + Computador.ram;
	}
}
