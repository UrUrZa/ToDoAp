package Entities;
import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "todo")
public class ToDo {
    @Id
    @Column(name = "todo_id", nullable = false)
    private Integer id;
    @Column(name = "name", nullable = false, length = 128)
    private String name;

    @Column(name = "isComplited", nullable = true)
    private boolean isComplited = false;
    @Temporal(TemporalType.DATE)
    @Column(name = "date", nullable = true, length = 128)
    private LocalDate date;
    @Column(name = "type", nullable = true, length = 128)
    private Type type = Type.other;

    @ManyToOne(optional=false, cascade=CascadeType.ALL)
    @JoinColumn (name="toDoList_id")
    private ToDoList toDoList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isComplited() {
        return isComplited;
    }

    public void setComplited(boolean complited) {
        isComplited = complited;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public ToDo() {
    }

    public ToDo(String name, boolean isComplited) {
        this.name = name;
        this.isComplited = isComplited;
    }

    public ToDo(Integer id, String name, boolean isComplited, LocalDate date, Type type) {
        this.id = id;
        this.name = name;
        this.isComplited = isComplited;
        this.date = date;
        this.type = type;
    }

    public ToDo(String name, Type type, boolean isComplited, LocalDate date) {
        this.name = name;
        this.isComplited = isComplited;
        this.date = date;
        this.type = type;
    }

    public ToDo(String name, Type type, LocalDate date) {
        this.name = name;
        this.date = date;
        this.type = type;
    }

    public ToDo(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }

    @Override
    public String toString() {
        return "ToDo{"+String.valueOf(id)+" " + name + '\'' +
                ", type=" + type +
                ", date=" + date +
                ", isComplited=" + isComplited +
                '}';
    }

}
