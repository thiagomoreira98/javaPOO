package br.edu.fatecfranca.exe1;

public class TestaPessoaCidade {
   
    public static void main(String[] args) {
        
        Pessoa fulano = new Pessoa();
        Cidade franca = new Cidade();
        
        franca.contrata(fulano);
        
        // coerção
        franca.contrata((Empregado) fulano);
        franca.cobraDe(fulano);
        franca.registra(fulano);
        franca.alimenta(fulano);
    }
}
