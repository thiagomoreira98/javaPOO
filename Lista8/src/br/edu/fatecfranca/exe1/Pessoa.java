package br.edu.fatecfranca.exe1;

public class Pessoa extends Animal implements Cidadao, Contribuinte, Professor{
    
    @Override
    public String vota() {
        return "Pessoa votando ...";
    }
    
    @Override
    public String tiraRg() {
        return "Pessoa tirando o RG ...";
    }
    
    @Override
    public String ensina() {
        return "Pessoa ensinando ...";
    }
    
    @Override
    public String trabalhar() {
        return "Pessoa trabalha";
    }
}
