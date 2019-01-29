package de.htw.fiw2018.kanban.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;


// If @Table annotation is missing, it is assumed that this
// entity will be mapped to a table named TelefonatTaskEntity
@Entity
@Table(name = "telefonat")
public class TelefonatTaskEntity extends GenericTaskEntity {

    @Column(name = "caller")
    String caller;

    @Column(name = "message")
    String message;

    @Column(name = "phonenumber")
    String phonenumber;

    @Column(name = "date")
    Date date;

    @Column(name = "cardCategory", updatable = false)
    String cardCategory = "telefonat";

    @Column(name = "category")
    String category;

    public String getCategory(){return category;}

    public String getCaller() {
        return caller;
    }

    public void setCaller(String caller) {
        this.caller = caller;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
