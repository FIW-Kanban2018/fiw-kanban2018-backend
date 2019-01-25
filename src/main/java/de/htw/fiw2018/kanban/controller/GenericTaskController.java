package de.htw.fiw2018.kanban.controller;

import de.htw.fiw2018.kanban.entity.GenericTaskEntity;
import de.htw.fiw2018.kanban.repository.GenericTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.Map;
import java.util.Optional;

//@RestController
//@RequestMapping("/task")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
abstract class GenericTaskController<T, Id extends Serializable> {

    //private GenericTaskRepository taskRepository;

    private CrudRepository<T, Id> repository;

//    public GenericTaskController(CrudRepository<T, Id> repository){
//        this.repository = repository;
//    }


    @PostMapping(path = "/mda_save")
    public void foobar(@RequestBody T data) {
//        taskRepository.save(data);
    }

    @GetMapping(path = "/referatsueber")
    public Iterable<GenericTaskEntity> findAllReferatsueber() {
     //   return taskRepository.findAllByReferat();
    return null;
    }

    @GetMapping(path = "/hello")
    public String hello(){
        return "Hello Frau S.!";
    }

    @PostMapping(path = "/save")
    public void createTask(@RequestBody Map<String, String> data) {
//        taskRepository.save(data);
    }

    @GetMapping(path = "/find")
    //TODO: check return type of this method!
    public Optional<GenericTaskEntity> findTask(@PathVariable Long id) {
        return null;
//        return taskRepository.findById(id);
    }
}

