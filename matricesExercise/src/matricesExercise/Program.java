package matricesExercise;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int matriceRow = sc.nextInt();
		int matriceColumn = sc.nextInt();

		int[][] matrice = new int[matriceRow][matriceColumn];

		for (int i = 0; i < matrice.length; i++) {
			for (int j = 0; j < matrice[i].length; j++) {
				matrice[i][j] = sc.nextInt();
			}
		}

		int matriceNumberInfo = sc.nextInt();

		for (int i = 0; i < matrice.length; i++) {
			for (int j = 0; j < matrice[i].length; j++) {
				if (matrice[i][j] == matriceNumberInfo) {
					System.out.println("Position " + i + "," + j + ":");

					int upElement = i > 0 ? matrice[i - 1][j] : -1;
					int downElement = i < matrice.length ? matrice[i + 1][j] : -1;
					int leftElement = j > 0 ? matrice[i][j - 1] : -1;
					int rightElement = j + 1 < matrice[i].length ? matrice[i][j + 1] : -1;

					if (leftElement >= 0) {
						System.out.println("Left: " + leftElement);
					}

					if (rightElement >= 0) {
						System.out.println("Right: " + rightElement);
					}

					if (upElement >= 0) {
						System.out.println("Up: " + upElement);
					}

					if (downElement >= 0) {
						System.out.println("Down: " + downElement);
					}
				}
			}
		}

		sc.close();
	}

}
