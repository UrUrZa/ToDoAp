package Entities;

import java.time.LocalDate;

public class Solution {
    public static void main(String[] agrs){
ToDoList test = new ToDoList("Do it now");
    System.out.println(test.getName());
//    test.printList();
    test.AddToDo(new ToDo("отдохнуть", LocalDate.now()));
    test.AddToDo(new ToDo("run",Type.sport,LocalDate.EPOCH));
    test.printList();
    }
}
