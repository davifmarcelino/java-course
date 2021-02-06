package application;

import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee funcionario = new Employee();
		
		System.out.println("Digite a seguinte informacoes");
		
		System.out.print("Nome : ");
		funcionario.nome = sc.nextLine();
		
		System.out.print("Salario bruto : ");
		funcionario.salario =  sc.nextDouble();
		
		System.out.print("Taxa : ");
		funcionario.taxa = sc.nextDouble();
		
		System.out.println("Dados : "+ funcionario);
		
		System.out.print("Reajuste salarial em porcentagem : ");
		funcionario.porcentagem = sc.nextDouble();
		
		System.out.println("Dados atualizados apos reajuste : "+ funcionario);
		
		sc.close();
	}

}
