package br.edu.fatecfranca.exe1;

public class Passageiro {
    
    protected String nome, tipo;
    protected int poltrona;

    public Passageiro(String nome, String tipo, int poltrona) {
        this.nome = nome;
        this.tipo = tipo;
        this.poltrona = poltrona;
    }

    public Passageiro() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }

    @Override
    public String toString() {
        return "Passageiro{" + "nome=" + nome + ", tipo=" + tipo + ", poltrona=" + poltrona + '}';
    }
    
}
