package problem;

import java.util.Scanner;

public class st108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dataSet = sc.nextInt();// �X�ո��
		for (int i = 0; i < dataSet; i++) {
			double K = sc.nextInt();// �k������
			double L = sc.nextInt();// �U������
			double X = sc.nextInt();// �`��
			double F = sc.nextInt();// �h�Ҧ]�l
			double remaining = X;// �Ѿl����
			int daysCount = 0;
			while (true) {
				daysCount++;
				if (daysCount == 1) {
					remaining -= K;// �Ĥ@�ѵLF
				} else {
					remaining -= K * (1 - ((daysCount - 1) * F / 100));// �ĤG�Ѱ_�Ҽ{F
				}
				if (remaining <= 0) {// �p�G�Ѿl����<=0 ��ܨ�F����
					System.out.println("success-" + daysCount);
					break;
				}
				remaining += L;// �ߤW�U������L
				if (remaining >= X) {// �p�G�Ѿl����>=X ��ܸ��^�a��
					System.out.println("fail-" + daysCount);
					break;
				}
			}
		}
	}
}
