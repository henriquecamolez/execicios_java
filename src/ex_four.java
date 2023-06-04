import java.util.Scanner;
import java.util.Locale;
public class ex_four {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int employee = sc.nextInt();
		int workedHour = sc.nextInt();
		double priceHour = sc.nextDouble();
		double salary = workedHour * priceHour;
		
		System.out.println("NUMBER = " + employee);
		System.out.printf("SALARY = U$ %.2f", salary);
		
		
		
		
		
		
		
		sc.close();

	}

}
