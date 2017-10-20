package br.edu.fatecfranca.exe2;

import java.util.ArrayList;

public class Onibus {
    private String numero;
    private ArrayList<Passageiro> passageiros;

    //construtores
    public Onibus() {
        this.passageiros = new ArrayList();
    }

    public Onibus(Passageiro passageiro, String numero) {
        this.passageiros = passageiros;
        this.numero = numero;
    }

    //getters
    public String getNumero() {
        return numero;
    }

    public ArrayList<Passageiro> getPassageiros() {
        return passageiros;
    }
    
    //Setters
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public void setPassageiros(ArrayList<Passageiro> passageiro) {
        this.passageiros = passageiros;
    }
    
    //
    public void associaPassageiro(Passageiro passageiro) {
        this.passageiros.add(passageiro);
    }
    
    public boolean desvincularPassageiro(Passageiro passageiro) {
        return this.passageiros.remove(passageiro);
    }
    
    public boolean obterPassageiro(Passageiro passageiro) {
        return this.passageiros.contains(passageiro);
    }
    
    public boolean obterPassageiro(String cpf) {
        for(Passageiro passageiro: this.passageiros) {
            if(passageiro.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }
    
    private int obterPosicaoPassageiro(Passageiro passageiro) {
        //retorna -1 se nao encontrar o passageiro no arrayList
        return this.passageiros.indexOf(passageiro);
    }
    
    private int obterPosicaoPassageiro(String cpf) {
        for(Passageiro passageiro: this.passageiros) {
            if(passageiro.getCpf().equals(cpf)) {
                return this.passageiros.indexOf(passageiro);
            }
        }
        return -1;
    }
    
    public boolean atualizaPassageiro(Passageiro passageiro) {
        int pos = obterPosicaoPassageiro(passageiro.getCpf());
        if(pos != -1) {
            this.passageiros.set(pos, passageiro);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String saida = "Onibus{" + "numero=" + numero + ", passageiros=";
        
        for(Passageiro passageiro: this.passageiros) {
            saida = saida + passageiro.toString() + "\n";
        }
            
        return saida;
    }
}
