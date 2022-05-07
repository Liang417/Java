package leetcode;

public class Diagonal_Traverse {
	public static int[] findDiagonalOrder(int[][] mat) {
		int row = 0;
		int col = 0;
		int m = mat.length;
		int n = mat[0].length;
		int[] result = new int[mat.length * mat[0].length];

		for (int i = 0; i < result.length; i++) {
			result[i] = mat[row][col];
			if ((row + col) % 2 != 0) {
				if (row + 1 < m && col - 1 >= 0) {
					row += 1;
					col -= 1;
				} else if (row + 1 < m) {
					row += 1;
				} else {
					col += 1;
				}
			} else {// %2==0
				if (row - 1 >= 0 && col + 1 < n) {
					row -= 1;
					col += 1;
				} else if (col + 1 < n) {
					col += 1;
				} else {
					row += 1;
				}
			}
		}
		return result;
	}
}