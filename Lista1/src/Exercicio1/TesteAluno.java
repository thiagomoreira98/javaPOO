package Exercicio1;

public class TesteAluno {

	public TesteAluno() {
		
	}

	public static void main(String[] args) {
		Aluno ola = new Aluno();
		ola.helloWorld();
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Thiago");
		aluno1.setIdade(20);
		aluno1.setNumeroAluno(1);
		
		aluno1.dadosAluno();
		
		aluno1.notaFinal(7, 8);
		aluno1.passou();
	}

}
