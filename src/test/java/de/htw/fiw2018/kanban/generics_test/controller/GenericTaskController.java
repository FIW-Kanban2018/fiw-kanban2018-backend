package de.htw.fiw2018.kanban.generics_test.controller;

import de.htw.fiw2018.kanban.entity.GenericTaskEntity;

import java.util.Date;

public abstract class GenericTaskController<T extends GenericTaskEntity> {

    public void createTask(T task) {
        //taskRepo.save(task);
    }


}
