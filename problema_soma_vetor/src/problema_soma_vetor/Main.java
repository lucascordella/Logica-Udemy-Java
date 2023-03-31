package problema_soma_vetor;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int N, i;
		double soma, media;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		N = sc.nextInt();
		
		double[] vet = new double[N];
		
		for (i = 0; i < N; i++){
			System.out.print("Digite um numero: ");
			vet [i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.print("VALORES = ");
		for (i = 0; i < N; i++) {
			System.out.print(String.format("%.1f ", vet[i]));
		}
		
		System.out.println();
		soma = 0;
		for (i = 0; i < N; i++) {
			soma = soma + vet[i];
		}
		System.out.print("SOMA = " + String.format("%.2f", soma));
		
		System.out.println();
		media = soma / N;
		System.out.print("MEDIA = " + String.format("%.2f",media));

		sc.close();
	}

}
