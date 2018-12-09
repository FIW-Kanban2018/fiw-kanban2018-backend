package de.htw.fiw2018.kanban.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name = "telefonat")
public class Telefonat extends Task implements Serializable //Telefonat unterklasse von task, implementiert serialiable
{
    @Transient //er soll das nicht speichern/mappen
    private Map<String, String> newData = new HashMap();

    // send data as key-value-pairs (json format) with id as key


    @Column(name = "caller")
    String caller;

    @Column(name = "phonenumber")
    String phoneNumber;

    @Column(name = "message")
    String message;

    @Column(name = "date")
    Date date;



    @Override //überschreibt übergeordnete Methode
    public void process(Map<Long, String> data) {
        newData.put("id", id.toString());
        newData.put("caller", caller);
        newData.put("phoneNumber", phoneNumber);
        newData.put("message", message);
        newData.put("date", date.toString());
    }

    public void editTask() {

    }

    public void createTask(Map<String, String> data) {

    }

    public void deleteTask() {

    }

    public void findTask() {

    }

    public Long getId() {
        return this.id;
    }
}
