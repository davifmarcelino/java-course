package course5;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite a quantidade du numeros interios a ser digitado");
		int quant = sc.nextInt();
		while(quant<=0) {
			System.out.println("valor  invalido, digite novamente!");
			quant = sc.nextInt();
		}
		int maior = Integer.MIN_VALUE;
		int valor_dig;
		for(int  i = 1; i<=quant ;  i ++) {
			System.out.print("valor#"+i+":");
			valor_dig=sc.nextInt();
			if(maior<valor_dig) {
				maior=valor_dig;
			}
		}
		System.out.println("maior valor = "+maior);
	
		sc.close();
	}

}
