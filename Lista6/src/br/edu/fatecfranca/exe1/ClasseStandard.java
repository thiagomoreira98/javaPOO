package br.edu.fatecfranca.exe1;

public class ClasseStandard extends Passageiro{

    private String tipoLanche;

    public ClasseStandard(String tipoLanche, String nome, String tipo, int poltrona) {
        super(nome, tipo, poltrona);
        this.tipoLanche = tipoLanche;
    }

    public ClasseStandard() {
    }

    public String getTipoLanche() {
        return tipoLanche;
    }

    public void setTipoLanche(String tipoLanche) {
        this.tipoLanche = tipoLanche;
    }

    @Override
    public String toString() {
        return super.toString() + "ClasseStandard{" + "tipoLanche=" + tipoLanche + '}';
    }
    
}
