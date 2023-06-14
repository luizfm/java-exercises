package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int matriceSize = sc.nextInt();
		
		int[][] matrice = new int[matriceSize][matriceSize];
		
		for(int i = 0; i < matrice.length; i++) {
			for(int j = 0; j < matrice[i].length; j++) {
				matrice[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal: ");
		int countNegativeNumbers = 0;
		for(int i = 0; i < matrice.length; i++) {
			for(int j = 0; j < matrice[i].length; j++) {
				if(j == i) {
					System.out.printf(matrice[i][j] + " ");
				}
				
				if(matrice[i][j] < 0) {
					countNegativeNumbers += 1;
				}
			}
		}
		
		System.out.printf("%nNegative numbers = " + countNegativeNumbers);
		
		sc.close();
	}

}
