package br.edu.fatecfranca.exe1;
import java.util.ArrayList;

public class Rodoviaria {

    private int qtdeOnibus;
    private String nome, cidade;
    private ArrayList<Onibus> onibus;

    public Rodoviaria(int qtdeOnibus, String nome, String cidade) {
        this.qtdeOnibus = qtdeOnibus;
        this.nome = nome;
        this.cidade = cidade;
    }

    public Rodoviaria() {
    }

    public int getQtdeOnibus() {
        return qtdeOnibus;
    }

    public void setQtdeOnibus(int qtdeOnibus) {
        this.qtdeOnibus = qtdeOnibus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public ArrayList<Onibus> getOnibus() {
        return this.onibus;
    }
    
    public void setOnibus(ArrayList<Onibus> onibus) {
        this.onibus = onibus;
    }

    @Override
    public String toString() {
        String saida = "Rodoviaria{" + "qtdeOnibus=" + qtdeOnibus + ", nome=" + nome + ", cidade=" + cidade + "Onibus=";
        for(Onibus onibus: this.onibus) {
            saida = saida + onibus.toString() + "\n";
        }
        return saida;
    }
    
    public void criaOnibus(Onibus onibus) {
        this.onibus.add(onibus);
    }
    
//    public Onibus obterOnibus(int numero) {;
//        for(Onibus onibus: this.onibus) {
//            if(onibus.getNumero().equals(numero)) {
//                return onibus;
//            }
//        }
//        throw new IllegalArgumentException("Não existe onibus com esse número!");
//    }
    
    public void criaPassageiroClasseStandard() {
        
    }
    
    public void criaPassageiroClasseLuxo() {
        
    }
}
