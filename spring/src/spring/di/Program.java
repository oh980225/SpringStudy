package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.OhExam;
import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {

//		Exam exam = new OhExam();
//		ExamConsole console = new GridExamConsole();
//		
//		console.setExam(exam);
		
//		ApplicationContext context = 
//				new ClassPathXmlApplicationContext("spring/di/setting.xml"); // XML Configuration
		
		ApplicationContext context = new AnnotationConfigApplicationContext(OhDIConfig.class); // Java Configuration 
				
		ExamConsole console = (ExamConsole) context.getBean("console");
//		ExamConsole console = context.getBean(ExamConsole.class); 
		
		console.print();
		
//		List<Exam> examList = (List<Exam>) context.getBean("examList"); // new ArrayList<>();
//		examList.add(new OhExam(1,1,1,1));
		
//		for(Exam e : examList) {
//			System.out.println(e);
//		}

	}

}
