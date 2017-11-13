package br.edu.fatecfranca.exe1;

public class Papagaio extends Passaro{

    private String vocabulario;
    
    public Papagaio(String nome, String vocabulario) {
        super(nome);
        this.vocabulario = vocabulario;
    }
    
    public Papagaio() {
        this.vocabulario = "";
    }
    
    public void setVocabulario(String vocabulario) {
        this.vocabulario = vocabulario;
    }
    
    public String getVocabulario() {
        return this.vocabulario;
    }
    
    @Override
    public String fala() {
        return super.mostraInfo() + " Vocabulario: " + this.vocabulario;
    }
    
    @Override
    public String mostraInfo() {
        return super.mostraInfo() + " papagaio";
    }
}
