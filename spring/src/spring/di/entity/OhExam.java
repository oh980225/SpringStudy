package spring.di.entity;

import org.springframework.beans.factory.annotation.Value;

public class OhExam implements Exam {

	@Value("20")
	private int korean;
	@Value("30")
	private int english;
	@Value("40")
	private int math;
	@Value("50")
	private int computer;
	
	public OhExam() {
		// TODO Auto-generated constructor stub
	}
	
	public OhExam(int korean, int english, int math, int computer) {
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.computer = computer;
	}

	@Override
	public int total() {
		return korean + english + math + computer;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getComputer() {
		return computer;
	}

	public void setComputer(int computer) {
		this.computer = computer;
	}

	@Override
	public float avg() {
		return total() / 4.0f;
	}

	@Override
	public String toString() {
		return "OhExam [korean=" + korean + ", english=" + english + ", math=" + math + ", computer=" + computer + "]";
	}
	

}
