package problema_diagonal_negativos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, i, j, quantNeg, soma;
		
		System.out.print("Qual a ordem da matriz? ");
		N = sc.nextInt();
		
		int[][] mat = new int[N][N];
		
		for(i = 0; i < N; i++) {
			for(j = 0; j < N; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat [i][j] = sc.nextInt();
			}
		}
		
		System.out.println("DIAGONAL PRINCIPAL:");
		for(i = 0; i < N; i++) {
			if (i == i) {
				System.out.print(mat[i][i] + " ");
			}
		}
		
		System.out.println();
		soma = 0;
		for(i = 0; i < N; i++) {
			for(j = 0; j < N; j++) {
				if (mat[i][j] < 0) {
					soma = soma + i;
				}
			}
		}
		System.out.print("QUANTIDADE DE NEGATIVOS = " + soma);

		sc.close();
	}

}
