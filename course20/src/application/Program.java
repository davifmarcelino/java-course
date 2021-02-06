package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();
		
		System.out.print("Quantos alunos estao no curso A? ");
		int a = sc.nextInt();
		curso(a, set, sc);
		
		System.out.print("Quantos alunos estao no curso B? ");
		int b = sc.nextInt();
		curso(b, set, sc);
		
		System.out.print("Quantos alunos estao no curso C? ");
		int c = sc.nextInt();
		curso(c, set, sc);
		
		System.out.println("Total de aulos do professor: "+set.size());
		sc.close();
		
	}
	
	public static void curso(int sala, Set<Integer> set, Scanner sc) {
		for(int i=0;i<sala;i++) {
			set.add(sc.nextInt());
		}	
	}
	
	
}
