package ex;

import java.util.*;

public class AnonymousListener {
	public static void main(final String[] args) {
		final String test1 = "5";// �[�Wfinal�׹����A�]���Q�������O�ޥΪ��ܼƤ��o�A���ܭ�
		final int test2 = 3;// ���M�S�[�W�A����ڤW�|�b�sĶ�ɸɤWfinal�׹�
		Comparator comparator = new Comparator() {
			@Override
			public int compareTo(int a, int b) {
				System.out.println(test1);
				System.out.println(test2);// �u�ntest2����S�Q�ק�N�ŦXfinal���p�A���q�`��ĳ�[�W�׹����קK�V�c
				// test2 = 4; ���~
				return a - b;
			}
		};
		
		comparator.compareTo(1, 1);
		// test2 = 4; ���~
	}
}
