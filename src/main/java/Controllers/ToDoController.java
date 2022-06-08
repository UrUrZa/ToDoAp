package Controllers;


import Entities.ToDo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/ToDo")
public class ToDoController {
    @GetMapping
    public ToDo getToDo() {
        return new ToDo();
    }
    @DeleteMapping
    public boolean deleteToDo(int id){
        System.out.println("ToDo deleted?");
        System.out.println(id);
        return false;
    }
    @PostMapping
    public boolean updateToDo(@RequestBody ToDo toDo){
        System.out.println(toDo.toString());
        return false;
    }

}
