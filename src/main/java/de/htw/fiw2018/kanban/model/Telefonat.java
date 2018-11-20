package de.htw.fiw2018.kanban.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name = "telefonat")
public class Telefonat extends Task implements Serializable {

    // send data as key-value-pairs (json format)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "category")
    String category = "telefonat";

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

    public Telefonat(Long id, String caller, String phoneNumber, String message, Date date) {
        this.id = id;
        this.caller = caller;
        this.phoneNumber = phoneNumber;
        this.message = message;
        this.date = date;
    }

    public Map saveToMap() {
        Map<String, String> data = new HashMap();
        data.put("id", id.toString());
        data.put("caller", caller);
        data.put("phoneNumber", phoneNumber);
        data.put("message", message);
        data.put("date", date.toString());
        return data;
    }

    public void editTask() {

    }

    public void createTask() {

    }

    public void deleteTask() {

    }

    public void findTask() {

    }

    public Long getId() {
        return this.id;
    }
}
