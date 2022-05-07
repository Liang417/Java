package leetcode;

class Solution {
	public static int[] findDiagonalOrder(int[][] mat) {
		int m = mat.length;
		int n = mat[0].length;
		int[] result = new int[m * n];
		// the current position (row,column)
		int row = 0;
		int column = 0;
		for (int i = 0; i < result.length; i++) {
			result[i] = mat[row][column];
			int indexSum = row + column;
			if (indexSum % 2 == 0) {
				if (row - 1 >= 0 && column + 1 < n) {
					row--;
					column++;
				} else if (column + 1 < n) {
					column++;
				} else {
					row++;
				}
			} else {// indexSum is odd
				if (row + 1 < m && column - 1 >= 0) {
					row++;
					column--;
				} else if (row + 1 < m) {
					row++;
				} else {
					column++;
				}
			}
		}
		return result;
	}
}