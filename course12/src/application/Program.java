package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Staff;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Staff> funcionarios = new ArrayList<>();
		
		System.out.print("Digite a quantidade de funcionarios: ");
		int nFuncionarios=sc.nextInt();
		
		for(int i=0;i<nFuncionarios;i++) {
			System.out.printf("Funcionario #%d: %n",i+1);
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			funcionarios.add(new Staff(id,name,salario));
		}
		
		System.out.print("Digite o id do funcionario que vai receber um aumento: ");
		int id = sc.nextInt();
	
		
		Staff ajustado = funcionarios.stream().filter(x->x.getId() == id).findFirst().orElse(null);
		if(ajustado==null) {
			System.out.println("Esse id nao existe!");
		}
		else {
			System.out.print("Qual e a porcentagem do almento? ");
			double ajuste = sc.nextDouble();
			ajustado.newsalario(ajuste);
		}
		System.out.println("listada de funcionarios: ");
		for(Staff pFuncionarios: funcionarios) {
			System.out.println(pFuncionarios);
		}
		
		
		sc.close();
	}

}
