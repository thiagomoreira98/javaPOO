package br.edu.fatecfranca.testaLista3.aluno;
import br.edu.fatecfranca.exe2.Aluno;
import javax.swing.JOptionPane;

public class TestaAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno("000002", "Thiago", 19, 6, 7);
        
        JOptionPane.showMessageDialog(null, aluno2.notaFinal());
        JOptionPane.showMessageDialog(null, aluno2.dadosAluno());
        JOptionPane.showMessageDialog(null, aluno2.passou());
    }
}
