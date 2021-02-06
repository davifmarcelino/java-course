package application;

import java.util.Scanner;

import entities.Alunos;

public class Program {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Alunos aluno = new Alunos();
	
	System.out.print("Digite o nome do aulo : ");
	aluno.nome = sc.nextLine();
	int nota;
	do{
	System.out.print("Digite nota 1 : ");
	nota = sc.nextInt();
	aluno.primeiro = nota;
	}while(nota>30);
	
	do{
		System.out.print("Digite nota 2 : ");
		nota = sc.nextInt();
		aluno.segundo = nota;
		}while(nota>35);
	
	do{
		System.out.print("Digite nota 3 : ");
		nota = sc.nextInt();
		aluno.terceiro = nota;
		}while(nota>35);
	
	if(aluno.soma()>=60) {
		System.out.println("NOTA FINAL = "+ aluno.soma());
		System.out.println("PASSOU");
	}
	else {
		System.out.println("NOTA FINAL = "+ aluno.soma());
		System.out.println("REPROVOU");
		System.out.println("FALTOU " + aluno.difenca()+" PONTOS");
	}
	
	sc.close();
	}

}
