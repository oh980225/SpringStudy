package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.OhExam;
import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {

		// ���������� �����ϴ� ������� �ڵ� ����
//		Exam exam = new OhExam();
//		ExamConsole console = new GridExamConsole();
//		
//		console.setExam(exam);
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
		Exam exam = context.getBean(Exam.class);
		System.out.println(exam.toString());
		
		ExamConsole console = (ExamConsole) context.getBean("console"); // bean�� id��(�̸�����) �������� ��� -> ���� ��ȯ �ʿ�!
//		ExamConsole console = context.getBean(ExamConsole.class); // ������ Ÿ�԰� ��ġ�ϴ� ��ǰ�� �������� ���
		
		console.print();
		
		List<Exam> examList = (List<Exam>) context.getBean("examList"); // new ArrayList<>();
//		examList.add(new OhExam(1,1,1,1));
		
		for(Exam e : examList) {
			System.out.println(e);
		}

	}

}
