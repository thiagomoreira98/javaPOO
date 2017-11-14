package br.edu.fatecfranca.exe1;

public class ClasseLuxo extends Passageiro{
    
    private String bebidaAlcoolica;

    public ClasseLuxo(String bebidaAlcoolica, String nome, String tipo, int poltrona) {
        super(nome, tipo, poltrona);
        this.bebidaAlcoolica = bebidaAlcoolica;
    }

    public ClasseLuxo() {
    }

    public String getBebidaAlcoolica() {
        return bebidaAlcoolica;
    }

    public void setBebidaAlcoolica(String bebidaAlcoolica) {
        this.bebidaAlcoolica = bebidaAlcoolica;
    }

    @Override
    public String toString() {
        return super.toString() + "ClasseLuxo{" + "bebidaAlcoolica=" + bebidaAlcoolica + '}';
    }
}
