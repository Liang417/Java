package temp;
/* �D������:�r�����B��
 * �D�غ��}:
 * https://e-tutor.itsa.org.tw/e-Tutor/mod/programming/view.php?a=3578
 */
import java.util.*;

public class C_ST59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] arr = new char[26];
		int asciiValue = 97;// �qa�}�l
		for (int i = 0; i < arr.length; i++) {// �إ�a-z�r���}�C
			arr[i] = (char) asciiValue++;
		}
		char[] newArr = Arrays.copyOf(arr, arr.length);
		for (int i = 0; i < 5; i++) {
			int index = sc.nextInt();
			int shift = sc.nextInt();
			newArr[index] = function(arr, index, shift);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(newArr[i]);
		}
		System.out.println();
	}

	public static char function(char[] arr, int index, int shift) {
		int temp = (index + shift) % 26;
		if (temp < 0) {
			return arr[26 + (index + shift) % 26];//
		} else {
			return arr[temp];
		}
	}
}
