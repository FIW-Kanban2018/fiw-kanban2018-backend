package de.htw.fiw2018.kanban.generics_test.controller;

import de.htw.fiw2018.kanban.entity.GenericTaskEntity;
import de.htw.fiw2018.kanban.entity.TelefonatTaskEntity;
import de.htw.fiw2018.kanban.generics_test.repository.TelefonatTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class TelefonatTaskController extends GenericTaskController<TelefonatTaskEntity> {

//    @Autowired
//    private TelefonatTaskRepository repo;

    public void createTask(TelefonatTaskEntity task) {
//        task.setCreated(new Date());

//        repo.save(task);

        super.createTask(task);
    }

}
