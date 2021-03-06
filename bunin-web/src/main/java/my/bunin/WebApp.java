package my.bunin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class WebApp {
  public static void main(String[] args) {
    SpringApplication.run(WebApp.class, args);
  }
}
