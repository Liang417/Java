package leetcode;

public class Plus_One {
	public static int[] plusOne(int[] digits) {
		digits[digits.length - 1] += 1;
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] == 10) {
				if (i == 0) {
					int[] newArr = new int[digits.length + 1];
					newArr[0] = 1;
					return newArr;
				}
				digits[i] = 0;
				digits[i - 1] += 1;
			} else {
				return digits;
			}
		}
		return digits;
	}
}
