package de.htw.fiw2018.kanban.repository;

import de.htw.fiw2018.kanban.model.Task;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface TaskRepository extends CrudRepository<Task, Long> {

//    Optional<Task> findById(Long id);

    List<Task> tasks = null;

    //Finds all tasks of all categories
    Iterable<Task> findAll();

    Iterable<Task> findAllByCategory(String entity);

    //TODO: Was ist ein Optional?
    //TODO: ID ist eine Variable --> noch nicht implementiert!
    @Query("SELECT * FROM telefonat t WHERE t.id = 'title'")
    Optional<Task> findById(String category, Long id);

    void deleteById(Long id);

    void saveTask(Map<String, String> data);


    // trying to get git to merge this into master branch


}
