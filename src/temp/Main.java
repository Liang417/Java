package temp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Student[] students = new Student[2];
		int count = 0;
//		String t1 = input("t1請輸入文字", 3, true);
//		String t2 = input("t2請輸入文字", 4, false);
		do {
			int opt = input("請選擇功能", 1, 6, null, false);
			switch (opt) {
			case 1:
				int seat = input("請輸入功能", 1, 100, null, true);
				String schoolclass = input("請輸入班級", 1, true);
				String name = input("請輸入姓名", 3, true);
				if (students.length == count) {
					students = doubleArr(students);
				}
				students[count++] = new Student(seat, schoolclass, name);
				break;
			case 2:
				Student student = getStudent(input("請輸入座號", 1, 100, null, true), students, count);
				if (student == null) {
					System.out.println("找不到學生");
				} else {
					student.print();
				}
			case 6:
				System.exit(0);
			}
		} while (true);
	}

	public static int random(int min, int max) {
		return (int) (Math.random() * (max - min + 1) + min);
	}

	public static String input(String hint, int length, boolean isRandom) {
		Scanner sc = new Scanner(System.in);
		String str;
		if (isRandom) {
			str = "";
			for (int i = 0; i < length; i++) {
				str += (char) random(97, 122);

			}
			System.out.println("自動產生:" + str);
			return str;
		}
		do {
			System.out.print(hint + "(長度至少為" + length + "):");
			str = sc.nextLine();
			if (str.length() >= length) {
				return str;
			}
			System.out.println("請重新輸入");
		} while (true);
	}

	public static int input(String hint, int min, int max, int[] avs, boolean isRandom) {
		Scanner sc = new Scanner(System.in);
		int n;
		if (isRandom) {
			int r = random(min, max);
			System.out.println("自動產生:" + r);
			return r;
		}
		return 5;
	}

	public static Student[] doubleArr(Student[] arr) {
		Student[] newArr = new Student[arr.length * 2];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		return newArr;
	}

	public static Student getStudent(int seat, Student[] students, int count) {
		for (int i = 0; i < count; i++) {
			if (students[i].getSeat() == seat) {

			}
		}
		return null;
	}
	public static void none() {
		
	}
}
