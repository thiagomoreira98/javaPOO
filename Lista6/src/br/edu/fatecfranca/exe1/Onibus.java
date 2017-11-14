package br.edu.fatecfranca.exe1;

public class Onibus {
    
    private int qtdePassageiro, numero;

    public Onibus(int qtdePassageiro) {
        this.qtdePassageiro = qtdePassageiro;
    }

    public Onibus() {
    }

    public int getQtdePassageiro() {
        return this.qtdePassageiro;
    }

    public void setQtdePassageiro(int qtdePassageiro) {
        this.qtdePassageiro = qtdePassageiro;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Onibus{" + "qtdePassageiro=" + qtdePassageiro + ", numero=" + numero + '}';
    }

    //
    public void criaPassageiroClasseStandard() {
        
    }
    
    public void criaPassageiroClasseLuxo() {
        
    }
}
