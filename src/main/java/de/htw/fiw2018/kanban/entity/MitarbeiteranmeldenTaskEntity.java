package de.htw.fiw2018.kanban.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "mitarbeiteranmelden")
public class MitarbeiteranmeldenTaskEntity extends GenericTaskEntity {

    //This value represents the employee's name
    @Column(name = "title")
    String title;

    //Geburtsdatum
    @Column(name = "dob")
    Date dob;

    @Column(name = "internextern")
    String internextern;

    //Einsatzdatum
    @Column(name = "date")
    Date date;

    //Einsatzort
    @Column(name = "place")
    String place;

    @Column(name = "task")
    String task;

    @Column(name = "cardCategory", updatable = false)
    String cardCategory = "mitarbeiteranmelden";

    @Column(name = "category")
    String category;

    public String getCategory(){return category;}

    public String getCardCategory(){return cardCategory;}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getInternextern() {
        return internextern;
    }

    public void setInternextern(String internextern) {
        this.internextern = internextern;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getTask(){
        return task;
    }

    public void setTask(String task){
        this.task=task;
    }
}
