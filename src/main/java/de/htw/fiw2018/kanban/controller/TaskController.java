package de.htw.fiw2018.kanban.controller;


import de.htw.fiw2018.kanban.repository.TaskRepository;
import de.htw.fiw2018.kanban.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/board")
public class TaskController {

    /*
     * Based on the example on https://www.devglan.com/spring-boot/spring-boot-angular-example
     * This Rest Controller redirects requests to the TaskService.
     * Tomcat webserver running on localhost:8080 .
     * Requests are being mapped to "/board".
     *
     * Method createTask() tested with Postman.
     */

    @Autowired
    TaskRepository taskRepository;

    String workingDirectory = System.clearProperty("user.dir") + File.separator;

    @PostMapping
    public void createTask(@RequestBody Map<String, String> data) {
        // String id = data.get("id");
        //            data.forEach((key, value) -> {
        //  }
        taskRepository.saveTask(data);
    }

    @GetMapping(path = "/{category}/{id}")
    // @RequestMapping(path = "/findbyid")
    //TODO: check return type of this method!
    public Optional<Task> findTask(@PathVariable String category, Long id) {

        return taskRepository.findById(category, id);
    }

    @PutMapping(path = "/{category}/{id}")
    public void updateTask(Long id, @RequestBody Map<String, String> data) {
        taskRepository.updateTaskById(id, data);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskRepository.deleteById(id);
    }

    @GetMapping(path = "/{category}/{id}")
    //TODO: Ist der return type korrekt?
    public Iterable<Task> findAllTasksPerCategory(@PathVariable String category) {
        return taskRepository.findAllByCategory(category);
    }

    @GetMapping(path = "/all")
    //TODO: Ist der return type korrekt?
    public Iterable<Task> findAllTasks() {
        return taskRepository.findAll();
    }
}
