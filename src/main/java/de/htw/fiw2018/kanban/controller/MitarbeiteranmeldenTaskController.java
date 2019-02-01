package de.htw.fiw2018.kanban.controller;

import de.htw.fiw2018.kanban.entity.MitarbeiteranmeldenTaskEntity;
import de.htw.fiw2018.kanban.repository.MitarbeiteranmeldenTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mitarbeiter")
public class MitarbeiteranmeldenTaskController extends GenericTaskController {

    @Autowired
    private MitarbeiteranmeldenTaskRepository repo;

    Iterable<MitarbeiteranmeldenTaskEntity> dringendtasks;

    @GetMapping("/all")
    public Iterable<MitarbeiteranmeldenTaskEntity> findAll() {return repo.findAll();}

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {repo.deleteById(id);}

    //CRUDRepository automatically updates data, if already exists in table
    //Otherwise it calls the em.persist() function.
    @PostMapping(path = "/new")
    public void newCard(@RequestBody MitarbeiteranmeldenTaskEntity entity) {
        repo.save(entity);
    }
}
