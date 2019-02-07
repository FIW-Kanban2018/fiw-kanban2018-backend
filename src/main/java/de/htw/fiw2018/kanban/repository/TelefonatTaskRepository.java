package de.htw.fiw2018.kanban.repository;

import de.htw.fiw2018.kanban.entity.TelefonatTaskEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface TelefonatTaskRepository extends GenericTaskRepository<TelefonatTaskEntity> {

    // Auswahl aus {geschaeft, referatsueber, langfristig, done}
    @Query(value = "SELECT * FROM telefonat t WHERE t.category = 'geschaeft'",
            nativeQuery = true)
    List<TelefonatTaskEntity> findAllByCardCategoryGeschaeft();

    @Query(value = "SELECT * FROM telefonat t WHERE t.category = 'referatsueber'",
            nativeQuery = true)
    List<TelefonatTaskEntity> findAllByCardCategoryReferat();

    @Query(value = "SELECT * FROM telefonat t WHERE t.category = 'langfristig'",
            nativeQuery = true)
    List<TelefonatTaskEntity> findAllByCardCategoryLang();

    @Query(value = "SELECT * FROM telefonat t WHERE t.category = 'done'",
            nativeQuery = true)
    List<TelefonatTaskEntity> findAllByCardCategoryDone();


}
