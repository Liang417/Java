package temp;

public class Student {

	private int seat;
	private String schoolclass;
	private String name;
	private int score;

	public Student(int seat, String schoolclass, String name) {
		this(seat, schoolclass, name, 0);
	}

	public Student(int seat, String schoolclass, String name, int score) {
		setSeat(seat);
		this.schoolclass = schoolclass;
		this.name = name;
		setSeat(score);
	}

	public void setSeat(int seat) {
		if (seat < 0) {
			this.seat = 1;
			return;
		}
		this.seat = seat;
	}

	public void setScore(int score) {
		if (score < 0 || score > 100) {
			this.score = 0;
			return;
		}
		this.score = score;
	}

	public int getSeat() {
		return this.seat;
	}

	public String getSchoolClass() {
		return this.schoolclass;
	}

	public String getname() {
		return this.name;
	}

	public int getScore() {
		return this.score;
	}

	public void print() {
		System.out.println("¯Z¯Å:" + schoolclass 
				+ "®y¸¹:" + this.seat
				+ "©m¦W:" + this.name
				+ "¦¨ÁZ:" + this.score);
		
	}
}