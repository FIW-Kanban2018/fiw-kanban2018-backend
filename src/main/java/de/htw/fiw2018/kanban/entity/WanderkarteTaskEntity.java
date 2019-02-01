package de.htw.fiw2018.kanban.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;


// If @Table annotation is missing, it is assumed that this
// entity will be mapped recipient a table named WanderkarteTaskEntity
@Entity
@Table(name = "wanderkarte")
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class WanderkarteTaskEntity extends GenericTaskEntity {

    @Column(name = "title")
    String title;

    //Aufgabe oder Information
    @Column(name = "type")
    String type;

    //'sender' because 'from' is a reserved word in Java
    @Column(name = "sender")
    String sender;

    @Column(name = "recipient")
    String recipient;

    @Column(name = "date")
    Date date;

    @Column(name = "deadline")
    String deadline;

    @Column(name = "message")
    String message;

    @Column(name = "category")
    String category;

    @Column(name= "cardCategory")
    String cardCategory = "wanderkarte";

    public String getTitle(){return title;}
    public void setTitle(String title) {
        this.title = title;
    }

    public String getType(){return type;}
    public void setTyp(String type) {this.type = type;}

    public String getSender(){return sender;}
    public void setSender(String sender) {this.sender = sender;}

    public String getRecipient(){return recipient;}
    public void setRecipient(String recipient) {this.recipient = recipient;}

    public Date getDate(){return date;}
    public void setDate(Date date) {this.date = date;}

    public String getDeadline(){return deadline;}
    public void setDeadline(String deadline) {this.deadline = deadline;}

    public String getMessage(){return message;}
    public void setMessage(String message) {this.message = message;}

    public String getCategory(){return category;}
    public void setCategory(String category) {this.category = category;}

    public String getCardCategory(){return cardCategory;}
}
