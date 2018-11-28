package de.htw.fiw2018.kanban.repository;

import de.htw.fiw2018.kanban.model.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TaskRepository extends CrudRepository<Task, Long> {

//    Optional<Task> findById(Long id);

    Iterable<Task> findAll(String entity);

    //TODO: Was ist ein Optional?
    Optional<Task> findByCategoryAndId(String category, Long id);

    /**
     * @param id
     */
    void deleteById(Long id);

}
