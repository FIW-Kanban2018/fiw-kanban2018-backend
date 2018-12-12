package de.htw.fiw2018.kanban.model;


import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class GenericTaskEntity {

    Map<String, String> newData = new HashMap();

    // send data as key-value-pairs (json format) with id as key
    // @GeneratedValue indicates that the ID value will be generated automatically
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    Long id;

    @Column(name = "created_at", nullable = false)
    Date createdAt;

    @Column(name = "updated_at", nullable = false)
    Date updatedAt;


    // TODO: Sollte die Map of Type <String, Object> sein?
    abstract void process(Map<String, String> data);

    public Long getId() {
        return id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
