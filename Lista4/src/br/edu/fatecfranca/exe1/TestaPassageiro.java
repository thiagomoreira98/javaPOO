package br.edu.fatecfranca.exe1;

import javax.swing.JOptionPane;

public class TestaPassageiro {
    public static void main(String[] args) {
        Voo v1 = new Voo();
        v1.setDestino("Sao Paulo");
        v1.setNumero("123");
        
        Reserva r1 = new Reserva();
        r1.setCodigo(1);
        r1.setVoo(v1);
        
        Passageiro p1 = new Passageiro();
        p1.setNome("Celio");
        p1.setReserva(r1);        
       
        JOptionPane.showMessageDialog(null, p1.toString());
    }
}
