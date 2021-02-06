package application;

import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n,m;
		n =sc.nextInt();
		m =sc.nextInt();
		int[][] matriz = new int[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				matriz[i][j]= sc.nextInt();
			}
		}
		
		int valor = sc.nextInt();

			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					if(matriz [i][j] == valor) {
						System.out.println("posicao: "+i + ","+j);
						if (i>0) {
							int cima = matriz [i-1][j];
							System.out.println("cima: "+cima);
							}
						if (i<matriz.length-1) { 
							int baixo = matriz [i+1][j];
							System.out.println("baixo: "+baixo);
							}
							
						if (j>0) {
							int esquerda = matriz [i][j-1];
							System.out.println("esquerda: "+esquerda);
							}
						
						if (j<matriz[i].length-1) {
							int direita = matriz [i][j+1];
							System.out.println("direita: "+direita);
							}
					}
				}
			}

	
		sc.close();
	}

}
