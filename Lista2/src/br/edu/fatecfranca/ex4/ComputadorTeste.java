package br.edu.fatecfranca.ex4;

import javax.swing.JOptionPane;

public class ComputadorTeste {

	public static void main(String[] args) {
		Computador pc1 = new Computador();
		Computador pc2 = new Computador("coreI3", 8000);
		
		Computador.alteraRam(32000);
		Computador.aumetarRam();
		
		String p = JOptionPane.showInputDialog("informe o processador:");
		pc1.alteraProcessador(p);
		
		JOptionPane.showMessageDialog(null, pc1.mostra());
		JOptionPane.showMessageDialog(null, pc2.mostra());
	}

}
