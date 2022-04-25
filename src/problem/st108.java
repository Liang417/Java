package problem;

import java.util.Scanner;

public class st108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dataSet = sc.nextInt();// 幾組資料
		for (int i = 0; i < dataSet; i++) {
			double K = sc.nextInt();// 攀爬高度
			double L = sc.nextInt();// 下降高度
			double X = sc.nextInt();// 總高
			double F = sc.nextInt();// 疲勞因子
			double remaining = X;// 剩餘高度
			int daysCount = 0;
			while (true) {
				daysCount++;
				if (daysCount == 1) {
					remaining -= K;// 第一天無F
				} else {
					remaining -= K * (1 - ((daysCount - 1) * F / 100));// 第二天起考慮F
				}
				if (remaining <= 0) {// 如果剩餘高度<=0 表示到達頂端
					System.out.println("success-" + daysCount);
					break;
				}
				remaining += L;// 晚上下降高度L
				if (remaining >= X) {// 如果剩餘高度>=X 表示落回地面
					System.out.println("fail-" + daysCount);
					break;
				}
			}
		}
	}
}
