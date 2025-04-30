package the.project.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping; // Usamos PostMapping en lugar de GetMapping
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProjectApplication {
    public static void main(String[] args) {
      SpringApplication.run(ProjectApplication.class, args);
    }
  // Usamos @PostMapping para aceptar peticiones POST
    @PostMapping("/github-webhook/")
    public String githubWebhook(@RequestBody String payload) {
        System.out.println("Webhook recibido: " + payload);  // Aquí procesas el payload que GitHub envía
        return "Webhook recibido con éxito";
    }
}
