package de.htw.fiw2018.kanban.repository;

import de.htw.fiw2018.kanban.entity.VeranstaltungTaskEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VeranstaltungTaskRepository extends GenericTaskRepository<VeranstaltungTaskEntity>{

    // Auswahl aus {geschaeft, referatsueber, langfristig, done}
    @Query(value = "SELECT * FROM veranstaltung t WHERE t.category = 'geschaeft'",
            nativeQuery = true)
    List<Object> findAllByCardCategoryGeschaeft();

    @Query(value = "SELECT * FROM veranstaltung t WHERE t.category = 'referatsueber'",
            nativeQuery = true)
    List<Object> findAllByCardCategoryReferat();

    @Query(value = "SELECT * FROM veranstaltung t WHERE t.category = 'langfristig'",
            nativeQuery = true)
    List<Object> findAllByCardCategoryLang();

    @Query(value = "SELECT * FROM veranstaltung t WHERE t.category = 'done'",
            nativeQuery = true)
    List<Object> findAllByCardCategoryDone();
}
