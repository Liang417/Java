package leetcode;

import java.util.*;

public class Spiral_Matrix {
	public List<Integer> spiralOrder(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		int row = 0;
		int column = 0;
		Integer[] res = new Integer[m * n];
		for (int i = 0; i < matrix.length * matrix[0].length; i++) {
			res[i] = matrix[row][column];
			if (column + 1 < n) {
				column++;
			} else if (row + 1 < m) {
				row++;
			} else if (column - 1 > 0) {
				column--;
			} else {
				row++;
			}
		}
		List<Integer> list = new ArrayList<>(Arrays.asList(res));
		return list;
	}
}
