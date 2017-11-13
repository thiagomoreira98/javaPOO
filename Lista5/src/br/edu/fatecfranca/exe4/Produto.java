package br.edu.fatecfranca.exe4;

public class Produto {
    private int serial, volume;
    private String valor;
    
    public Produto() {
        this.valor = "não testado";
        this.serial = 0;
        this.volume = 0;
    }
    
    public Produto(int serial, int volume) {
        this.valor = "não testado";
        this.serial = serial;
        this.volume = volume;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String toString() {
        return "Produto{" + "serial=" + serial + ", volume=" + volume + ", valor=" + valor + "}";
    }
    
    //
    public boolean testaUnidade() {
        if(java.lang.Math.random() <= 0.1) {
            this.valor = "reprovado";
            return false;
        }
        this.valor = "aprovado";
        return true;
    }
}
