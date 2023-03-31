package problema_retangulo;
import java.util.Locale;
import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 

		double base, altura, area, perimetro, diagonal;
		
		System.out.print("Base do retangulo: ");
		base = sc.nextDouble();
		System.out.print("Altura do retangulo: ");
		altura = sc.nextDouble();
		
		area = base * altura; 
		System.out.println("AREA = " + String.format("%.4f", area));
		
		perimetro = (2 * base) + (2 * altura); 
		System.out.println("PERIMETRO = " + String.format("%.4f", perimetro));
		
		diagonal = Math.sqrt((base * base) + (altura * altura));
		System.out.println("DIAGONAL = " + String.format("%.4f", diagonal));

		sc.close();
	}

}
