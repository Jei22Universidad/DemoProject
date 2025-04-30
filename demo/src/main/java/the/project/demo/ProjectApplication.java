package the.project.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProjectApplication {
    public static void main(String[] args) {
      SpringApplication.run(ProjectApplication.class, args);
    }
    @GetMapping("/github-webhook/")
    public String hello(@RequestParam(value = "nos reunimos", defaultValue = "el sabado a que horas") String name) {
      return String.format("Hello %s!", name);
    }
}
