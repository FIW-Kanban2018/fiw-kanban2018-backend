package de.htw.fiw2018.kanban.repository;

import de.htw.fiw2018.kanban.entity.WanderkarteTaskEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface WanderkarteTaskRepository extends GenericTaskRepository<WanderkarteTaskEntity> {

    // Auswahl aus {geschaeft, referatsueber, langfristig, done}
    @Query(value = "SELECT * FROM wanderkarte w WHERE w.category = 'geschaeft'",
            nativeQuery = true)
    List<WanderkarteTaskEntity> findAllByCardCategoryGeschaeft();

    @Query(value = "SELECT * FROM wanderkarte w WHERE w.category = 'referatsueber'",
            nativeQuery = true)
    List<WanderkarteTaskEntity> findAllByCardCategoryReferat();

    @Query(value = "SELECT * FROM wanderkarte w WHERE w.category = 'langfristig'",
            nativeQuery = true)
    List<WanderkarteTaskEntity> findAllByCardCategoryLang();

    @Query(value = "SELECT * FROM wanderkarte w WHERE w.category = 'done'",
            nativeQuery = true)
    List<WanderkarteTaskEntity> findAllByCardCategoryDone();
}
