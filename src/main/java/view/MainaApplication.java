package view;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MainaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainaApplication.class, args);
        System.out.println("http://localhost:8080/");
    }
}
