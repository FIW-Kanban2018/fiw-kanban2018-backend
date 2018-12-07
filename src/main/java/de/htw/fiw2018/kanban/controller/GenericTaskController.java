package de.htw.fiw2018.kanban.controller;

import de.htw.fiw2018.kanban.model.GenericTaskEntity;
import de.htw.fiw2018.kanban.repository.GenericTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/task")
abstract class GenericTaskController<T extends GenericTaskEntity> {

    @Autowired
    GenericTaskRepository taskRepository;

    // TODO: Wie sehen in Verbindung mit Spring REST JavaGenerics aus?
    @PostMapping(path = "/save")
    public void createTask(@RequestBody Map<String, String> data) {
        taskRepository.saveTask(data);
    }

    @GetMapping(path = "/find")
    //TODO: check return type of this method!
    public Optional<GenericTaskEntity> findTask(@PathVariable Long id) {
        return taskRepository.findById(id);
    }
}

