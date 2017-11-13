package br.edu.fatecfranca.exe4;

public class TV extends Produto{
    
    private String canal;
    
    public TV() {
        this.canal = "7";
    }
    
    public TV(int serial, int volume, String canal) {
        super(serial, volume);
        this.canal = canal;
    }
    
    public void trocaCanal(String canal) {
        this.canal = canal;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Canal: " + this.canal;
    }
}
