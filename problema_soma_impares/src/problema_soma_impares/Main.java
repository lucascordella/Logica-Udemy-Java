package problema_soma_impares;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int X, Y, i, troca, soma;
		
		System.out.println("Digite dois numeros: ");
		X = sc.nextInt();
		Y = sc.nextInt();
		
		if (X > Y) {
			troca = X;
			X = Y;
			Y = troca;
		}
		
		soma = 0; 
		for (i = X + 1; i < Y; i++) {
			if (i % 2 != 0) {
				soma = soma + i;
			}
		}
		
		System.out.print("SOMA DOS IMPARES = " + soma);
		
		sc.close();
	}
}
