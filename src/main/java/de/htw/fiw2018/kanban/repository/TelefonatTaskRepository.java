package de.htw.fiw2018.kanban.repository;

import de.htw.fiw2018.kanban.entity.TelefonatTaskEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TelefonatTaskRepository extends GenericTaskRepository<TelefonatTaskEntity> {

    // Auswahl aus {geschaeft, referatsueber, langfristig, done}
    @Query(value = "SELECT * FROM dringend d WHERE d.card_category = 'geschaeft'",
            nativeQuery = true)
    List<Object> findAllByCardCategoryGeschaeft();


    @Query(value = "SELECT t.id as tel, t.caller, d.id as dri, d.task " +
            "FROM telefonat t, dringend d",
            nativeQuery = true)
    List<Object> findAllByCardCategoryReferat();

}
