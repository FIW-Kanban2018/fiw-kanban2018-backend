package de.htw.fiw2018.kanban.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;

@Entity
@Table(name = "veranstaltung")
public class Veranstaltung implements Task, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "category")
    private String category = "veranstaltung";

    @Column(name = "datum")
    private Date date;

    @Override
    public void process(Map<String, String> data) {

    }
}
