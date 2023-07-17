package playwithjava.in;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringbootHelloWorldDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHelloWorldDemoApplication.class, args);
		log.info("######  Application is started...");
	}

}
