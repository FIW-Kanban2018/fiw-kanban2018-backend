package de.htw.fiw2018.kanban.repository;

import de.htw.fiw2018.kanban.entity.VeranstaltungTaskEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface VeranstaltungTaskRepository extends GenericTaskRepository<VeranstaltungTaskEntity>{

    // Auswahl aus {geschaeft, referatsueber, langfristig, done}
    @Query(value = "SELECT * FROM veranstaltung t WHERE t.category = 'geschaeft'",
            nativeQuery = true)
    List<VeranstaltungTaskEntity> findAllByCardCategoryGeschaeft();

    @Query(value = "SELECT * FROM veranstaltung t WHERE t.category = 'referatsueber'",
            nativeQuery = true)
    List<VeranstaltungTaskEntity> findAllByCardCategoryReferat();

    @Query(value = "SELECT * FROM veranstaltung t WHERE t.category = 'langfristig'",
            nativeQuery = true)
    List<VeranstaltungTaskEntity> findAllByCardCategoryLang();

    @Query(value = "SELECT * FROM veranstaltung t WHERE t.category = 'done'",
            nativeQuery = true)
    List<VeranstaltungTaskEntity> findAllByCardCategoryDone();
}
