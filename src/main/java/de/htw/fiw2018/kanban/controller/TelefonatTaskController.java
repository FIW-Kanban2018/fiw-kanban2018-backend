package de.htw.fiw2018.kanban.controller;

import de.htw.fiw2018.kanban.entity.TelefonatTaskEntity;
import de.htw.fiw2018.kanban.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/telefonat")
public class TelefonatTaskController extends GenericTaskController {

    @Autowired
    private TelefonatTaskRepository telefonatTaskRepository;


    @GetMapping(path = "/all")
    public Iterable<TelefonatTaskEntity> findAll() {
        return telefonatTaskRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<TelefonatTaskEntity> findTask(@PathVariable Long id) {
        return telefonatTaskRepository.findById(id);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteTask(@PathVariable Long id) {
        telefonatTaskRepository.deleteById(id);
    }


    /**
     * Example request:
     * <code>
     * {
     * "phonenumber": "123"
     * }
     * </code>
     *
     * @param entity
     * @return
     */

    //CRUDRepository automatically updates data, if already exists in table
    //Otherwise it calls the em.persist() function.
    @PostMapping(path = "/new")
    public void newTask(@RequestBody TelefonatTaskEntity entity) {
        telefonatTaskRepository.save(entity);
    }

        //@PutMapping(path = "/update/{id}")
    // public void  updateCard (@RequestBody TelefonatTaskEntity update, @PathVariable Long id) {
    //  telefonatTaskRepository.findById(id);
    // update.setCaller(update.getCaller());
    // update.setMessage(update.getMessage());
    // telefonatTaskRepository.save(update);
    // ResponseEntity.noContent().build();

}



