package de.htw.fiw2018.kanban.generics_test.repository;

import de.htw.fiw2018.kanban.entity.GenericTaskEntity;
import org.springframework.data.repository.CrudRepository;

public interface GenericTaskRepository<T extends GenericTaskEntity> extends CrudRepository<T, Long> {

}
