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
        public void createTask(@RequestBody Map<String, String> data) throws IOException {
                System.out.println("Your working directory: " + workingDirectory);
                String id = data.get("id");
                File file = new File(workingDirectory + id + ".txt");
                System.out.println(file.toURI());
                try {
                        if (!file.exists()) {
                                file.createNewFile();
                        }
                        FileWriter fw = new FileWriter(file);

                        data.forEach((key, value) -> {
                                try {
                                        fw.write(key + ":" + value + System.lineSeparator()); }
                                catch (IOException e) {throw new UncheckedIOException(e);}}
                        );
                        fw.flush();
                }
                catch (IOException e){
                        throw e;
                }
        }

        @GetMapping(path = "/{category}/{id}")
        @RequestMapping(path = "/findbyid")
        public Task findTask(@PathVariable String category, Long id) {

                return taskRepository.findTask(category, id);
        }

        @PutMapping(path = {"/category/id"})
        public void updateTask(int id) {
            taskRepository.updateTask(id);
        }

        @DeleteMapping(path = {"/id"})
        public boolean deleteTask(@PathVariable int id) {
                return taskRepository.deleteTask(id);
        }

        @GetMapping(path = {"/category/all"})
        public List findAllTasksPerCategory(@PathVariable String category) {
            return taskRepository.findAllTasksPerCategory(category);
        }

        @GetMapping(path = "/all")
        public List findAllTasks() {
                return taskRepository.findAllTasks();
        }
}
