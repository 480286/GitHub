

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mypack.controller")
public class SbootMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbootMybatisApplication.class, args);
	}

}
