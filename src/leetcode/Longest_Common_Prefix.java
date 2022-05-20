package leetcode;

public class Longest_Common_Prefix {

	public String longestCommonPrefix(String[] strs) {
		StringBuilder sb = new StringBuilder();
		int minLen = 200;
		int index = 0;
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].length() <= minLen) {
				minLen = strs[i].length();
				index = i;
			}
		}
		if(minLen==0) {
			return sb.toString();
		}
		for (int i = 0; i < strs.length; i++) {
			int j = 0;
			for (j = 0; j < strs[index].length(); j++) {
				if (strs[i].charAt(j) != strs[index].charAt(j)) {
					return sb.toString();
				}
			}
			sb.append(strs[index].charAt(j-1));
		}
		return sb.toString();
	}
}
