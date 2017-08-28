package br.edu.fatecfranca.ex1;

import javax.swing.JOptionPane;

public class TestaVeiculo {

	public static void main(String[] args) {
		Veiculo carro = new Veiculo();
		Veiculo moto = new Veiculo("moto", 2, "vermelho", 2016);
		
		JOptionPane.showMessageDialog(null, carro.mostra());
		JOptionPane.showMessageDialog(null, moto.mostra());
		
		String t = JOptionPane.showInputDialog("informe o tipo:");
		moto.alteraTipo(t);
		
		moto.nroRodas = Integer.parseInt(JOptionPane.showInputDialog("informe o numero de rodas: "));
		moto.cor = JOptionPane.showInputDialog("informe a cor: ");
		moto.ano = Integer.parseInt(JOptionPane.showInputDialog("informe o ano: "));
		
		String n = JOptionPane.showInputDialog("informe o nome do dono: ");
		Veiculo.alteraNome(n);
		
		JOptionPane.showMessageDialog(null, carro.mostra());
		JOptionPane.showMessageDialog(null, moto.mostra());
		
		JOptionPane.showMessageDialog(null, Veiculo.nroRodas(carro));
		JOptionPane.showMessageDialog(null, Veiculo.nroRodas(moto));
		
		JOptionPane.showMessageDialog(null, Veiculo.retornaNovoVeiculo(carro, moto).mostra());
		
	}

}
