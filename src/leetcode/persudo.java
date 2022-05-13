package leetcode;

import java.util.ArrayList;
import java.util.List;

public class persudo {
	public List<Integer> spiralOrder(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		int up = 0;
		int left = 0;
		int down = m - 1;
		int right = n - 1;
		int dir = 0;
		List<Integer> list = new ArrayList<>();
		while (up <= down && left <= right) {
			switch (dir) {
			case 0:// right
				for (int i = left; i <= right; i++) {
					list.add(matrix[up][i]);
				}
				up++;
				break;
			case 1:// down
				for (int i = up; i <= down; i++) {
					list.add(matrix[i][right]);
				}
				right--;
				break;
			case 2:// left
				for (int i = right; i >= left; i--) {
					list.add(matrix[down][i]);
				}
				down--;
				break;
			case 3:// up
				for (int i = down; i >= up; i--) {
					list.add(matrix[i][left]);
				}
				left++;
				break;
			}
			dir = (dir + 1) % 4;
		}
		return list;
	}
}
