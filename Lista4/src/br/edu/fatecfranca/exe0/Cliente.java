package br.edu.fatecfranca.exe0;

public class Cliente {
    private int codigo;
    private String nome, rg;
    private Filme filme;

    public Cliente() {
    }

    public Cliente(int codigo, String nome, String rg, Filme filme) {
        this.codigo = codigo;
        this.nome = nome;
        this.rg = rg;
        this.filme = filme;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", nome=" + nome + ", rg=" + rg + ", filme=" + filme.toString() + '}';
    }  
}
