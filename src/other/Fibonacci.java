package other;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0,1,1,2,3,5,8,13,21......
//		int a = 0, b = 1;
//		int n = 10;
//		for (int i = 2; i <= n; i++) {
//			int temp = b;
//			b = a+b;
//			a = temp;
//			System.out.println(b);
//		}
		for (int i = 0; i <= 10; i++) {
			System.out.println(cal(i));
		}
	}

	public static int cal(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		return (cal(n - 1) + cal(n - 2));
	}
}