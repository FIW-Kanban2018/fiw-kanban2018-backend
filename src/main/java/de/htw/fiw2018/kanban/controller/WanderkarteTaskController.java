package de.htw.fiw2018.kanban.controller;

import de.htw.fiw2018.kanban.entity.WanderkarteTaskEntity;
import de.htw.fiw2018.kanban.entity.WanderkarteTaskEntity;
import de.htw.fiw2018.kanban.repository.WanderkarteTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/wanderkarte")
public class WanderkarteTaskController extends GenericTaskController {

    @Autowired
    private WanderkarteTaskRepository repo;

    Iterable<WanderkarteTaskEntity> wanderkarteTasks;

    @GetMapping(path = "/hello")
    public String hello(){
        return "Hello Frau S.!";
    }

    @GetMapping(path = "/all")
    public Iterable<WanderkarteTaskEntity> findAll() {
        return repo.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<WanderkarteTaskEntity> findTask(@PathVariable Long id) {
        return repo.findById(id);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteTask(@PathVariable Long id) {repo.deleteById(id);}

    @PostMapping(path = "/new")
    public String newTest(@RequestBody WanderkarteTaskEntity entity) {

        repo.save(entity);

        return "Karte mit folgendem Titel wurde erstellt" + entity.getTitle(); // returns "Foo123"
    }



}
