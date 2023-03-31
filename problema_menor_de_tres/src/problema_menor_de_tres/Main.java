package problema_menor_de_tres;
import java.util.Locale;
import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int X, Y, Z;
		
		System.out.print("Primeiro valor: ");
		X = sc.nextInt();
		System.out.print("Segundo valor: ");
		Y = sc.nextInt();
		System.out.print("Terceiro valor: ");
		Z = sc.nextInt();
		
		System.out.print("MENOR = "); 
		if (X < Y && X < Z) {
			System.out.print(X);
		}
		else if (Y < X && Y < Z) {
			System.out.print(Y);
		}
		else{
			System.out.print(Z);
		}

		sc.close();
	}
}
