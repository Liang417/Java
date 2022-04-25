package problem;
import java.util.Scanner;

public class Ft10102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		解題方向
		先建立完整無缺的字卡陣列
		把完整無缺的字卡陣列  減去系統所給剩下的字卡
		相減後即可得到缺失的部分 
		*/
		Scanner sc = new Scanner(System.in);
		int cardNum = sc.nextInt();
		int[] realArr = new int[cardNum];
		for (int i = 0; i < realArr.length; i++) {// 依張數 建立一個無缺少的字卡陣列
			realArr[i] = i + 1;
		}

		for (int a = 0; a < cardNum; a++) {
			int deleteIndex = findIndex(realArr, sc.nextInt());
			if (deleteIndex == -1) {//如果找不到就跳過
				continue;
			} else {//找到的話就從陣列中刪除
				realArr = delete(realArr, deleteIndex);
			}
		}

		if (realArr.length == 0) {//如果陣列長度==0代表被刪除光了  也就是紙卡無缺失
			System.out.print("0");
		} else {
			for (int i = 0; i < realArr.length; i++) {
				if (i == realArr.length - 1) {
					System.out.print(realArr[i]);
				} else {
					System.out.print(realArr[i] + " ");
				}
			}
		}
	}
	//利用複製陣列  把出現過的字卡移出陣列
	public static int[] delete(int[] realArr, int deleteIndex) {
		int[] newArr = new int[realArr.length - 1];
		int remainingElements = realArr.length - (deleteIndex + 1);
		System.arraycopy(realArr, 0, newArr, 0, deleteIndex);// 把要刪除的index之前的都複製下來
		System.arraycopy(realArr, deleteIndex + 1, newArr, deleteIndex, remainingElements);// 跳過要刪除的把剩的都複製進去
		return newArr;
	}
	//找到帶入的sc並回傳所在index
	public static int findIndex(int[] arr, int sc) {
		int b = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == sc) {
				b = i;
				break;
			}
		}
		return b;
	}
}