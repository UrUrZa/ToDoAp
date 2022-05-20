package Entities;
import java.util.ArrayList;

public class ToDoList {
    private String name;
private ArrayList<ToDo> body = new ArrayList<ToDo>();

    public ToDoList(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void AddToDo(ToDo toDo){
        body.add(toDo);
    }
    public void removeToDo(ToDo toDo){
        body.remove(toDo);
    }

    @Override
    public String toString() {
        return "ToDoList{" +
                "name='" + name + '\''+
                ", body=" + body +
                '}';
    }

    public void printList(){
        try {
            body.forEach(s-> System.out.println(s.toString()));
        }
        catch (NullPointerException e){
            System.out.println("Нечего печатать, сначала запланируй дела");
        }
    }
  }
