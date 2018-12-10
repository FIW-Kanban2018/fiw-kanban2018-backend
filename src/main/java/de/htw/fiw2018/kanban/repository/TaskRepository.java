package de.htw.fiw2018.kanban.repository;

import de.htw.fiw2018.kanban.model.Task;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TaskRepository extends CrudRepository<Task, Long> {

//    Optional<Task> findById(Long id);

    //Iterable<Task> findAll(String entity);

   // Optional<Task> findByCategoryAndId(String category, Long id);

    /**
     * @param id
     */


    @Query("DELETE FROM Telefonat where ID")
    void deleteById(Long id);


}
