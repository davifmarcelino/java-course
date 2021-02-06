package application;

import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	Rectangle retangulo = new Rectangle();
	
	System.out.println("digite a altura do retangulo :");
	retangulo.altura = sc.nextDouble();
	
	System.out.println("digite a largura do retangulo :");
	retangulo.largura = sc.nextDouble();
	
	System.out.println("AREA = "+retangulo.area());
	System.out.println("PERIMETRO = "+retangulo.perimetro());
	System.out.println("DIAGONAL = "+retangulo.diagonal());
		
	sc.close();
	}

}
