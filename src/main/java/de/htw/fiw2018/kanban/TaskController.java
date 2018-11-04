package de.htw.fiw2018.kanban;


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

        @GetMapping(path = {"/id"})
        public Task findTask(@PathVariable int id) {
        return taskService.findTask(id);
        }

        @PutMapping
        public void updateTask(int id) {
        taskService.updateTask(id);
        }

        @DeleteMapping(path = {"/id"})
        public boolean deleteTask(@PathVariable int id) {
                return taskService.deleteTask(id);
        }

        @GetMapping
        public List findAllTasks() {
            return taskService.findAllTasks();
        }
}
