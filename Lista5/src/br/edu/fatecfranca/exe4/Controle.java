package br.edu.fatecfranca.exe4;
import javax.swing.JOptionPane;

public class Controle {

    public static void main(String[] args) {
        Radio radio = new Radio(1, 15, "100.9", "FM");
        TV tv = new TV(1, 20, "9");
        
        radio.testaUnidade();
        tv.testaUnidade();
        
        JOptionPane.showMessageDialog(null, radio.toString());
        JOptionPane.showMessageDialog(null, tv.toString());
    }
}
