package de.htw.fiw2018.kanban.repository;

import de.htw.fiw2018.kanban.entity.DringendTaskEntity;
import de.htw.fiw2018.kanban.entity.GenericTaskEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface DringendTaskRepository extends GenericTaskRepository<DringendTaskEntity> {
}
