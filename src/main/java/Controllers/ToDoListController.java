package Controllers;

import Entities.ToDoList;
import UseCases.CaseGet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





@ComponentScan( basePackages = {"UseCases"})
@RestController
@RequestMapping(path = "api/v1/ToDoList")

public class ToDoListController {

        @Autowired
        @GetMapping
        public ToDoList getToDoList(CaseGet caseGet) {
                return caseGet.getToDoList();

        }
}

