package br.edu.fatecfranca.exe1;

public class Vendedor extends Funcionario {
    
    private float comissao;
    
    public Vendedor() {
        super();
    }

    public Vendedor(float comissao, String nome, String matricula, float salario) {
        super(nome, matricula, salario);
        this.comissao = comissao;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
    
    @Override
    public float calculaSalario() {
        return this.salario;
    }

    @Override
    public String toString() {
        return "Vendedor: Comissão: " + this.comissao + super.toString();
    }
    
}
