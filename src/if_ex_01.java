import java.util.Scanner;
public class if_ex_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero inteiro: ");
		int num = sc.nextInt();
		
		if (num >= 0 ) {
			
			System.out.println("NAO NEGATIVO");
			
		}
		else {
			System.out.println("NEGATIVO");
		}
		
		sc.close();
	}

}
