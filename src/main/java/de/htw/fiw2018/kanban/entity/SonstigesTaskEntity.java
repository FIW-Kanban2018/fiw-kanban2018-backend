package de.htw.fiw2018.kanban.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name = "sonstiges")
public class SonstigesTaskEntity extends GenericTaskEntity {

    @Column(name = "task")
    String task;

    @Column(name = "deadline")
    Date deadline;

    @Column(name = "todolist")
    @Basic
    String todolist;

    //Folgeaktivität
    @Column(name = "posttask")
    String posttask;

    @Column(name = "category")
    String category;

    @Column(name = "cardCategory", updatable = false)
    String cardCategory = "sonstiges";


    public String getTask() {
        return task;
    }

    public Date getDeadline() {
        return deadline;
    }

    public String getTodolist() {
        return todolist;
    }

    public String getPosttask() {
        return posttask;
    }

    public String getCategory() {
        return category;
    }

    public String getCardCategory() {
        return cardCategory;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public void setTodolist(String todolist) {
        this.todolist = todolist;
    }

    public void setPosttask(String posttask) {
        this.posttask = posttask;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
