package br.edu.fatecfranca.exe3;
import javax.swing.JOptionPane;

public class TestaCurso {
    public static void main(String[] args) {
        Topico t1 = new Topico();
        Topico t2 = new Topico("Topico 2");
        Topico t3 = new Topico();
        t3.setAssunto("Topico 3");
        
        Disciplina d1 = new Disciplina();
        Disciplina d2 = new Disciplina();
        d2.setCodigo("2");
        
        Curso c1 = new Curso();
        
        d1.associaTopico(t1);
        d1.associaTopico(t2);
        d2.associaTopico(t3);
        
        c1.associaDisciplina(d1);
        c1.associaDisciplina(d2);
        
        JOptionPane.showMessageDialog(null, c1.toString());
    }
}
