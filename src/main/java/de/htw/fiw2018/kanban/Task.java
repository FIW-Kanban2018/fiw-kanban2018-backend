package de.htw.fiw2018.kanban;


public abstract class Task {

    int id;
    String category;

    public Task(){};

//    public Task (int id, String title, String recipient) {
//        this.id = id;
//        this.title = title;
//        this.recipient = recipient;
//    }

    public abstract void editTask();
    public abstract void createTask();
    public abstract void deleteTask();
    public abstract void findTask();

}
