package de.htw.fiw2018.kanban.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "mitarbeiteranmelden")
public class MitarbeiteranmeldenTaskEntity extends GenericTaskEntity {

    @Column(name = "name")
    String name;

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
}
