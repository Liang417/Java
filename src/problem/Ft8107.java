package problem;

import java.util.Arrays;
import java.util.Scanner;

public class Ft8107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] score = new int[0];// �x�s��J������
		int[] id = new int[0];// �x�s�Ǹ�
		int count = 0;// �Ψӿ�O��J�ӴX������
		while (true) {
			int input = sc.nextInt();
			if (input == -1) {
				break;
			} else {
				score = Arrays.copyOf(score, score.length + 1);// �N���}�C����+1�ƻs�æ^��
				id = Arrays.copyOf(id, id.length + 1);
				score[count] = input;// �g�J����
				id[count] = ++count;// �g�J�Ǹ�
			}
		}
		int pattern = sc.nextInt();
		if (pattern == 1) {// �p��j
			for (int k = 0; k < score.length; k++) {
				for (int i = 0; i < score.length - 1; i++) {
					if (score[i] > score[i + 1]) {
						int temp = score[i + 1];
						score[i + 1] = score[i];
						score[i] = temp;
						int temp2 = id[i + 1];
						id[i + 1] = id[i];
						id[i] = temp2;
					}
				}
			}
		} else if (pattern == 2) {// �j��p
			for (int k = 0; k < score.length; k++) {
				for (int i = 0; i < score.length - 1; i++) {
					if (score[i] < score[i + 1]) {
						int temp = score[i + 1];
						score[i + 1] = score[i];
						score[i] = temp;
						int temp2 = id[i + 1];
						id[i + 1] = id[i];
						id[i] = temp2;
					}
				}
			}
		}

		for (int i = 0; i < score.length; i++) {
			System.out.println(id[i] + "." + score[i]);
		}
	}
}
