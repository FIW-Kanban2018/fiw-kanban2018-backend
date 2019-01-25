package de.htw.fiw2018.kanban.entity;


import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Component
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class GenericTaskEntity implements Serializable {


    // send data as key-value-pairs (json format) with id as key
    // @GeneratedValue indicates that the ID value will be generated automatically
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    Long id;

    // Auswahl aus {geschaeft, referatsueber, langfristig, done}
    @Column(name = "category")
    String category;

    @Column(name = "created", nullable = false, updatable = false) //readonly
    Date created;

    @Column(name = "lastmodified", nullable = false)
    Date lastmodified;


//    @PreUpdate
//    void onPreUpdate(){ //wird vor dem Update aufgerufen
//        lastmodified.getTime(); //getTime = Datum + Uhrzeit
//    }

//    @PrePersist
//    void onPrePersist(){ //wird vor dem Insert aufgerufen
//        created.getTime();
//        lastmodified.getTime();
//    }

    // TODO: Sollte die Map of Type <String, Object> sein?
//    abstract void process(Map<String, String> data);

    public Long getId() {
        return id;
    }

//    public Date getCreated() {
//        return created;
//    }

//    public Date getLastmodified() {
//        return lastmodified;
//    }

//    public void setCreated(Date createdAt) {
//        this.created = created;
//    }

//    public void setLastmodified(Date updatedAt) {
//        this.lastmodified = lastmodified;
//    }
}
