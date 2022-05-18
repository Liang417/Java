package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pascal_Triangle_119 {
	public List<Integer> getRow(int numRows) {
//		先創建初始陣列
//		再根據題目給的數字  迭代出目標陣列
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> firstList = Arrays.asList(1);
		list.add(firstList);
		if (numRows == 0) {
			return list.get(numRows);
		}
		for (int i = 1; i <= numRows; i++) {// i代表第幾個list =>numRows=i+1 (+1是因為最前面有先把第一個拉出來創建)
			List<Integer> nextList = new ArrayList<Integer>();// 建立下一個list
			nextList.add(0, 1);// 頭尾都先放1
			nextList.add(1, 1);
			for (int j = 1; j <= list.get(i - 1).size() - 1; j++) {
				// nestList中 j位子的值會等於,前一個list中 索引值為j-1跟j兩個相加
				int temp = list.get(i - 1).get(j - 1) + list.get(i - 1).get(j);
				nextList.add(j, temp); // j+1是因為list最前面第一個值一定是1,要add在1後面
			}
			list.add(nextList);
		}
		return list.get(numRows);
	}
}
