package br.edu.fatecfranca.ex3;

public class TestaProduto {

	public static void main(String[] args) {
		//Produto 1 - Usando construtor com parametros
		Produto produto1 = new Produto(1, "batata", 10, 3.3F);
		produto1.vender(3);
		produto1.comprar(7);
		produto1.mostrar();
		
		//Produto 2 - Usando Construtor sem parametros
		Produto produto2 = new Produto();
		
		produto2.id = 2;
		produto2.descricao = "doce";
		produto2.qtde = 8;
		produto2.preco = 5.3F;
		
		produto2.vender(3);
		produto2.comprar(7);
		produto2.mostrar();

	}

}
