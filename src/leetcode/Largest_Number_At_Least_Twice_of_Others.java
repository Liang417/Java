package leetcode;

public class Largest_Number_At_Least_Twice_of_Others {
	public int dominantIndex(int[] nums) {
		int max = 0;
		int index = 0;
		if (nums.length == 1) {
			return 0;
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
				index = i;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (i == index) {
				continue;
			}
			if (nums[i] * 2 > max) {
				return -1;
			}
		}
		return index;
	}
}
