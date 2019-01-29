package de.htw.fiw2018.kanban.controller;

import de.htw.fiw2018.kanban.entity.GenericTaskEntity;
import de.htw.fiw2018.kanban.entity.TelefonatTaskEntity;
import de.htw.fiw2018.kanban.repository.GenericTaskRepository;
import de.htw.fiw2018.kanban.repository.TelefonatTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;
import javax.persistence.PreUpdate;
import javax.swing.text.html.Option;
import java.util.Optional;

@RestController
@RequestMapping("/telefonat")
public class TelefonatTaskController extends GenericTaskController {

    @Autowired
    private TelefonatTaskRepository repo;

    Iterable<TelefonatTaskEntity> telefonatTasks;

    @GetMapping(path = "/referatsueber")
    public Iterable<Object> findAllReferatsueber() {
        return repo.findAllByCardCategoryReferat();
    }

    @GetMapping(path = "/geschaeftszimmer")
    public Iterable<Object> findAllGeschäftszimmer() {
        return repo.findAllByCardCategoryGeschaeft();
    }

    @GetMapping(path = "/hello")
    public String hello(){
        return "Hello Frau S.!";
    }

    @GetMapping(path = "/all")
    public Iterable<TelefonatTaskEntity> findAll() {
        return repo.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<TelefonatTaskEntity> findTask(@PathVariable Long id) {
        return repo.findById(id);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteTask(@PathVariable Long id) {repo.deleteById(id);}

    @GetMapping(path = "/geschaeft")
    public Iterable<GenericTaskEntity> findAllGeschaeft() {
       // return repo.findAllGeschaeft();
        return null;
    }

    /**
     * Example request:
     * <code>
     *   {
     * 	  "phonenumber": "123"
     *   }
     * </code>
     * @param entity
     * @return
     */
    @PostMapping(path = "/new")
    public String newTest(@RequestBody TelefonatTaskEntity entity) {

        repo.save(entity);
        return "Foo" + entity.getPhonenumber(); // returns "Foo123"
    }

    //@PutMapping(path = "/update/{id}")
       // public void  updateCard (@RequestBody TelefonatTaskEntity update, @PathVariable Long id) {
      //  repo.findById(id);
       // update.setCaller(update.getCaller());
       // update.setMessage(update.getMessage());
       // repo.save(update);
        // ResponseEntity.noContent().build();

    }



