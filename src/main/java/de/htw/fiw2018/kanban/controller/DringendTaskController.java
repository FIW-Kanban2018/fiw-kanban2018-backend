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

    @GetMapping("/all")
    public Iterable<DringendTaskEntity> findAll() {return repo.findAll();}

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {repo.deleteById(id);}

    @PostMapping(path = "/new")
    public void newCard(@RequestBody DringendTaskEntity entity) {
        repo.save(entity);
    }
}
