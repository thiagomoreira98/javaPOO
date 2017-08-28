package br.edu.fatecfranca.ex3;

public class MeuString {

	public MeuString() {
		// TODO Auto-generated constructor stub
	}
	
	public int tamanho(String s) {
		return s.length();
	}
	
	public String posicao2(String s) {
		String[] saida = s.split("");
		return saida[1];
	}

	public static void main(String[] args) {
		String str1 = "meu primeiro String";
		
		posicao2(str1);

	}

}
