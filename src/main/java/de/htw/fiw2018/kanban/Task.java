package de.htw.fiw2018.kanban;

import java.util.Map;

public abstract class Task {

    int id;
    String category;

    public Task(){};

//    public Task (int id, String title, String recipient) {
//        this.id = id;
//        this.title = title;
//        this.recipient = recipient;
//    }

    public abstract void setData();

    public abstract Map saveToMap();

}
