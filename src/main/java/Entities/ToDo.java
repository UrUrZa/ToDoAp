package Entities;

import java.time.LocalDate;


public class ToDo {
    private String name;
    private boolean isComplited = false;
    private LocalDate date;
    private Type type = Type.other;


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
        return "ToDo{" + name + '\'' +
                ", type=" + type +
                ", date=" + date +
                ", isComplited=" + isComplited +
                '}';
    }

}
