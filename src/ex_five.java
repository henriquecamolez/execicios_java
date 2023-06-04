import java.util.Scanner;
import java.util.Locale;


public class ex_five {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int code_item1 = sc.nextInt();
		int number_item1 = sc.nextInt();
		double value_item1 = sc.nextDouble();
		int code_item2 = sc.nextInt();
		int number_item2 = sc.nextInt();
		double value_item2 = sc.nextDouble();	
		double debt = number_item1 * value_item1 + number_item2 * value_item2; 
		
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", debt);
		
		
		sc.close();
	}

}
