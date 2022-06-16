package Controllers;


import Entities.ToDo;
import Entities.ToDoList;
import Entities.Type;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

import static Controllers.ToDoListController.*;

@RestController
@RequestMapping(path = "api/v1/ToDo")
public class ToDoController {
    private ToDo somethingToDo = new ToDo(15, "Name", false, LocalDate.now(), Type.other);
   // private ToDoList somethingToDoList = new ToDoList(15, "TmpList");

    @GetMapping
    public ToDo getToDo() {
        return new ToDo();
    }

    @DeleteMapping
    public boolean deleteToDo(int id) {
        System.out.println("ToDo deleted?");
        System.out.println(id);
        return false;
    }

    @PostMapping
    public boolean updateToDo(@RequestBody ToDo toDo) {
        System.out.println(toDo.toString());
        return false;
    }

    @RequestMapping(path = "/Complete")
    @GetMapping
    public boolean isCompleteToDo(int id) {
        if (somethingToDo.getId() == id) {
            somethingToDo.setComplited(true);
            return true;
        } else System.out.println("Такого ToDo не существует, проверьте правильность Id");
        return false;
    }

    @RequestMapping(path = "/ListId")
    @GetMapping
    public Integer getListId(int todo_id) {
        System.out.println("Находим ToDo по id, получаем id листа");
        somethingToDoList.AddToDo(somethingToDo);
        if(somethingToDoList.searchToDo(todo_id)){
            System.out.println(somethingToDoList.getId());
            return somethingToDoList.getId();
            } else System.out.println("Нет такого ToDo");
            return -100;
    }
    @RequestMapping(path = "/AddToDo")
    @PostMapping
    public boolean AddToDo(@RequestBody ToDo toDo) {
        System.out.println("Добавляем ToDo в List");
        somethingToDoList.AddToDo(toDo);
        System.out.println(toDo.toString() + "добавлено. Теперь List выглядит так:");
        System.out.println(somethingToDoList.toString());
        somethingToDoList.printList();
        return true;
    }
}
