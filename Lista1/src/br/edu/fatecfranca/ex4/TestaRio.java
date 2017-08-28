package br.edu.fatecfranca.ex4;

public class TestaRio {

	public static void main(String[] args) {
		//Rio 1 - Usando construtor com paramentros
		Rio rio1 = new Rio("Mar Vermelho", 5.4F, true);
		
		rio1.chover(15);
		rio1.ensolarar(5);
		rio1.limpar();
		rio1.mostrar();
		
		//Rio 2 - Usando construtor sem parametros
		Rio rio2 = new Rio();
		
		rio2.nome = "Rio Tigre";
		rio2.nivel = 20;
		rio2.poluido = false;
		
		rio2.chover(5);
		rio2.ensolarar(10);
		rio2.sujar();
		rio2.mostrar();

	}

}
