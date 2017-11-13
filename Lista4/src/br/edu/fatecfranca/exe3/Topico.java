package br.edu.fatecfranca.exe3;

public class Topico {
    private String assunto;
    
    public Topico() {
        this.assunto = "Topico 1";
    }
    
    public Topico(String assunto) {
        this.assunto = assunto;
    }
    
    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
    
    public String getAssunto() {
        return this.assunto;
    }
    
    @Override
    public String toString() {
        return "Topico{" + "assunto=" + assunto + "}";
    }
}
