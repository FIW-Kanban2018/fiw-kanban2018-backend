package de.htw.fiw2018.kanban.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;


// If @Table annotation is missing, it is assumed that this
// entity will be mapped to a table named WanderkarteTaskEntity
@Entity
@Table(name = "wanderkarte")
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class WanderkarteTaskEntity extends GenericTaskEntity {

    @Column(name = "title")
    String title;

    @Column(name = "typ")
    String typ;

    @Column(name = "from")
    String from;

    @Column(name = "to")
    String to;

    @Column(name = "date")
    String date;

    @Column(name = "deadline")
    String deadline;

    @Column(name = "message")
    String message;

    @Column(name = "category")
    String category;

    @Column(name= "cardCategory")
    String cardCategory;

    public String getTitle(){return title;}
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTyp(){return typ;}
    public void setTyp(String typ) {this.typ = typ;}

    public String getFrom(){return from;}
    public void setFrom(String von) {this.from = from;}

    public String getTo(){return to;}
    public void setTo(String an) {this.to = to;}

    public String getDate(){return date;}
    public void setDate(String date) {this.date = date;}

    public String getDeadline(){return deadline;}
    public void setDeadline(String deadline) {this.deadline = deadline;}

    public String getMessage(){return message;}
    public void setMessage(String message) {this.message = message;}

    public String getCategory(){return category;}
    public void setCategory(String category) {this.category = category;}

    public String getCardCategory(){return cardCategory;}
    public void setcardCategory(String cardCategory) {this.cardCategory = cardCategory;}
}