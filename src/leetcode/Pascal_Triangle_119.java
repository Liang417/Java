package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pascal_Triangle_119 {
	public List<Integer> getRow(int numRows) {
//		���Ыت�l�}�C
//		�A�ھ��D�ص����Ʀr  ���N�X�ؼа}�C
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> firstList = Arrays.asList(1);
		list.add(firstList);
		if (numRows == 0) {
			return list.get(numRows);
		}
		for (int i = 1; i <= numRows; i++) {// i�N��ĴX��list =>numRows=i+1 (+1�O�]���̫e��������Ĥ@�өԥX�ӳЫ�)
			List<Integer> nextList = new ArrayList<Integer>();// �إߤU�@��list
			nextList.add(0, 1);// �Y��������1
			nextList.add(1, 1);
			for (int j = 1; j <= list.get(i - 1).size() - 1; j++) {
				// nestList�� j��l���ȷ|����,�e�@��list�� ���ޭȬ�j-1��j��Ӭۥ[
				int temp = list.get(i - 1).get(j - 1) + list.get(i - 1).get(j);
				nextList.add(j, temp); // j+1�O�]��list�̫e���Ĥ@�ӭȤ@�w�O1,�nadd�b1�᭱
			}
			list.add(nextList);
		}
		return list.get(numRows);
	}
}
