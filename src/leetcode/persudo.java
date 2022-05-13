package leetcode;

import java.util.ArrayList;
import java.util.List;

public class persudo {
	public List<Integer> spiralOrder(int[][] matrix) {
		int rowUp = 0;
		int columnLeft = 0;
		int rowDown = matrix.length - 1;
		int columnRight = matrix[0].length - 1;
		List<Integer> list = new ArrayList<>();
		while (rowUp <= rowDown && columnLeft <= columnRight) {
			for (int i = columnLeft; i <= columnRight; i++) {
				list.add(matrix[rowUp][i]);
			}
			rowUp++;
			for (int i = rowUp; i <= rowDown; i++) {
				list.add(matrix[i][columnRight]);
			}
			columnRight--;
			for (int i = columnRight; i >= columnLeft; i--) {
				list.add(matrix[rowDown][i]);
			}
			rowDown--;

			if (rowDown >= rowUp) {
				for (int i = rowDown; i < rowUp; i--) {
					list.add(matrix[i][columnLeft]);
				}
				columnLeft--;
			}
			break;
		}
		return list;
	}
}
