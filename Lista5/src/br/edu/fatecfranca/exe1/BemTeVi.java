package br.edu.fatecfranca.exe1;

public class BemTeVi extends Passaro{
    
    public BemTeVi(String nome) {
        super(nome);
    }
    
    @Override
    public String fala() {
        return super.mostraInfo() + " bem-te-vi";
    }
}
