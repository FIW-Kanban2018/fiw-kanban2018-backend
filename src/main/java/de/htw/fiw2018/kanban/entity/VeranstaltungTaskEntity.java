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
    private String time;

    //Auftraggeber
    @Column(name = "client")
    private String client;

    @Column(name = "place")
    private String place;

    @Column(name = "participants")
    private String participants;

    @Column(name = "todolist")
    private String todolist;

    @Column(name = "lastmodified")
    private Date lastmodified;

    @Column(name = "created")
    private Date created;

    @Column(name = "deadline")
    private Date deadline;

    @Column(name = "cardCategory", updatable = false)
    private String cardCategory = "veranstaltung";

    @Column(name = "category")
    private String category;

    public String getTitle() {
        return title;
    }

    public Date getDate() {
        return date;
    }

    public String getTime() {
        return this.time;
    }

    public String getClient() {
        return client;
    }

    public String getPlace() {
        return place;
    }

    public String getParticipants() {
        return participants;
    }

    public String getTodolist() {
        return todolist;
    }

    public Date getLastmodified() {
        return lastmodified;
    }

    public Date getCreated() {
        return created;
    }

    public Date getDeadline() {
        return deadline;
    }

    public String getCardCategory() {
        return cardCategory;
    }

    public String getCategory() {
        return category;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setParticipants(String participants) {
        this.participants = participants;
    }

    public void setTodolist(String todolist) {
        this.todolist = todolist;
    }

    public void setLastmodified(Date lastmodified) {
        this.lastmodified = lastmodified;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
