package de.htw.fiw2018.kanban.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


// For lack of a @Table annotation, it is assumed that this
// entity will be mapped to a table named Telefonat
@Entity
//@Table(name = "telefonat")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Telefonat implements Task, Serializable {

    private Map<String, String> newData = new HashMap();

    // send data as key-value-pairs (json format) with id as key
    // @GeneratedValue indicates that the ID value will be generated automatically
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "caller")
    String caller;

    @Column(name = "phonenumber")
    String phoneNumber;

    @Column(name = "message")
    String message;

    @Column(name = "date")
    Date date;

    @Column(name = "created")
    Date createdDate;

    @Column(name = "lastmodified")
    Date lastModifiedDate;

    public void process(Map<String, String> data) {
        newData.put("id", id.toString());
        newData.put("caller", caller);
        newData.put("phoneNumber", phoneNumber);
        newData.put("message", message);
        newData.put("date", date.toString());
    }

//    public void editTask() {}
//    public void createTask(Map<String, String> data) {}
//    public void deleteTask() {}
//    public void findTask() {}

    public Long getId() {
        return this.id;
    }
}
