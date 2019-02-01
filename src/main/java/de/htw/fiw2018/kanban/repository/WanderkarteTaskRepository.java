package de.htw.fiw2018.kanban.repository;

import de.htw.fiw2018.kanban.entity.WanderkarteTaskEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WanderkarteTaskRepository extends GenericTaskRepository<WanderkarteTaskEntity> {

    // Auswahl aus {geschaeft, referatsueber, langfristig, done}
    @Query(value = "SELECT * FROM wanderkarte w WHERE w.category = 'geschaeft'",
            nativeQuery = true)
    List<Object> findAllByCardCategoryGeschaeft();

    @Query(value = "SELECT * FROM wanderkarte w WHERE w.category = 'referatsueber'",
            nativeQuery = true)
    List<Object> findAllByCardCategoryReferat();

    @Query(value = "SELECT * FROM wanderkarte w WHERE w.category = 'langfristig'",
            nativeQuery = true)
    List<Object> findAllByCardCategoryLang();

    @Query(value = "SELECT * FROM wanderkarte w WHERE w.category = 'done'",
            nativeQuery = true)
    List<Object> findAllByCardCategoryDone();
}
