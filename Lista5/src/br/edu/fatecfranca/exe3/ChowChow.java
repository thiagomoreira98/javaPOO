package br.edu.fatecfranca.exe3;
import br.edu.fatecfranca.exe1.Cachorro;

public class ChowChow extends Cachorro{
    
    private boolean peludo;
    
    public ChowChow() {
        this.peludo = true;
    }
    
    public void tosei() {
        this.peludo = false;
    }
    
//    public String mostraInfo() {
//        return "";
//    }
}
