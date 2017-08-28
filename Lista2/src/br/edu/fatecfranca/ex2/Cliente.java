package br.edu.fatecfranca.ex2;

public class Cliente {

	String numeroConta;
	String numeroAgencia;
	String nome;
	static float saldo;
	
	public Cliente() {
		this.nome = "Default";
		this.numeroAgencia = "123";
		this.numeroConta = "0102";
		Cliente.saldo = 10.00f;
	}
	
	public Cliente(String n, String na, String nc, float s) {
		this.nome = n;
		this.numeroAgencia = na;
		this.numeroConta = nc;
		Cliente.saldo = s;
	}
	
	public void realizarDeposito(float s) {
		Cliente.saldo += s;
	}
	
	public void realizarSaque(float s) {
		Cliente.saldo -= s;
	}
	
	public String imprimir() {
		return "nome: " + this.nome +
				"\n numero da conta: " + this.numeroConta +
				"\n saldo atual: " + Cliente.saldo;
	}
	
	public static void alteraSaldo(float s) {
		Cliente.saldo = s;
	}
	
	public static float retornaSaldo() {
		return Cliente.saldo;
	}
	
	public void alteraAgencia(String na) {
		this.numeroAgencia = na;
	}
	
	public String retornaAgencia() {
		return this.numeroAgencia;
	}
	
	public static Cliente retornaNovoCliente(Cliente c1, Cliente c2) {
		Cliente c3 = new Cliente();
		c3.saldo = c1.saldo + c2.saldo;
		c3.numeroAgencia = c1.numeroAgencia;
		c3.numeroConta = c2.numeroConta;
		return c3;
	}
	
	public static String verificaTamanho(String na) {
		return (na.length() == 6) ? "tem o tamanho 6" : "não tem tamanho 6";
	}

}
