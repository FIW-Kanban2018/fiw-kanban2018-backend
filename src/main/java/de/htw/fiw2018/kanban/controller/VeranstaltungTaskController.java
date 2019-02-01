package de.htw.fiw2018.kanban.controller;

import de.htw.fiw2018.kanban.entity.VeranstaltungTaskEntity;
import de.htw.fiw2018.kanban.repository.VeranstaltungTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/veranstaltung")
public class VeranstaltungTaskController extends GenericTaskController{

    @Autowired
    private VeranstaltungTaskRepository repo;

    Iterable<VeranstaltungTaskEntity> veranstaltungsTasks;

    @GetMapping(path = "/all")
    public Iterable<VeranstaltungTaskEntity> findAll() {
        return repo.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<VeranstaltungTaskEntity> findTask(@PathVariable Long id) {
        return repo.findById(id);
    }

    //CRUDRepository automatically updates data, if already exists in table
    //Otherwise it calls the em.persist() function.
    @PostMapping(path = "/new")
    public void newCard(@RequestBody VeranstaltungTaskEntity entity) {
        repo.save(entity);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteTask(@PathVariable Long id) {repo.deleteById(id);}
}
