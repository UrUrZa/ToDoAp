package Controllers;

import Entities.ToDo;
import Entities.ToDoList;
import Entities.Type;
import UseCases.CaseGet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;


@SpringBootApplication
@ComponentScan( basePackages = {"UseCases"})
@RestController
@RequestMapping(path = "api/v1/ToDoList")


public class ToDoListController {

        public static void main(String[] args) {
                SpringApplication.run(ToDoListController.class, args);
        }

        @Autowired
        @GetMapping
        public ToDoList getToDoList(CaseGet caseGet) {
                return caseGet.getToDoList();

        }
}

