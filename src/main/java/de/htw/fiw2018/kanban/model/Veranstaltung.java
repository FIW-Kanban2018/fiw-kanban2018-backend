package de.htw.fiw2018.kanban.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;
import java.util.Map;

@Entity
@Table(name = "veranstaltung")
public class Veranstaltung extends Task {

    @Column(name = "category")
    private String category = "veranstaltung";

    @Column(name = "datum")
    private Date date;

    @Override
    public void process(Map<Long, String> data) {

    }
}
