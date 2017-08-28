package br.edu.fatecfranca.ex4;

public class Rio {

	public String nome;
	public float nivel;
	public boolean poluido;
	
	public Rio() {
		
	}
	
	public Rio(String n, float nvl, boolean p) {
		this.nome = n;
		this.nivel = nvl;
		this.poluido = p;
	}
	
	public void chover(float x) {
		this.nivel += x;
	}
	
	public void ensolarar(float x) {
		this.nivel -= x;
	}
	
	public void limpar() {
		this.poluido = true;
	}
	
	public void sujar() {
		this.poluido = false;
	}
	
	public void mostrar() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Nivel: "+this.nivel);
		System.out.println("Poluido: "+this.poluido);
		System.out.println("------------------------------------------");
	}

}
