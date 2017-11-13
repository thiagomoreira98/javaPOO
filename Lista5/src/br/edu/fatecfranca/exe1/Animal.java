package br.edu.fatecfranca.exe1;

public class Animal {
    protected String nome;
    
    public Animal() {
        this.nome = "default";
    }
    
    public Animal(String nome) {
        this.nome = nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String fala() {
        return "Eu não Falo";
    }

    public String mostraInfo() {
        return "Animal{" + "nome=" + nome + "}";
    }

}
