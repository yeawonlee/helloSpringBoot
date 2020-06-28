package kr.ac.hansung.cse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringBootApplication {

	// 메인함수가 존재해서 여기서부터 애플리케이션이 시작되는 것
	public static void main(String[] args) {
		SpringApplication.run(HelloSpringBootApplication.class, args);	// 톰캣이 이 애플리케이션 실행시킴
	}

}
