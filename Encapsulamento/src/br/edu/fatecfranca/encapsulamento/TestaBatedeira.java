package br.edu.fatecfranca.encapsulamento;

import javax.swing.JOptionPane;

public class TestaBatedeira {
    public static void main(String[] args){
        Batedeira x = new Batedeira();
        Batedeira y = new Batedeira(1, 10);
        
        y.aumentarVelocidade(5);
        x.aumentarVelocidade(10);
        //x.desligar();
        
        batedeiraVeloz(x, y);
        
        JOptionPane.showMessageDialog(null, x.mostrar());
        JOptionPane.showMessageDialog(null, y.mostrar());
    }
}
