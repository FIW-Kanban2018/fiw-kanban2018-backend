package de.htw.fiw2018.kanban.model;


import org.springframework.stereotype.Component;
import java.util.Date;
import java.util.Map;

@Component
public interface Task {

//    Long id;
//    String category;
//    Date createdDate;
//    Date lastModifiedDate;
//
//    public abstract void editTask();
//    public abstract void createTask();
//    public abstract void deleteTask();
//    public abstract  void findTask();
//    public abstract Long getId();

    void process(Map<String, String> data);
}
