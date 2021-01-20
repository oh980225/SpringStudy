package spring.di.entity;

public class OhExam implements Exam {

	private int korean;
	private int english;
	private int math;
	private int computer;

	@Override
	public int total() {
		return korean + english + math + computer;
	}

	@Override
	public float avg() {
		return total() / 4.0f;
	}

}
