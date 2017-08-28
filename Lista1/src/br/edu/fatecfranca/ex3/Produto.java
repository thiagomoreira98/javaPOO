package br.edu.fatecfranca.ex3;

public class Produto {
	
	public int id;
	public String descricao;
	public int qtde;
	public float preco;

	public Produto(int id, String d, int q, float p) {
		this.id = id;
		this.descricao = d;
		this.qtde = q;
		this.preco = p;
	}
	
	public Produto() {
		
	}
	
	public void comprar(int x) {
		this.qtde += x;
	}
	
	public void vender(int x) {
		this.qtde -= x;
	}
	
	public void subir(float x) {
		this.preco += x;
	}
	
	public void descer(float x) {
		this.preco -= x;
	}
	
	public void mostrar() {
		System.out.println("ID: "+this.id);
		System.out.println("Descri��o: "+this.descricao);
		System.out.println("Quantidade: "+this.qtde);
		System.out.println("Pre�o: "+this.preco);
		System.out.println("----------------------------------------------");
	}

}
