package de.htw.fiw2018.kanban.model;


import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Map;

@Entity
abstract public class Task {

  // String category;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    Long id;

    @Column(name = "created")
    Date createdDate;

    @Column(name = "lastmodified")
    Date lastModifiedDate;


    @Column (updatable = false) //readonly
    private Date created;

    @Column
    private Date lastmodified;

    @PreUpdate
    void onPreUpdate(){ //wird vor dem Update aufgerufen
        lastmodified.getTime(); //?????
    }

    @PrePersist
    void onPrePersist(){ //wird vor dem Insert aufgerufen
        created.getTime();                   //???????????
        lastmodified.getTime();                 //??????????
    }

//
//    public abstract void editTask();
//    public abstract void createTask();
//    public abstract void deleteTask();
//    public abstract  void findTask();
//    public abstract Long getId();

    abstract public void process(Map<Long, String> data);
}
