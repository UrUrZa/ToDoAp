package Entities;
import jakarta.persistence.*;

import java.util.ArrayList;


@Entity
@Table(name = "todoList")
public class ToDoList {
    @Id
    @Column(name = "toDoList_id", nullable = false)
    private Integer id;
    @Column(name = "name", nullable = false, length = 128)
    private String name;
    @OneToMany (mappedBy="toDoList", fetch=FetchType.EAGER)
    private ArrayList<ToDo> body = new ArrayList<ToDo>();

    public ToDoList() {
    }

    public ToDoList(Integer id, String name) {
        this.id = id;
        this.name = name;
    }


    public ToDoList(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
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
                ", Id=" + Integer.valueOf(id) +
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
    public boolean searchToDo(int todo_id){
        boolean result = false;
        for (var tmp:
             body) {
            if(tmp.getId()==todo_id){
                result = true;
            }
        }return result;
    }
    public ToDo getToDo(int todo_id){
        ToDo result = new ToDo();
        for (var tmp:
                body) {
            if(tmp.getId()==todo_id){
                result = tmp;
            }
        }return result;
    }
  }
