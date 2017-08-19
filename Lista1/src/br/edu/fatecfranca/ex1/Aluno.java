package br.edu.fatecfranca.ex1;

public class Aluno {

	public int numeroAluno;
	public String nome;
	public int idade;
	public float p1;
	public float p2;
	public float media;

	public Aluno() {
		this.nome = "";
		this.idade = 0;
		this.numeroAluno = 0;
		this.p1 = 0;
		this.p2 = 0;
	}
	
	public Aluno(String n, int age, int numAluno, float nota1, float nota2) {
		this.nome = n;
		this.idade = age;
		this.numeroAluno = numAluno;
		this.p1 = nota1;
		this.p2 = nota2;
	}
	
	public float notaFinal() {
		return (p1 + p2) / 2;
	}
	
	public String dadosAluno() {
		return "Numero: "+ this.numeroAluno +
			"\n Nome: "+ this.nome +
			"\n Idade: "+this.idade +
			"\n P1: "+this.p1 +
			"\n P2: "+this.p2;
	}
	
	public String passou() {
		return(this.notaFinal() >= 6) ? "Passou" : "Não Passou";
	}
}
