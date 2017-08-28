package br.edu.fatecfranca.ex2;

import javax.swing.JOptionPane;

public class TestaCliente {

	public static void main(String[] args) {
		Cliente fulano = new Cliente();
		Cliente beltrano = new Cliente("beltrano", "3431", "056514", 20.0f);
		
		float deposito = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do deposito:"));
		fulano.realizarDeposito(deposito);
		
		float saque = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do saque:"));
		fulano.realizarSaque(saque);
		
		float depositoB = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do deposito:"));
		beltrano.realizarDeposito(depositoB);
		
		float saqueB = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do saque:"));
		beltrano.realizarSaque(saqueB);
		
		JOptionPane.showMessageDialog(null, Cliente.verificaTamanho(fulano.numeroAgencia));
		JOptionPane.showMessageDialog(null, Cliente.verificaTamanho(beltrano.numeroAgencia));
		
		JOptionPane.showMessageDialog(null, Cliente.retornaNovoCliente(fulano, beltrano).imprimir());
	}

}
