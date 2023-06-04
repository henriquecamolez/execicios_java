import java.util.Scanner;
public class if_ex_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora inicial:");
		int hourStart = sc.nextInt();
		System.out.println("Digite a hora final:");
		int hourEnd = sc.nextInt();
		int game;
		
		if(hourStart < hourEnd) {
			game = hourStart - hourEnd;
			System.out.printf("O JOGO DUROU %d HORA(S)",game);
		}
		
		else {
			game = 24 - hourStart + hourEnd ;
			System.out.printf("O JOGO DUROU %d HORA(S)",game);
			
		}
		
		sc.close();
	}

}
