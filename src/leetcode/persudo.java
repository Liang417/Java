package leetcode;

import java.util.ArrayList;
import java.util.List;

public class persudo {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		List<Integer> list = new ArrayList<>();
		for(int i : matrix[0]) {
			list.add(i);
		}
		list = func(list, matrix);
		System.out.print(list);

	}

	public static List<Integer> func(List<Integer> list, int[][] matrix) {
		if (matrix[0].length == 0) {
			return list;
		} else {
			int m = matrix.length;
			int n = matrix[0].length;
			int[][] newArr = new int[m - 1][n];// �Ыإ�½��e���}�C
			for (int i = 0; i < newArr.length; i++) {// �⤸���ƻs�i�h(�٥�½��)
				newArr[i] = matrix[i + 1];
			}
			int[][] rotationArr = new int[n][m - 1];// �Ы�½��᪺�}�C
			for (int i = 0; i < rotationArr.length; i++) {// ��i����
				for (int j = 0; j < rotationArr[0].length; j++) {
					rotationArr[i][j] = newArr[j][n - 1];
				}
				n--;
			}
			for (int i : rotationArr[0]) {
				list.add(i);
			}
			func(list, rotationArr);
		}
		return list;
	}
}
