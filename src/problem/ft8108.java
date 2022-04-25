package problem;
import java.util.Scanner;

public class ft8108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int player = sc.nextInt();
		int round = sc.nextInt();
		int[] playerScore = new int[player];// ª±®a°O¤ÀªO
		for (int i = 0; i < round; i++) {
			int[] diceNumber = new int[player];
			int max = 0;
			for (int j = 0; j < player; j++) {
				diceNumber[j] = sc.nextInt();
				if (diceNumber[j] > max) {
					max = diceNumber[j];
				}
			}
			for (int j = 0; j < player; j++) {
				if (diceNumber[j] == max) {
					playerScore[j]++;
				}
			}
		}
		for (int i = 0; i < playerScore.length; i++) {
			System.out.println(playerScore[i]);
		}
	}

}
