package de.htw.fiw2018.kanban.repository;

import de.htw.fiw2018.kanban.entity.DringendTaskEntity;
import de.htw.fiw2018.kanban.entity.GenericTaskEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DringendTaskRepository extends GenericTaskRepository<DringendTaskEntity> {

    // Auswahl aus {geschaeft, referatsueber, langfristig, done}
    @Query(value = "SELECT * FROM dringend d WHERE d.category = 'geschaeft'",
            nativeQuery = true)
    List<Object> findAllByCardCategoryGeschaeft();

    @Query(value = "SELECT * FROM dringend d WHERE d.category = 'referatsueber'",
            nativeQuery = true)
    List<Object> findAllByCardCategoryReferat();

    @Query(value = "SELECT * FROM dringend d WHERE d.category = 'langfristig'",
            nativeQuery = true)
    List<Object> findAllByCardCategoryLang();

    @Query(value = "SELECT * FROM dringend d WHERE d.category = 'done'",
            nativeQuery = true)
    List<Object> findAllByCardCategoryDone();
}
