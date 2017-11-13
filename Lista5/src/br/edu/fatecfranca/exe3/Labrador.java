package br.edu.fatecfranca.exe3;
import br.edu.fatecfranca.exe1.Cachorro;

public class Labrador extends Cachorro{
    private boolean bravo;
    
    public Labrador() {
        this.bravo = true;
    }
    
    public void setDeBoas() {
        this.bravo = false;
    }
    
//    public String mostraInfo() {
//        return "";
//    }
}
