package leetcode;

import java.util.*;

public class Main {
	public int[] findDiagonalOrder(int[][] mat) {
		int m = mat.length;
		int n = mat[0].length;
		List<List<Integer>> dict = new ArrayList<>();
		for (int i = 0; i < m + n - 1; i++) {
			dict.add(new ArrayList<>());
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int indexSum = i + j;
				if (indexSum % 2 == 0) {
					dict.get(indexSum).add(0, mat[i][j]);
				} else {
					dict.get(indexSum).add(mat[i][j]);
				}
			}
		}
		int[] result = new int[m * n];
		int index = 0;
		for (List<Integer> tempList : dict) {
			for (Integer i : tempList) {
				result[index++] = i;
			}
		}
		return result;
	}
}