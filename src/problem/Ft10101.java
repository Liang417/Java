package problem;
import java.util.Scanner;

public class Ft10101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int set = sc.nextInt();//�r��ƥ�
		String[] strArr = new String[set];//�إߦr��}�C
		for (int i = 0; i < set; i++) {
			@SuppressWarnings("unused")
			int useless1 = sc.nextInt();  //�D�ص��C�զr�ꪺ���� �����ϥΫ᭱���|�Ψ�
		}
		for (int i = 0; i < set; i++) {
			strArr[i] = sc.next();	//���D�ص����r��s�J
		}
		@SuppressWarnings("unused")
		int useless2 = sc.nextInt(); //�D�ص��Կ�r�ꪺ����  �Τ���
		String candidate = sc.next(); //�Կ�r��
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
