package de.htw.fiw2018.kanban.repository;

import de.htw.fiw2018.kanban.entity.DringendTaskEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface WanderkarteTaskRepository extends GenericTaskRepository<DringendTaskEntity> {
}
