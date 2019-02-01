package de.htw.fiw2018.kanban.repository;

import de.htw.fiw2018.kanban.entity.SonstigesTaskEntity;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SonstigesTaskRepository extends GenericTaskRepository<SonstigesTaskEntity>{

    // Auswahl aus {geschaeft, referatsueber, langfristig, done}
    @Query(value = "SELECT * FROM sonstiges t WHERE t.category = 'geschaeft'",
            nativeQuery = true)
    List<Object> findAllByCardCategoryGeschaeft();

    @Query(value = "SELECT * FROM sonstiges t WHERE t.category = 'referatsueber'",
            nativeQuery = true)
    List<Object> findAllByCardCategoryReferat();

    @Query(value = "SELECT * FROM sonstiges t WHERE t.category = 'langfristig'",
            nativeQuery = true)
    List<Object> findAllByCardCategoryLang();

    @Query(value = "SELECT * FROM sonstiges t WHERE t.category = 'done'",
            nativeQuery = true)
    List<Object> findAllByCardCategoryDone();
}
