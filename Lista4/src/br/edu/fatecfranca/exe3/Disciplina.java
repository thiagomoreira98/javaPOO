package br.edu.fatecfranca.exe3;
import java.util.ArrayList;

public class Disciplina {
    private String codigo;
    private ArrayList<Topico> topicos;
    
    public Disciplina() {
        this.codigo = "1";
    }
    
    public Disciplina(String codigo) {
        this.codigo = codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getCodigo() {
        return this.codigo;
    }
    
    @Override
    public String toString() {
        String saida = "Disciplina{" + "codigo=" + codigo + ", topicos=";
        
        for(Topico topico: this.topicos) {
            saida = saida + topico.toString() + "\n";
        }
        return saida;
    }
    
    //
    public void associaTopico(Topico topico) {
        this.topicos.add(topico);
    }
    
    public boolean desvinculaTopico(Topico topico) {
        return this.topicos.remove(topico);
    }
    
    public boolean obterTopico(Topico topico) {
        return this.topicos.contains(topico);
    }
    
    private int obterPosicaoTopico(Topico topico) {
        return this.topicos.indexOf(topico);
    }
    
    private int obterPosicaoTopico(String assunto) {
        for(Topico topico: this.topicos) {
            if(topico.getAssunto().equals(assunto)) {
                return this.topicos.indexOf(topico);
            }
        }
        return -1;
    }
    
    public boolean atualizaTopico(Topico topico) {
        int pos = obterPosicaoTopico(topico.getAssunto());
        if(pos != -1) {
            this.topicos.set(pos, topico);
            return true;
        }
        return false;
    }
}
