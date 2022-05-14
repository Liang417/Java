package leetcode;

import java.util.*;

public class Spiral_Matrix {
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> res = new ArrayList<Integer>();
		int up = 0;
		int down = matrix.length-1;
		int right = matrix[0].length-1;
		int left = 0;
		int dir = 0;
		while (down >= up && right >= left) {
			switch (dir) {
			case 0:// traverse right
				for (int i = left; i <= right; i++) {
					res.add(matrix[up][i]);
				}
				up++;
				break;
			case 1:// traverse down
				for (int i = up; i <= down; i++) {
					res.add(matrix[i][right]);
				}
				right--;
				break;
			case 2:// traverse left
				for (int i = right; i >= left; i--) {
					res.add(matrix[down][i]);
				}
				down--;
				break;
			case 3:// traverse up
				for (int i = down; i >= up; i--) {
					res.add(matrix[i][left]);
				}
				left++;
				break;
			}
			dir = (dir + 1) % 4;
		}
		return res;
	}
}
