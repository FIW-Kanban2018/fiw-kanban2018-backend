package de.htw.fiw2018.kanban.repository;

import de.htw.fiw2018.kanban.entity.GenericTaskEntity;
import de.htw.fiw2018.kanban.entity.TelefonatTaskEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefonatTaskRepository extends GenericTaskRepository<TelefonatTaskEntity> {

//    @Query("SELECT all FROM dringend d, telefonat t, veranstaltung v WHERE category= 'geschaeft'")
//    Iterable<GenericTaskEntity> findAllGeschaeft();
}
