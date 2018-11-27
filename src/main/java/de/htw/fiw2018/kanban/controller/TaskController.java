package de.htw.fiw2018.kanban.controller;


import de.htw.fiw2018.kanban.service.TaskService;
import de.htw.fiw2018.kanban.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

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
        TaskService taskService;

        @PostMapping
        public void createTask(@RequestBody Map<String, String> data) throws IOException {
                taskService.createTask(data);
        }

        @GetMapping(path = {"/category/id"})
        public Task findTask(@PathVariable String category, Long id) {

                return taskService.findTask(category, id);
        }

        @PutMapping
        public void updateTask(int id) {
        taskService.updateTask(id);
        }

        @DeleteMapping(path = {"/id"})
        public boolean deleteTask(@PathVariable int id) {
                return taskService.deleteTask(id);
        }

        @GetMapping(path = {"/category/all"})
        public List findAllTasksPerCategory(@PathVariable String category) {
            return taskService.findAllTasksPerCategory(category);
        }

        @GetMapping(path = "/all")
        public List findAllTasks() {
                return taskService.findAllTasks();
        }
}
