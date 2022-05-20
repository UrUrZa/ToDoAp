package Controllers;

import Entities.ToDo;
import Entities.ToDoList;
import Entities.Type;
import UseCases.CaseGet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;


@SpringBootApplication
@RestController
@RequestMapping(path = "api/v1/ToDoList")


public class ToDoListController{

        public static void main(String[] args) {
                SpringApplication.run(ToDoListController.class, args);
        }

@GetMapping
public String getToDoList (){
        ToDoList test = new ToDoList("Do it now");
        System.out.println(test.getName());
//    test.printList();
        test.AddToDo(new ToDo("отдохнуть", LocalDate.now()));
        test.AddToDo(new ToDo("run", Type.sport,LocalDate.EPOCH));
      return   test.toString();
}
}



/*
public ToDoList getToDoList (){
        return caseGet.getToDoList();

}*/

