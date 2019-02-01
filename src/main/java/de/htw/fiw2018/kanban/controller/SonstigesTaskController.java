package de.htw.fiw2018.kanban.controller;

import de.htw.fiw2018.kanban.entity.SonstigesTaskEntity;
import de.htw.fiw2018.kanban.repository.SonstigesTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    //CRUDRepository automatically updates data, if already exists in table
    //Otherwise it calls the em.persist() function.
    @PostMapping(path = "/new")
    public ResponseEntity<Object> newCard(@RequestBody SonstigesTaskEntity entity) {
        repo.save(entity);
        return ResponseEntity.status(201).body("Card successfully created.");
    }

    @PutMapping(path = "/update/{id}")
    public ResponseEntity<Object> updateCard(@PathVariable Long id, @RequestBody SonstigesTaskEntity entity) {
        Optional<SonstigesTaskEntity> task = repo.findById(id);

        if (!task.isPresent()) {
            return ResponseEntity.notFound().build();
        } else {
            entity.setId(id);
            repo.save(entity);
            return ResponseEntity.noContent().build();
        }
    }

    @DeleteMapping(path = "/{id}")
    public void deleteTask(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
