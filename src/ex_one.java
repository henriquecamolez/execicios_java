import java.util.Scanner;

public class ex_one {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numberOne = sc.nextInt();
		int numberTwo = sc.nextInt();
		int soma = numberOne + numberTwo ;
		
		System.out.println("Soma = " + soma);
		
		
		sc.close();

	}

}
