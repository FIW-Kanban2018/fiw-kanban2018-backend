package de.htw.fiw2018.kanban.controller;

import de.htw.fiw2018.kanban.entity.SonstigesTaskEntity;
import de.htw.fiw2018.kanban.entity.VeranstaltungTaskEntity;
import de.htw.fiw2018.kanban.repository.SonstigesTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/sonstiges")
public class SonstigesTaskController extends GenericTaskController {

    @Autowired
    private SonstigesTaskRepository repo;

    Iterable<SonstigesTaskEntity> veranstaltungsTasks;

    @GetMapping(path = "/all")
    public Iterable<SonstigesTaskEntity> findAll() {
        return repo.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<SonstigesTaskEntity> findTask(@PathVariable Long id) {
        return repo.findById(id);
    }

    @PostMapping(path = "/new")
    public void newCard(@RequestBody SonstigesTaskEntity entity) {
        repo.save(entity);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteTask(@PathVariable Long id) {repo.deleteById(id);}
}
