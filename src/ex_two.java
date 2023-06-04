import java.util.Scanner;
import java.util.Locale;
public class ex_two {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double ray = sc.nextDouble();
		double area = pi * Math.pow(ray, 2);
		
		System.out.printf("A = %.4f", area);
		
		sc.close();

	}

}
