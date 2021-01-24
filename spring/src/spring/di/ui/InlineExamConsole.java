package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {

	@Autowired(required = false) 
	@Qualifier("exam1")
	private Exam exam;
	
	public InlineExamConsole() {
		System.out.println("생성자!");
	}

	public InlineExamConsole(Exam exam) {
		System.out.println("오버로딩 생성자!");
		this.exam = exam;
	}

	@Override
	public void print() {
		if(exam == null) {
			System.out.printf("total is %d, avg is %f\n", 0, 0.0);
		} else {
			System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());			
		}
	}
	
	@Override
	public void setExam(Exam exam) {
		System.out.println("setter 함수!");
		this.exam = exam;
	}

}
