package leetcode;

public class PivotIndex {
	public static int pivotIndex(int nums[]) {
		int index = 0;
		int leftSum = 0;
		int rightSum = 0;
		for (int k = 0; k < nums.length; k++) {
			if (index == 0) {
				leftSum = 0;
			}
			if (index == nums.length - 1) {
				rightSum = 0;
			}
			for (int i = 0; i < index; i++) {
				leftSum += nums[i];
			}
			for (int i = index + 1; i < nums.length; i++) {
				rightSum += nums[i];
			}
			if (leftSum == rightSum) {
				return index;
			} else {
				leftSum = 0;
				rightSum = 0;
				index++;
			}
		}
		return -1;
	}
}
