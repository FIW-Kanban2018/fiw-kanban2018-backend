package de.htw.fiw2018.kanban.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "dringend")
public class DringendTaskEntity extends GenericTaskEntity{

    @Column(name="task")
    String task;

    @Column(name="deadline")
    String deadline;

    @Column(name="timestamp")
    Timestamp timestamp;

    public String getTask(){return task;}

    public String getDeadline(){return deadline;}


}