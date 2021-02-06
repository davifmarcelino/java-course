package entities;

public class Conta {

	private String name;
	private int nConta;
	private static double saldo;
	
	
	public Conta(String name,int nConta) {
		this.name=name;
		this.nConta=nConta;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	
	public static void deposito(double valor) {
		saldo+=valor;
	}
	
	public static void saque(double valor) {
		saldo=saldo-valor-5;
	}
	
	public String toString(){
		return "Conta: " + nConta +", Titular: " + name + ", Saldo: " + String.format("%.2f", saldo); 
	}
	
}
