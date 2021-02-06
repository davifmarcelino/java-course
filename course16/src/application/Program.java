package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Fisica;
import entities.Ir;
import entities.Juridica;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List <Ir> ir= new ArrayList<>();
		System.out.print("Quantos IR sao?");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print("Que tipo de IR, Fisica ou Juridica (f/j)?");
			char tipo = sc.next().charAt(0);
			if('f'==tipo) {
				sc.nextLine();
				System.out.print("Nome: ");
				String name = sc.nextLine();
				System.out.print("Renda: ");
				double renda = sc.nextDouble();
				System.out.print("Gastos com saude: ");
				double saude = sc.nextDouble();
				ir.add(new Fisica(name, renda, saude));
			}
			else {
				sc.nextLine();
				System.out.print("Nome: ");
				String name = sc.nextLine();
				System.out.print("Renda: ");
				double renda = sc.nextDouble();
				System.out.print("Numero de funcionarios: ");
				int funcionarios = sc.nextInt();
				ir.add(new Juridica(name, renda, funcionarios));
			}
		}
		System.out.println();
		double soma=0;
		for(Ir list: ir) {
			System.out.println(list);
			soma+=list.imposto();
		}
		System.out.println();
		System.out.println("Total de IR pago: "+ String.format("%.2f", soma));
		
		sc.close();
	}

}
