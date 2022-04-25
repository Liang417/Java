package problem;
import java.util.Scanner;

public class Ft10102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		���D��V
		���إߧ���L�ʪ��r�d�}�C
		�⧹��L�ʪ��r�d�}�C  ��h�t�Ωҵ��ѤU���r�d
		�۴��Y�i�o��ʥ������� 
		*/
		Scanner sc = new Scanner(System.in);
		int cardNum = sc.nextInt();
		int[] realArr = new int[cardNum];
		for (int i = 0; i < realArr.length; i++) {// �̱i�� �إߤ@�ӵL�ʤ֪��r�d�}�C
			realArr[i] = i + 1;
		}

		for (int a = 0; a < cardNum; a++) {
			int deleteIndex = findIndex(realArr, sc.nextInt());
			if (deleteIndex == -1) {//�p�G�䤣��N���L
				continue;
			} else {//��쪺�ܴN�q�}�C���R��
				realArr = delete(realArr, deleteIndex);
			}
		}

		if (realArr.length == 0) {//�p�G�}�C����==0�N��Q�R�����F  �]�N�O�ȥd�L�ʥ�
			System.out.print("0");
		} else {
			for (int i = 0; i < realArr.length; i++) {
				if (i == realArr.length - 1) {
					System.out.print(realArr[i]);
				} else {
					System.out.print(realArr[i] + " ");
				}
			}
		}
	}
	//�Q�νƻs�}�C  ��X�{�L���r�d���X�}�C
	public static int[] delete(int[] realArr, int deleteIndex) {
		int[] newArr = new int[realArr.length - 1];
		int remainingElements = realArr.length - (deleteIndex + 1);
		System.arraycopy(realArr, 0, newArr, 0, deleteIndex);// ��n�R����index���e�����ƻs�U��
		System.arraycopy(realArr, deleteIndex + 1, newArr, deleteIndex, remainingElements);// ���L�n�R������Ѫ����ƻs�i�h
		return newArr;
	}
	//���a�J��sc�æ^�ǩҦbindex
	public static int findIndex(int[] arr, int sc) {
		int b = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == sc) {
				b = i;
				break;
			}
		}
		return b;
	}
}