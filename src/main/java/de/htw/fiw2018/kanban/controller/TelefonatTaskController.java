package de.htw.fiw2018.kanban.controller;

import de.htw.fiw2018.kanban.entity.TelefonatTaskEntity;
import de.htw.fiw2018.kanban.repository.TelefonatTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/telefonat")
public class TelefonatTaskController extends GenericTaskController {

    @Autowired
    private TelefonatTaskRepository repo;

    @GetMapping(path = "/hello")
    public String hello(){
        return "Hello Frau S.!";
    }


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
