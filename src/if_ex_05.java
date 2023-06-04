import java.util.Scanner;
import java.util.Locale;
public class if_ex_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite o código do produto:");
		int code = sc.nextInt();
		
		System.out.println("Digite a quantidade do produto:");
		int amount = sc.nextInt();
		
		double price;
		double total;
		
		if (code == 1) {
			
			price = 4.00;
			total = price * amount;
			
			System.out.printf("Total: R$ %.2f", total);
		}
	
		else if (code == 2) {
			
			price = 4.50;
			total = price * amount;
			
			System.out.printf("Total: R$ %.2f", total);
		}
		
		else if (code == 3) {
			
			price = 5.00;
			total = price * amount;
			
			System.out.printf("Total: R$ %.2f", total);
		}
		
		else if (code == 4) {
			
			price = 2.00;
			total = price * amount;
			
			System.out.printf("Total: R$ %.2f", total);
			
		}
		else if (code == 5) {
			
			price = 1.50;
			total = price * amount;
			
			System.out.printf("Total: R$ %.2f", total);
		}
		
		sc.close();
		
	}

}
