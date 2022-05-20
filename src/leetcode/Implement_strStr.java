package leetcode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Implement_strStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(strStr("Hello",""));
	}
	public static int strStr(String haystack, String needle) {
		Pattern p = Pattern.compile(needle);
		Matcher m = p.matcher(haystack);
		if(m.find(0)) {
			return m.start();
		}else {
			return -1;
		}
	}
}
