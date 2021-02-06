package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.Regras;

public class Program {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	System.out.println("Entre com os dados da conta: ");
	System.out.print("Numero: ");
	int numero = sc.nextInt();
	System.out.print("Nome: ");
	sc.nextLine();
	String nome = sc.nextLine();	
	System.out.print("Saldo inicial: ");
	double saldo = sc.nextDouble();
	System.out.print("Limite de saque: ");
	double limite = sc.nextDouble();
	Account conta = new Account(numero, nome, saldo, limite);
	System.out.print("Valor do saque: ");
	double valorS = sc.nextDouble();
	try {
		conta.saque(valorS);
		System.out.println(conta);
	}
	catch(Regras e){
		System.out.println("Erro : "+e.getMessage());
	}
	catch(RuntimeException e) {
		System.out.println("Erro ao digitar o valor!");
	}
	
	sc.close();
	}

}
