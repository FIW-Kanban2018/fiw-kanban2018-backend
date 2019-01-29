package de.htw.fiw2018.kanban.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name = "veranstaltung")
public class VeranstaltungTaskEntity extends GenericTaskEntity {

    @Column(name = "title")
    private String title;

    @Column(name = "date")
    private Date date;

    @Column(name = "time")
    private Time time;

    //Auftraggeber
    @Column(name = "client")
    private String client;

    @Column(name = "place")
    private String place;

    @Column(name = "participants")
    private ArrayList<String> participants;

    @Column(name = "todolist")
    private ArrayList<String> todolist;

    @Column(name = "lastmodified")
    private Date lastmodified;

    @Column(name = "created")
    private Date created;

    @Column(name = "deadline")
    private Date deadline;

    @Column(name = "cardCategory", updatable = false)
    String cardCategory = "veranstaltung";

    @Column(name = "category")
    String category;

    public String getCategory(){return category;}

//    @Override
//    public void process(Map<String, String> data) {
//        newData.put("id", String.valueOf(data.get("id")));
//        newData.put("ort", data.get("ort"));
//        newData.put("dateOfEvent", String.valueOf(data.get("dateOfEvent")));
//        newData.put("createdAt", String.valueOf(data.get("createdAt")));
//        newData.put("updatedAt", String.valueOf(data.get("updatedAt")));
//    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
