package de.htw.fiw2018.kanban.entity;

import de.htw.fiw2018.kanban.repository.GenericTaskRepository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
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
    ArrayList<String> todolist;

    //Folgeaktivität
    @Column(name = "posttask")
    String posttask;

    @Column(name = "cardCategory", updatable = false)
    String cardCategory = "sonstiges";


}
