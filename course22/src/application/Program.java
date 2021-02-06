package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {

		List<Funcionario> list = new ArrayList<>();
		String path = "C:\\Users\\Usuario\\Desktop\\material java\\in3.txt";
		Scanner sc = new Scanner(System.in);

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {
				String[] split = line.split(",");
				String nome = split[0];
				String email = split[1];
				double salario = Double.parseDouble(split[2]);
				list.add(new Funcionario(nome, email, salario));
				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Error: "+e.getMessage());
		}
		System.out.print("Digite um valor de salario minimo a ser selecionado: ");
		double valor = sc.nextDouble();
		
		
		List<String> email = list.stream().filter(s->s.getSalario()>valor).map(e->e.getEmail()).sorted().collect(Collectors.toList());
		
		for(String f: email ) {
			System.out.println(f);
		}
		double soma = list.stream().filter(f->f.getNome().charAt(0)=='M').map(x->x.getSalario()).reduce(0.0,(x,y)->x+y);
	
		System.out.println("Soma dos salarios das pessoas que começam com a letra M é: "+soma);
		sc.close();
	}

}
