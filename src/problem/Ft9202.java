package problem;

import java.util.Scanner;

public class Ft9202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();//uesless
		sc.nextLine();
		String str = sc.nextLine();
		int rootLength = sc.nextInt();//uesless
		sc.nextLine();
		String root = sc.nextLine();
		for (String retval : root.split(" ")) {
			str = str.replaceAll(retval, "");
		}
		if (str.length() == 0) {
			System.out.print(true);
		}else {
			System.out.print(false);
		}
		sc.close();
	}

}
