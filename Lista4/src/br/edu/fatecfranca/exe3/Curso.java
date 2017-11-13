package br.edu.fatecfranca.exe3;
import java.util.ArrayList;

public class Curso {
    private String nome;
    private ArrayList<Disciplina> disciplinas;
       
    public Curso() {
        this.nome = "ADS";
    }
    
    public Curso(String n) {
        this.nome = n;
    }
    
    public void setNome(String n) {
        this.nome = n;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    @Override
    public String toString() {
        String saida = "Curso{" + ", nome=" + nome + ", disciplinas=";
        
        for(Disciplina disciplina: this.disciplinas) {
            saida = saida + disciplina.toString() + "\n";
        }
        return saida;
    }
    
    //
    public boolean associaDisciplina(Disciplina disciplina) {
        return this.disciplinas.add(disciplina);
    }
    
    public boolean associaTopicoDisciplina(Disciplina disciplina, Topico topico) {
        if(this.disciplinas.contains(disciplina)) {
            disciplina.associaTopico(topico);
            return true;
        }
        return false;
    }
    
    public boolean desvinculaDisciplina(Disciplina disciplina) {
        return this.disciplinas.remove(disciplina);
    }
    
    public boolean desvinculaTopicoDisciplina(Disciplina disciplina, Topico topico) {
        if(this.disciplinas.contains(disciplina)) {
            disciplina.desvinculaTopico(topico);
            return true;
        }
        return false;
    }
    
    public boolean obterDisciplina(Disciplina disciplina) {
        return this.disciplinas.contains(disciplina);
    }
    
    public boolean obterTopicoDisciplina(Disciplina disciplina, Topico topico) {
        return disciplina.obterTopico(topico);
    }
    
    public boolean obterDisciplina(String codigo) {
        for(Disciplina disciplina: this.disciplinas) {
            if(disciplina.getCodigo().equals(nome)) {
                return true;
            }
        }
        return false;
    }
    
    private int obterPosicaoDisciplina(Disciplina disciplina) {
        return this.disciplinas.indexOf(disciplina);
    }
    
    private int obterPosicaoDisciplina(String codigo) {
        for(Disciplina disciplina: this.disciplinas) {
            if(disciplina.getCodigo().equals(codigo)) {
                return this.disciplinas.indexOf(disciplina);
            }
        }
        return -1;
    }
    
    public boolean atualizaDisciplina(Disciplina disciplina) {
        int pos = obterPosicaoDisciplina(disciplina);
        if(pos != -1) {
            this.disciplinas.set(pos, disciplina);
            return true;
        }
        return false;
    }
    
    public boolean atualizaTopicoDisciplina(Disciplina disciplina, Topico topico) {
        if(this.disciplinas.contains(disciplina)) {
            return disciplina.atualizaTopico(topico);
        }
        return false;
    }
}
