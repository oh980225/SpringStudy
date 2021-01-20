package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {

		// 스프링에게 지시하는 방법으로 코드 변경
//		Exam exam = new OhExam();
//		ExamConsole console = new GridExamConsole();
//		
//		console.setExam(exam);
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
		ExamConsole console = (ExamConsole) context.getBean("console"); // bean의 id로(이름으로) 가져오는 방법 -> 형식 변환 필요!
//		ExamConsole console = context.getBean(ExamConsole.class); // 인자의 타입과 일치하는 부품을 가져오는 방법
		
		console.print();

	}

}
