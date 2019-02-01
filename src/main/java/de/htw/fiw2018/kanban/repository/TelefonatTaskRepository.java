package de.htw.fiw2018.kanban.repository;

import de.htw.fiw2018.kanban.entity.TelefonatTaskEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TelefonatTaskRepository extends GenericTaskRepository<TelefonatTaskEntity> {

    // Auswahl aus {geschaeft, referatsueber, langfristig, done}
    @Query(value = "SELECT * FROM telefonat t WHERE t.category = 'geschaeft'",
            nativeQuery = true)
    List<Object> findAllByCardCategoryGeschaeft();

    @Query(value = "SELECT * FROM telefonat t WHERE t.category = 'referatsueber'",
            nativeQuery = true)
    List<Object> findAllByCardCategoryReferat();

    @Query(value = "SELECT * FROM telefonat t WHERE t.category = 'langfristig'",
            nativeQuery = true)
    List<Object> findAllByCardCategoryLang();

    @Query(value = "SELECT * FROM telefonat t WHERE t.category = 'done'",
            nativeQuery = true)
    List<Object> findAllByCardCategoryTodo();

}
