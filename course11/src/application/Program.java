package application;

import java.util.Scanner;

import entities.Room;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.print("Digite o numero de quantos a serem alugados: ");
		int n = sc.nextInt();
		Room[]quartos = new Room[10];
		for(int i=0;i<n;i++) {
			System.out.printf("numero do pedido #%d : %n", i+1);
			sc.nextLine();
			System.out.print("Digite seu nome: ");
			String name = sc.nextLine();
			System.out.print("Digite seu email: ");
			String email = sc.nextLine();
			System.out.print("qual quarto deseja alugar?(0 a 9): ");
			int nquarto = sc.nextInt();
			quartos[nquarto] = new Room(name,email); 
		}
		System.out.println("quartos algados:");
		for(int i=0;i<quartos.length;i++) {
			if(quartos[i]!=null) {
				System.out.println(i+": "+quartos[i]);
			}
		}
		sc.close();
	}

}
