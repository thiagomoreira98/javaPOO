package br.edu.fatecfranca.exe4;

public class Radio extends Produto{
    
    private String estacao, banda;
    
    public Radio() {
        this.estacao = "99.7";
        this.banda = "FM";
    }
    
    public Radio(int serial, int volume, String estacao, String banda) {
        super(serial, volume);
        this.estacao = estacao;
        this.banda = banda;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Radio: " + this.estacao + " " + this.banda;
    }
    
    public void trocarEstacao(String estacao) {
        this.estacao = estacao;
    }
    
    public void trocarBanda(String banda) {
        this.banda = banda;
    }
}
