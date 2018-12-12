package de.htw.fiw2018.kanban.repository;

import de.htw.fiw2018.kanban.model.GenericTaskEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface GenericTaskRepository<T extends GenericTaskEntity> extends CrudRepository<GenericTaskEntity, Long> {

//    Optional<Task> findById(Long id);

    List<GenericTaskEntity> tasks = null;

    //Finds all tasks of all categories
    Iterable<GenericTaskEntity> findAll();

    //Finds all tasks of one specific category
    Iterable<GenericTaskEntity> findAllByCategory(String entity);

    //TODO: Was ist ein Optional?
    //TODO: ID ist eine Variable --> noch nicht implementiert!
    @Query("SELECT t FROM telefonat t WHERE t.id = 'title'")
    Optional<GenericTaskEntity> findById(String category, Long id);

    void delete(Long id);

    void save(Map<String, String> data);

    void update(GenericTaskEntity task);

}
