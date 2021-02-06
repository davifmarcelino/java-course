package application;

import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("====Abertura de conta====");
	System.out.println();
	System.out.print("Ditite seu numero de conta:");
	int nConta = sc.nextInt();
	
	System.out.print("Ditite seu nome:");
	sc.nextLine();
	String name =  sc.nextLine();
	
	Conta nova = new Conta(name,nConta);
	System.out.print("Deseja realizar um deposito inicial (S/N)?");
	
	char sORn = sc.next().charAt(0);
	double valor;
	if(sORn == 's'||sORn == 'S'){
		System.out.print("Valor do deposito = ");
		valor = sc.nextDouble();
		Conta.deposito(valor);
	}
	System.out.println(nova);
	
	System.out.print("Realizar deposito no valor = ");
	valor = sc.nextDouble();
	Conta.deposito(valor);
	System.out.println(nova);
	
	System.out.print("Realizar saque no valor = ");
	valor = sc.nextDouble();
	Conta.saque(valor);
	System.out.println(nova);
	
	
	
	sc.close();
	}

}
