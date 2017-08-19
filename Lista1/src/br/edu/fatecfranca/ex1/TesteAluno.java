package br.edu.fatecfranca.ex1;

import javax.swing.JOptionPane;

public class TesteAluno {

	public TesteAluno() {
		
	}

	public static void main(String[] args) {
		//aluno 1
		Aluno aluno1 = new Aluno();
		aluno1.nome = JOptionPane.showInputDialog("informe seu nome:");
		aluno1.idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));
		aluno1.numeroAluno = Integer.parseInt(JOptionPane.showInputDialog("Informe seu número:"));
		aluno1.p1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota da primeira prova:"));
		aluno1.p2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota da segunda prova:"));
		
		JOptionPane.showMessageDialog(null, aluno1.dadosAluno() + "Media Final:" + aluno1.notaFinal() + aluno1.passou());
		
		//Fazendo de outra forma
		String a = JOptionPane.showInputDialog("informe seu nome:");
		int b = Integer.parseInt(JOptionPane.showInputDialog("informe sua idade:"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("informe seu numero:"));
		float d = Float.parseFloat(JOptionPane.showInputDialog("informe a  primeira nota:"));
		float e = Float.parseFloat(JOptionPane.showInputDialog("informe a  primeira nota:"));
		
		Aluno aluno2 = new Aluno(a, b, c, d, e);
		
		JOptionPane.showMessageDialog(null, aluno2.dadosAluno() + "Media Final:" + aluno2.notaFinal() + aluno2.passou());
	}

}
