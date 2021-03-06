package de.htw.fiw2018.kanban.repository;

import de.htw.fiw2018.kanban.entity.GenericTaskEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface GenericTaskRepository<T extends GenericTaskEntity> extends CrudRepository<T, Long> {

    List<GenericTaskEntity> tasks = null;

    //TODO: Was ist ein Optional?
    //TODO: ID ist eine Variable --> noch nicht implementiert!
    @Query("SELECT t FROM #{#entityName} t WHERE t.id = 'title'")
    Iterable<T> findAllByCategory(String category, Long id);

    //TODO: Query to get all cards saved with category "referatsueber"
    @Query("SELECT t FROM #{#entityName} t WHERE t.id = 'title'")
    Iterable<T> findAllByReferat();

}
