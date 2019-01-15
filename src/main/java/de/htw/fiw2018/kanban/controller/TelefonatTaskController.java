package de.htw.fiw2018.kanban.controller;

import de.htw.fiw2018.kanban.entity.TelefonatTaskEntity;
import de.htw.fiw2018.kanban.repository.TelefonatTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/telefonat")
public class TelefonatTaskController extends GenericTaskController {

    @Autowired
    private TelefonatTaskRepository repo;
    Iterable<TelefonatTaskEntity> telefonatTasks;

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


    /**
     * Example request:
     * <code>
     *   {
     * 	  "phoneNumber": "123"
     *   }
     * </code>
     * @param entity
     * @return
     */
    @PostMapping(path = "/new")
    public String newTest(@RequestBody TelefonatTaskEntity entity) {

        repo.save(entity);

        return "Foo" + entity.getPhoneNumber(); // returns "Foo123"
    }



}
