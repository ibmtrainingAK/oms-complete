package search1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@SpringBootApplication
public class searchapplication {
 public static void main(String[] args) {
	SpringApplication.run(searchapplication.class, args);
}
 @Bean
 RestTemplate restTemplates() {
	 return new RestTemplate();
 }
}
