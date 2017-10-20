package br.edu.fatecfranca.exe0;

public class ItemPedido {
    private int codigo, qtde;
    private float valor;

    public ItemPedido(int codigo, float valor, int qtde) {
        this.codigo = codigo;
        this.valor = valor;
        this.qtde = qtde;
    }

    public ItemPedido() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    @Override
    public String toString() {
        return "ItemPedido{" + "codigo=" + codigo + ", valor=" + valor + ", qtde=" + qtde + '}';
    }
}
