package Exercicio2;

public class Cliente {
	
	public int numeroConta;
	public int numeroAgencia;
	public String nome;
	public float saldo;

	public Cliente(int numConta, int numAgencia, String n, float s) {
		this.numeroConta = numConta;
		this.numeroAgencia = numAgencia;
		this.nome = n;
		this.saldo = s;
	}
	
	public void dadosCliente() {
		System.out.println("Numero Da Conta: "+this.numeroConta);
		System.out.println("Numero Da Agencia: "+this.numeroAgencia);
		System.out.println("Nome: "+this.nome);
		System.out.println("Saldo: "+this.saldo);
		System.out.println("-------------------------------------------------------------");
	}
	
	public void realizarDeposito(int d) {
		this.saldo += d;
	}
	
	public void realizarSaque(int s) {
		this.saldo -= s;
	}

}
