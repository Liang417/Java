package problem;
import java.util.Scanner;

public class St101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		double number1 = input * 0.6;
		int number2 = (int)number1;
		if(number2 < number1) {
			number2 = number2+1;
			System.out.print(number2);
		}else {
			System.out.print((int)number1);
		}
	}
}