package de.htw.fiw2018.kanban.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "dringend")
public class DringendTaskEntity extends GenericTaskEntity {

    @Column(name="task")
    private String task;

    @Column(name="deadline")
    private String deadline;

    @Column(name = "cardCategory", updatable = false)
    String cardCategory = "dringend";

    @Column(name = "category")
    String category;

    public String getCategory(){return category;}

    public String getTask(){return task;}

    public String getDeadline(){return deadline;}

    public String getCardCategory(){return cardCategory;}

    public void setTask(String task) {
        this.task = task;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
