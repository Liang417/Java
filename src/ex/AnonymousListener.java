package ex;

import java.util.*;

public class AnonymousListener {
	public static void main(final String[] args) {
		final String test1 = "5";// 加上final修飾詞，因為被內部類別引用的變數不得再改變值
		final int test2 = 3;// 雖然沒加上，但實際上會在編譯時補上final修飾
		Comparator comparator = new Comparator() {
			@Override
			public int compareTo(int a, int b) {
				System.out.println(test1);
				System.out.println(test2);// 只要test2後續沒被修改就符合final情況，但通常建議加上修飾詞避免混淆
				// test2 = 4; 錯誤
				return a - b;
			}
		};
		
		comparator.compareTo(1, 1);
		// test2 = 4; 錯誤
	}
}
