package UseCases;

import Entities.ToDoList;
import org.springframework.stereotype.Component;

@Component
public class CaseGet {
    public ToDoList getToDoList (){
    return new ToDoList(46,"Do it now");

    }
}
