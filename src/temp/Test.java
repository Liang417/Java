package temp;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] mat = new int[3][];
		int[] arr = { 1, 2, 3 };
		int[] arr2 = { 4, 5, 6 };
		int[] arr3 = { 7, 8, 9 };
		mat[0] = arr;
		mat[1] = arr2;
		mat[2] = arr3;
		for (int i : findDiagonalOrder(mat)) {
			System.out.print(i+",");
		}

	}

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
				if (row - 1 >=0 && col + 1 < n) {
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