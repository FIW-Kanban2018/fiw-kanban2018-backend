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

    @Column(name = "von")
    String von;

    @Column(name = "an")
    String an;

    @Column(name = "datum")
    String datum;

    @Column(name = "deadline")
    String deadline;

    @Column(name = "message")
    String message;

    public String getTitle(){return title;}
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTyp(){return typ;}
    public void setTyp(String typ) {this.typ = typ;}

    public String getVon(){return von;}
    public void setVon(String von) {this.von = von;}

    public String getAn(){return an;}
    public void setAn(String an) {this.an = an;}

    public String getDatum(){return datum;}
    public void setDatum(String datum) {this.datum = datum;}

    public String getDeadline(){return deadline;}
    public void setDeadline(String deadline) {this.deadline = deadline;}

    public String getMessage(){return message;}
    public void setMessage(String message) {this.message = message;}

}