package problem;
import java.util.Scanner;

public class Ft10101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int set = sc.nextInt();//字串數目
		String[] strArr = new String[set];//建立字串陣列
		for (int i = 0; i < set; i++) {
			@SuppressWarnings("unused")
			int useless1 = sc.nextInt();  //題目給每組字串的長度 不須使用後面不會用到
		}
		for (int i = 0; i < set; i++) {
			strArr[i] = sc.next();	//把題目給的字串存入
		}
		@SuppressWarnings("unused")
		int useless2 = sc.nextInt(); //題目給候選字串的長度  用不到
		String candidate = sc.next(); //候選字串
		int result = 0;
		for (int i = 0; i < strArr.length; i++) {
			StringBuilder sb = new StringBuilder(strArr[i]); //
			StringBuilder sbCand = new StringBuilder(candidate);
			int k = 0;
			for (k = 0; k < sb.length(); k++) {
				if (sbCand.indexOf(String.valueOf(sb.charAt(k))) != -1) {
					sbCand.deleteCharAt(sbCand.indexOf(String.valueOf(sb.charAt(k))));
				} else {
					break;
				}
			}
			if (k == sb.length()) {
				result += sb.length();
			}
		}
		System.out.print(result);
		sc.close();
	}
}
