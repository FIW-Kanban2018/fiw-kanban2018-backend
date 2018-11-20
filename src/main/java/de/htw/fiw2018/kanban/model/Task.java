package de.htw.fiw2018.kanban.model;


import java.util.Date;

public abstract class Task {

    Long id;
    String category;
    Date createdDate;
    Date lastModifiedDate;

    public abstract void editTask();
    public abstract void createTask();
    public abstract void deleteTask();
    public abstract  void findTask();

    public abstract Long getId();

}
