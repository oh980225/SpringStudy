package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		
		ExamConsole console = (ExamConsole) context.getBean("console"); // bean�� id��(�̸�����) �������� ��� -> ���� ��ȯ �ʿ�!
//		ExamConsole console = context.getBean(ExamConsole.class); // ������ Ÿ�԰� ��ġ�ϴ� ��ǰ�� �������� ���
		
		console.print();

	}

}