package leetcode;

import java.util.*;

public class Diagonal_Traverse_v2{
	public int[] findDiagonalOrder(int[][] mat) {
		int m = mat.length;
		int n = mat[0].length;
		Map<Integer, List<Integer>> dict = new HashMap();
		// current position = (row,column)
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				int indexSum = i + j;
				// �p�Gkey�s�b �N�s�Wvalue��List�̭�
				if (dict.containsKey(indexSum)) {
					dict.get(indexSum).add(mat[i][j]);
				} else {
					// �_�h �إ�key-value pair
					dict.put(indexSum, new ArrayList<Integer>());
					dict.get(indexSum).add(mat[i][j]);
				}
			}
		}
		int[] res = new int[m * n];
		int k = 0;
		for (Integer key : dict.keySet()) {
			// key����OindexSum ��2���l �P�_�O�_�ݭn����
			if (key % 2 == 0) {
				Collections.reverse(dict.get(key));
			}
			for (Integer i : dict.get(key)) {
				res[k++] = i;
			}
		}
		return res;
	}
}