package Exercicio1;

public class Aluno {

	public int numeroAluno;
	public String nome;
	public int idade;
	public float p1;
	public float p2;
	public float media;

	public Aluno() {

	}
	
	public void helloWorld() {
		System.out.println("Hello World");
	}
	
	/*public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setNumeroAluno(int numeroAluno) {
		this.numeroAluno = numeroAluno;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}*/
	
	public void notaFinal(float p1, float p2) {
		this.media = (p1 + p2) / 2;
		System.out.println(this.media);
	}
	
	public void dadosAluno() {
		System.out.println("Numero Aluno: "+this.numeroAluno);
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade);
	}
	
	public void passou() {
		if(this.media >= 6) {
			System.out.println("APROVADO");
		}
		else {
			System.out.println("REPROVADO");
		}
	}
}
