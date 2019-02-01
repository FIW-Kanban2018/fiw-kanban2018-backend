package de.htw.fiw2018.kanban.controller;

import org.springframework.web.bind.annotation.*;
import java.io.Serializable;


@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
abstract class GenericTaskController<T, Id extends Serializable> {

    @GetMapping(path = "/hello")
    public String hello(){
        return "Hello Frau S.!";
    }

}

