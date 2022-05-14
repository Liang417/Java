package leetcode;

import java.util.ArrayList;
import java.util.List;

public class persudo {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		List<Integer> list = new ArrayList<>();
		list = func(list, matrix);

	}

	public static List<Integer> func(List<Integer> list, int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		if (matrix[0].length == 0) {
			return list;
		} else {
			int[][] newMatrix = new int[n][m-1];
			for (int i = 0,k = 1; i < newMatrix.length; i++) {
				for (int j = 0,l = n-1; j < newMatrix[0].length; j++) {
					newMatrix[i][j] = matrix[1][2];
				}
			}
			for(int i : newMatrix[0] ) {
				list.add(i);
			}
			func(list, newMatrix);
		}
		return list;
	}
}
