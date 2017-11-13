package br.edu.fatecfranca.exe2;
import br.edu.fatecfranca.exe1.BemTeVi;
import br.edu.fatecfranca.exe1.Cachorro;
import br.edu.fatecfranca.exe1.Papagaio;
import br.edu.fatecfranca.exe1.Vaca;
import javax.swing.JOptionPane;

public class TestaAnimal {
    
    public static void main(String[] args) {
        
        BemTeVi bemTeVi = new BemTeVi("Bem-Te-Vi");
        Cachorro cachorro = new Cachorro();
        Papagaio papagaio = new Papagaio();
        Vaca vaca = new Vaca("Vaquinha");
        
        cachorro.setNome("dogao");
        papagaio.setNome("chico");
        
        JOptionPane.showMessageDialog(null, bemTeVi.mostraInfo());
        JOptionPane.showMessageDialog(null, cachorro.mostraInfo());
        JOptionPane.showMessageDialog(null, papagaio.mostraInfo());
        JOptionPane.showMessageDialog(null, vaca.mostraInfo());
        
    }
}
