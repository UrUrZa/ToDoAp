package ApRun;

import Controllers.ToDoController;
import Controllers.ToDoListController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

@Import(value = {ToDoListController.class,ToDoController.class})


public class ApRun {
    public static void main(String[] args) {
        SpringApplication.run(ApRun.class, args);
    }
    @GetMapping
    public String ApRanStart() {
        return "App start";
    }
}
