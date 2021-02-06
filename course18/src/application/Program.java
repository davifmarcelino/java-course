package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		String origem =  "C:\\Users\\Usuario\\Desktop\\material java\\in.txt";
		
		List<Product> list = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader(origem))){
		String line = br.readLine();
		while (line != null) {
			String[] split = line.split(",");
			String nome = split[0];
			double preco = Double.parseDouble(split[1]);
			int quantidade = Integer.parseInt(split[2]);
			list.add(new Product(nome, preco, quantidade));
			line = br.readLine();
			}
		}
		catch(IOException e){
			System.out.println("Erro: "+e.getMessage());
		}
		boolean success =  new File("C:\\Users\\Usuario\\Desktop\\material java\\out").mkdir();
		if(success == true) {
			String destino =  "C:\\Users\\Usuario\\Desktop\\material java\\out\\summary.csv";
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(destino))){
				for(Product p : list) {
					bw.write(p.toString());
					bw.newLine();
				}
			}
			catch(IOException e){
			System.out.println("Erro: "+e.getMessage());
			}
		}
	}
}
