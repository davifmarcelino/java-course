package application;

import java.util.Scanner;

import util.CurrencyCoverter;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	System.out.print("qual e  a cotacao do dolar?");
	CurrencyCoverter.cotacao = sc.nextDouble();
	
	System.out.print("quantos dolar voce deseja comprar?");
	CurrencyCoverter.dolar = sc.nextDouble();
	
	System.out.printf("Voce tera que pagar em reais com IOF = %.2f ", CurrencyCoverter.reais());
	
	sc.close();
	}

}
