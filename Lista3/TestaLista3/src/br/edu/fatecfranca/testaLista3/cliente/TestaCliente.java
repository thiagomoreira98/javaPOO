package br.edu.fatecfranca.testaLista3.cliente;
import br.edu.fatecfranca.exe1.Cliente;
import javax.swing.JOptionPane;

public class TestaCliente {
    public static void main(String[] args) {
        try{
            Cliente cliente1 = new Cliente();
            String nc = JOptionPane.showInputDialog("Informe número da Conta");
            cliente1.setNumeroConta(nc);
            String na = JOptionPane.showInputDialog("Informe número da Agência");
            cliente1.setNumeroAgencia(na);
            String no = JOptionPane.showInputDialog("Informe nome");
            cliente1.setNome(no);
            String sa = JOptionPane.showInputDialog("Informe saldo");
            cliente1.setSaldo(Float.parseFloat(sa));
            int opcao;
            do{
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n 1. Saque \n 2. Depósito \n 3. Saldo \n 4. Sair"));
                switch(opcao){
                    case 1:
                        String valorSaque = JOptionPane.showInputDialog("Informe o valor que deseja sacar");
                        cliente1.saque(Float.parseFloat(valorSaque));
                        break;
                    
                    case 2:
                        String valorDeposito = JOptionPane.showInputDialog("Informe o valor que deseja depositar");
                        cliente1.deposita(Float.parseFloat(valorDeposito));
                        break;
                            
                    case 3:
                        System.out.println("Saldo: " + cliente1.getSaldo());
                        break;
                    
                    case 4:
                        default: 
                }
                 
            }
            while (opcao != 4);
        }
        catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
}
