package other;

public class TowerOfHanoi {

	public static void main(String[] args) {
		move(10, "A", "B", "C");
	}
// a = start
// b = auxiliary
// c = destination
	public static void move(int numberOfDisks, String start, String auxiliary , String destination) {
		if (numberOfDisks == 1) {
			System.out.println(start + "->" + destination);
			return;
		}
		move(numberOfDisks - 1, start, destination, auxiliary);
		System.out.println(start + "->" + destination);
		move(numberOfDisks-1,auxiliary,start,destination);
	}
}