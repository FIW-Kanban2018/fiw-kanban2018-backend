package de.htw.fiw2018.kanban.repository;

import de.htw.fiw2018.kanban.entity.MitarbeiteranmeldenTaskEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface MitarbeiteranmeldenTaskRepository extends GenericTaskRepository<MitarbeiteranmeldenTaskEntity>  {

    // Auswahl aus {geschaeft, referatsueber, langfristig, done}
    @Query(value = "SELECT * FROM mitarbeiteranmelden t WHERE t.category = 'geschaeft'",
            nativeQuery = true)
    List<MitarbeiteranmeldenTaskEntity> findAllByCardCategoryGeschaeft();

    @Query(value = "SELECT * FROM mitarbeiteranmelden t WHERE t.category = 'referatsueber'",
            nativeQuery = true)
    List<MitarbeiteranmeldenTaskEntity> findAllByCardCategoryReferat();

    @Query(value = "SELECT * FROM mitarbeiteranmelden t WHERE t.category = 'langfristig'",
            nativeQuery = true)
    List<MitarbeiteranmeldenTaskEntity> findAllByCardCategoryLang();

    @Query(value = "SELECT * FROM mitarbeiteranmelden t WHERE t.category = 'done'",
            nativeQuery = true)
    List<MitarbeiteranmeldenTaskEntity> findAllByCardCategoryDone();
}
