package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> products = new ArrayList<>();
		
		System.out.print("Digite a quantidade de produtos: ");
		int quantidade  = sc.nextInt();
		
		for(int i=1;i<=quantidade;i++) {
			System.out.printf("Produto #"+i+" :\n");
			System.out.print("Comum, Usado ou  Importado (c/u/i)? ");
			sc.nextLine();
			char tipo = sc.next().charAt(0);
			if(tipo == 'c') {
				sc.nextLine();
				System.out.print("Nome: ");
				String name = sc.nextLine();
				System.out.print("Preco: ");
				double price  = sc.nextDouble();
				products.add(new Product(name,price));
			}
			else if(tipo == 'u') {
				sc.nextLine();
				System.out.print("Nome: ");
				String name = sc.nextLine();
				System.out.print("Preco: ");
				double price  = sc.nextDouble();
				System.out.print("Data de fabricacao: ");
				Date date = sdf.parse(sc.next());
				products.add(new UsedProduct(name,price,date));
			}
			else {
				sc.nextLine();
				System.out.print("Nome: ");
				String name = sc.nextLine();
				System.out.print("Preco: ");
				double price  = sc.nextDouble();
				System.out.print("Custo adicional: ");
				double customsFee  =  sc.nextDouble();
				products.add(new ImportedProduct(name,price,customsFee));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for(Product list :  products) {
			System.out.println(list);
		}
		
		sc.close();
	}

}
