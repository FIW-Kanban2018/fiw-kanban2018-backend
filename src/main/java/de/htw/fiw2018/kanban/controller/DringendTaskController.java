package de.htw.fiw2018.kanban.controller;

import de.htw.fiw2018.kanban.entity.DringendTaskEntity;
import de.htw.fiw2018.kanban.repository.DringendTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dringend")
public class DringendTaskController extends GenericTaskController {

@Autowired
    private DringendTaskRepository repo;

Iterable<DringendTaskEntity> dringendtasks;

//@GetMapping("/task")
  //  public Iterable<DringendTaskEntity> findTask() {return repo.findTask();}

    @PostMapping(path = "/newtask")
    public String newTest(@RequestBody DringendTaskEntity entity) {

        repo.save(entity);

        return "Foo" + entity.getTask(); // returns "Foo123"
    }
}
