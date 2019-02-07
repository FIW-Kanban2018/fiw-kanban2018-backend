package de.htw.fiw2018.kanban.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "dringend")
public class DringendTaskEntity extends GenericTaskEntity {

    //this column represents the title
    @Column(name="title")
    private String title;

    @Column(name="deadline")
    private String deadline;

    @Column(name = "cardCategory", updatable = false)
    String cardCategory = "dringend";

    @Column(name = "category")
    String category;

    public String getCategory(){return category;}

    public String getTask(){return title;}

    public String getDeadline(){return deadline;}

    public String getCardCategory(){return cardCategory;}

    public void setTask(String title) {
        this.title = title;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
