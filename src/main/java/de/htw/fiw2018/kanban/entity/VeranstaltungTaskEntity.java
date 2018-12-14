package de.htw.fiw2018.kanban.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.Map;

@Entity
@Table(name = "veranstaltung")
public class VeranstaltungTaskEntity extends GenericTaskEntity {

    @Column(name = "ort")
    private String ort;

    @Column(name = "dateofevent")
    private Date dateOfEvent;


    @Override
    public void process(Map<String, String> data) {
        newData.put("id", String.valueOf(data.get("id")));
        newData.put("ort", data.get("ort"));
        newData.put("dateOfEvent", String.valueOf(data.get("dateOfEvent")));
        newData.put("createdAt", String.valueOf(data.get("createdAt")));
        newData.put("updatedAt", String.valueOf(data.get("updatedAt")));
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public Date getDateOfEvent() {
        return dateOfEvent;
    }

    public void setDateOfEvent(Date dateOfEvent) {
        this.dateOfEvent = dateOfEvent;
    }
}