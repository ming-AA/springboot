package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 스프링 부트의 자동설정, 스프링 Bean 읽기와 생성 모두 자동 설정, 최상단 위치
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); // 내부에서 WAS 실행
    }
}