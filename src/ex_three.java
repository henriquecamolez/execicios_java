import java.util.Scanner;
public class ex_three {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
				
		int different = a * b - c * d;
		
		System.out.print("DIFERENCA = " + different);
		sc.close();

	}

}
