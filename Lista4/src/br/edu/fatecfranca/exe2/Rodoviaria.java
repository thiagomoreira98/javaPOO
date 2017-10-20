package br.edu.fatecfranca.exe2;

import java.util.ArrayList;

public class Rodoviaria {
    private ArrayList<Onibus> onibus;
    private String nome, cidade;

    public Rodoviaria() {
        this.onibus = new ArrayList();
    }

    public Rodoviaria(ArrayList<Onibus> onibus, String nome, String cidade) {
        this.onibus = onibus;
        this.nome = nome;
        this.cidade = cidade;
    }

    //getters
    public ArrayList<Onibus> onibus() {
        return onibus;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getCidade() {
        return cidade;
    }

    //settters
    public void setOnibus(ArrayList<Onibus> onibus) {
        this.onibus = onibus;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    //
    public void associaOnibus(Onibus onibus) {
        this.onibus.add(onibus);
    }
    
    public boolean associaPassageiroOnibus(Onibus onibus, Passageiro passageiro) {
        if(this.onibus.contains(onibus)) {
            onibus.associaPassageiro(passageiro);
            return true;
        }
        return false;
    }
    
    public boolean desvinculaOnibus(Onibus onibus) {
        return this.onibus.remove(onibus);
    }
    
    public boolean desvinculaPassageiroOnibus(Passageiro passageiro. Onibus onibus) {
        if(this.onibus.contains(onibus)) {
            onibus.desvincularPassageiro(passageiro);
            return true;
        }
        return false;
    }
    
    public boolean obterOnibus(Onibus onibus) {
        return this.onibus.contains(onibus);
    }
    
    public boolean obterOnibus(String numero) {
        for(Onibus onibus: this.onibus) {
            if(onibus.getNumero().equals(numero)) {
                return true;
            }
        }
        return false;
    }
    
    private int obterPosicaoOnibus(int numero) {
        for(Onibus onibus: this.onibus) {
            if(onibus.getNumero().equals(numero)) {
                return this.onibus.indexOf(onibus);
            }
        }
        return -1;
    }
    
    private int obterPosicaoOnibus(Onibus onibus) {
        return this.onibus.indexOf(onibus);
    }
    
    public boolean atualizaOnibus(Onibus atual, Onibus novo) {
        int pos = obterPosicaoOnibus(atual);
        if(pos != -1) {
            this.onibus.set(pos, novo);
            return true;
        }
        return false;
    }
    
    public boolean atualizaPassageiroOnibus(Onibus onibus, Passageiro passageiro) {
        if(this.onibus.contains(onibus)) {
            return onibus.atualizaPassageiro(passageiro);
        }
        return false;
    }

    @Override
    public String toString() {
        String saida = "Rodoviaria{" + ", nome=" + nome + ", cidade=" + cidade + "onibus=";
        
        for(Onibus onibus: this.onibus) {
            saida = saida + onibus.toString() + "\n";
        }
        return saida;
    }
}