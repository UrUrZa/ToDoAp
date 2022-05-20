package Controllers;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/ToDo")
public class ToDoController {
    @GetMapping
    public String getToDo() {
        return "ToDohvhjbjhbjj";
    }
    @DeleteMapping
    public boolean deleteToDo(){
        return false;
    }
}
