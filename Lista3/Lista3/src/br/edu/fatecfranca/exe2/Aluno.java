package br.edu.fatecfranca.exe2;

public class Aluno {
    private String numeroAluno;
    private String nome;
    private int idade;
    private float p1;
    private float p2;
    
    //Construtores
    public Aluno(){
        this.nome= "Aluno1";
        this.numeroAluno = "000001";
        this.idade = 18;
        this.p1 = 6;
        this.p2 = 6;
        
    }
    
    public Aluno(String nAluno, String n, int age, float prova1, float prova2){
        this.trataNumeroAluno(nAluno);
        this.trataNome(n);
        this.idade = age;
        this.trataProva1(prova1);
        this.trataProva2(prova2);
    }
    
    //Setters
    public void setNumeroAluno(String nroAluno){
        this.trataNumeroAluno(nroAluno);
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    
    public void setIdade(int age){
        this.idade = age;
        //trataCodigo(age);
    }
    
    public void setP1(float prova1){
        this.p1 = prova1;
    }
    
    public void setP2(float prova2){
        this.p1 = prova2;
    }
    
    //getters
    public String getNumeroAluno(){
        return this.numeroAluno;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getIdate(){
        return this.idade;
    }
    
    public float getP1(){
        return this.p1;
    }
    
    public float getP2(){
        return this.p2;
    }
    
    //Trata
    private void trataNumeroAluno(String nroAluno){
        if (nroAluno.length() == 6){
            this.numeroAluno = nroAluno;
        }
        else
            throw new IllegalArgumentException("Número do aluno invalido");
    }
    
    private void trataNome(String n){
         if (n.length() <= 30){
             this.nome = n;
        }
        else 
            throw new IllegalArgumentException("Nome Inválido");
    }
    
    private void trataProva1(float prova1){
         if (prova1 > 0){
             this.p1 = prova1;
        }
        else 
            throw new IllegalArgumentException("Nota da prova1 Inválido");
    }
    
    private void trataProva2(float prova2){
         if (prova2 > 0){
             this.p2 = prova2;
        }
        else 
            throw new IllegalArgumentException("Nota da prova2 Inválido");
    }
    
    //
    public float notaFinal(){
        return (this.p1 + this.p2) / 2;
    }
    
    public String dadosAluno(){
        return "Numero do Aluno: " + this.numeroAluno + 
                "\nNome do Aluno: " + this.nome +
                "\nIdade do Aluno: " + this.idade;
    }
    
    public String passou(){
        if((this.p1 + this.p2) / 2 >= 6){
            return "Aluno Aprovado";
        }
        else{
            return "Aluno Reprovado";
        }
    }
}
