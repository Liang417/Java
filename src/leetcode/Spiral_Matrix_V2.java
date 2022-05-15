package leetcode;

import java.util.*;
//concept:https://leetcode.com/explore/learn/card/array-and-string/202/introduction-to-2d-array/1168/discuss/20571/1-liner-in-Python-+-Ruby?page=9

public class Spiral_Matrix_V2 {
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> list = new ArrayList<Integer>();
		list = func(list,matrix);
		return list;
	}

	public static List<Integer> func(List<Integer> list, int[][] matrix) {
		if (matrix[0].length == 0) {
			return list;
		} else {
			for (int i : matrix[0]) {// 取 first column加入List
				list.add(i);
			}
			int m = matrix.length;
			int n = matrix[0].length;
			int[][] matrix2 = new int[m - 1][n];// 存放剩餘的數字
			for (int i = 0; i < matrix2.length; i++) {
				matrix2[i] = matrix[i + 1];
			}
			int[][] rotateMatrix = new int[n][m - 1];// 行列交換
			for (int i = 0; i < rotateMatrix.length; i++) {
				for (int j = 0; j < rotateMatrix[0].length; j++) {
					rotateMatrix[i][j] = matrix2[j][n - 1];
				}
				n--;
			}
			func(list, rotateMatrix);
		}
		return list;
	}
}
