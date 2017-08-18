package Exercicio1;

public class TesteAluno {

	public TesteAluno() {
		
	}

	public static void main(String[] args) {
		//Hello World :)
		Aluno ola = new Aluno();
		ola.helloWorld();
		
		//aluno 1
		Aluno aluno1 = new Aluno();
		aluno1.numeroAluno = 1;
		aluno1.nome = "Thiago";
		aluno1.idade = 20;
		aluno1.dadosAluno();
		
		aluno1.notaFinal(7, 8);
		aluno1.passou();
	}

}
