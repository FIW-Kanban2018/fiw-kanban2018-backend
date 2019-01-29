package de.htw.fiw2018.kanban.controller;

import de.htw.fiw2018.kanban.entity.GenericTaskEntity;
import de.htw.fiw2018.kanban.repository.GenericTaskRepository;
import de.htw.fiw2018.kanban.repository.TelefonatTaskRepository;
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

    private CrudRepository<T, Id> repository;
    private TelefonatTaskRepository telefonatTaskRepository;


    @PostMapping(path = "/mda_save")
    public void foobar(@RequestBody T data) {
//        taskRepository.save(data);
    }

//    @GetMapping(path = "/referatsueber")
//    public Iterable<GenericTaskEntity> findAllReferatsueber() {
//        return telefonatTaskRepository.findAllByCardCategoryReferat();
//    }
//
//    @GetMapping(path = "/geschaeftszimmer")
//    public Iterable<GenericTaskEntity> findAllGeschäftszimmer() {
//        return telefonatTaskRepository.findAllByCardCategoryGeschaeft();
//    }

    @GetMapping(path = "/hello")
    public String hello(){
        return "Hello Frau S.!";
    }

    @PostMapping(path = "/save")
    public void createTask(@RequestBody Map<String, String> data) {
//        taskRepository.save(data);
    }
}

