package de.htw.fiw2018.kanban.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/telefonat")
public class TelefonatTaskController {

    @RequestMapping(path = "/hello")
    public String hello(){
        return "Hello Frau S.!";
    }

}
