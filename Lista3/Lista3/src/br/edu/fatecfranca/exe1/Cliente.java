package br.edu.fatecfranca.exe1;
public class Cliente {
    // variáveis encapsuladas
    private String numeroConta;
    private String numeroAgencia; 
    private String nome;
    private float saldo;
    
    // métodos construtores
    public Cliente(){
        this.nome = "";
        this.numeroAgencia = "0000-0";
        this.numeroConta = "000000-0";
    }
    
    public Cliente(String nConta, String nAgencia, String n, float s){
        trataNroConta(nConta);
        trataNroAgencia(nAgencia);
        trataNome(n);
    }
    
    //SETTERS
    public void setNumeroConta(String numeroConta){
        trataNroConta(numeroConta);
    }
    
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    public void setNumeroAgencia(String nAgencia){
        trataNroAgencia(nAgencia);
    }
    
    public void setNome(String nome){
        trataNome(nome);
    }
    
    //TRATA
    private void trataNroAgencia(String nAgencia){
         if ((nAgencia.length() == 6) && (nAgencia.charAt(4) == '-'))
            this.numeroAgencia = nAgencia;
        else 
            throw new IllegalArgumentException("Número de agência inválido");  
    }
    
    private void trataNroConta(String nConta){
      if ((nConta.length() == 8) && (nConta.charAt(6)=='-'))
            this.numeroConta = nConta;
        else 
            throw new IllegalArgumentException("Número de conta inválido");  
        
    }
    
    private void trataNome(String nome){
        if (nome.length() <= 30 )
            this.nome = nome;
        else 
            throw new IllegalArgumentException("Nome inválido");
    }
    
    //GETTERS
    public String getNumeroConta(){
        return this.numeroConta;
    }
    
    public String getNumeroAgencia(){
        return this.numeroAgencia;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    //
    public void deposita(float x){
        this.saldo += x;
    }
    
    public void saque(float s){
        if (this.saldo - s >= 0){
            this.saldo -= s;
        }
        else 
            throw new IllegalArgumentException("Saldo insuficiente");
    }
    
    public String mostra(){
        return "Número da conta: " + this.numeroConta +
                "\n Número da agência " + this.numeroAgencia +
                "\n Nome: " + this.nome +
                "\n Saldo: " + this.saldo;
    }
}
