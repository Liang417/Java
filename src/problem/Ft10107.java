package problem;
import java.util.Scanner;

public class Ft10107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] apple = new int[sc.nextInt()];
		int sumA = 0;// �p�_
		int sumB = 0;// �j�_
		for (int i = 0; i < apple.length; i++) {
			apple[i] = sc.nextInt();
		}
		int take1 = 0;
		int take2 = apple.length - 1;
		for (int i = 1; i <= apple.length; i++) {
			if (i % 2 != 0) {// �p�_��
				if (apple[take1] > apple[take2]) {//��h���﮳
					sumA+=apple[take1];
					take1++;
				}else {
					sumA+=apple[take2];
					take2--;
				}
			}else {//�j�_��
				if (apple[take1] > apple[take2]) {//��h���﮳
					sumB+=apple[take1];
					take1++;
				}else {
					sumB+=apple[take2];
					take2--;
				}
			}
		}
		if (sumA > sumB)
		{
			System.out.print("�p�_");
		} else {
			System.out.print("�j�_");
		}
	}
}
