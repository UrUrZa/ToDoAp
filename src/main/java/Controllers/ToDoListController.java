package Controllers;

import Entities.ToDo;
import Entities.ToDoList;
import UseCases.CaseGet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;


@ComponentScan( basePackages = {"UseCases"})
@RestController
@RequestMapping(path = "api/v1/ToDoList")

public class ToDoListController {
        public static ToDoList somethingToDoList = new ToDoList(15, "TmpList");

        @Autowired
        @GetMapping
        public ToDoList getToDoList(CaseGet caseGet) {
                return caseGet.getToDoList();

        }
        @PostMapping
        public boolean CreateToDoList(@RequestBody ToDoList toDoList) {
                System.out.println("Создаем ToDoList");
                somethingToDoList = toDoList;
                System.out.println("List выглядит так:" + somethingToDoList.toString());
                somethingToDoList.printList();
                return true;
        }
        @DeleteMapping
        public boolean deleteToDoList(int id) {
                boolean result = false;
                System.out.println("Есть что удалять?");
                if(somethingToDoList.getId()==id){
                        System.out.println("Нашли и удалили");
                        result =true;
                }else {
                        System.out.println("Ничего не нашли");

                }return result;
        }
        @RequestMapping(path = "/updateList")
        @PostMapping
        public boolean updateToDoList(@RequestBody ToDoList toDoList) {
                System.out.println("Изменяем ToDoList");
                somethingToDoList = toDoList;
                System.out.println("Теперь List выглядит так:" + somethingToDoList.toString());
                somethingToDoList.printList();
                return true;
        }
}

