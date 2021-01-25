package spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.di.entity.Exam;
import spring.di.entity.OhExam;

@ComponentScan("spring.di.ui")
@Configuration
public class OhDIConfig {
	@Bean
	public Exam exam() { // 이때 함수명인 exam이 id값!
		return new OhExam();
	}
}
