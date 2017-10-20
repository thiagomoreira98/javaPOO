package br.edu.fatecfranca.exe0;

import java.util.Date;

public class Pedido {
    private int codigo;
    private float valorTotal;
    private Date data;
    
    //associação
    private ItemPedido itemPedido;

    public Pedido() {
    }

    public Pedido(int codigo, float valorTotal, Date data, int cPedido, float vPedido, int qPedido) {
        this.codigo = codigo;
        this.valorTotal = valorTotal;
        this.data = data;
        
        //composição
        this.itemPedido = new ItemPedido(cPedido, vPedido, qPedido);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public ItemPedido getItemPedido() {
        return itemPedido;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setItemPedido(int cPedido, float vPedido, int qPedido) {
        this.itemPedido = new ItemPedido(cPedido, vPedido, qPedido);
    }

    @Override
    public String toString() {
        return "Pedido{" + "codigo=" + codigo + ", valorTotal=" + valorTotal + ", data=" + data + ", itemPedido=" + itemPedido.toString() + '}';
    } 
}
