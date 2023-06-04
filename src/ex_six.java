import java.util.Locale;
import java.util.Scanner;


public class ex_six {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double triangulo = a * c / 2;
		double circulo = 3.14159 * Math.pow(c,2);
		double trapezio = (a + b) * c / 2;
		double quadrado = Math.pow(b,2);
		double retangulo = a * b;
		
		System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f", triangulo, circulo, trapezio, quadrado, retangulo);
		
		sc.close();
	}

}
