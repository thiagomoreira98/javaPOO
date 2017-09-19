package br.edu.fatecfranca.encapsulamento;

public class Batedeira {

    private int ligada;
    private int velocidade;
    
    public Batedeira() {
        this.ligada = 1;
        this.velocidade = 0;
    }
    
    public Batedeira(int on, int v) {
        this.ligada = on;
        this.velocidade = v;
    }
    
    //SETTERS
    public void setLigada(int on){
        this.ligada = on;
    }
    
    public void setVelocidade(int v){
        this.ligada = v;
    }
    
    //GETTERS
    public int getLigada(){
        return this.ligada;
    }
    
    public int getVelocidade(){
        return this.velocidade;
    }
    
    //
    public void desligar(){
        if(this.velocidade != 0){
            throw new IllegalArgumentException("Não pode ser desligada, velocidade > 0");
        }
        this.ligada = 0;
    }
    
    public void aumentarVelocidade(int x){
        this.velocidade += x;
    }
    
    public static Batedeira batedeiraVeloz(Batedeira um, Batedeira dois){
        if(um.velocidade > dois.velocidade){
            return um;
        }
        else if(dois.velocidade > um.velocidade){
            return dois;
        } 
        else {
            throw new IllegalArgumentException("As duas Batedeiras tem a mesma velocidade!");
        }
    }
    
    public String mostrar(){
        return "Ligada: " + this.ligada +
                "\n Velocidade: " + this.velocidade;
    }
}
