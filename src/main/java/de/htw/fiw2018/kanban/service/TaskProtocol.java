package de.htw.fiw2018.kanban.service;

import de.htw.fiw2018.kanban.model.Task;
import de.htw.fiw2018.kanban.model.Telefonat;
import de.htw.fiw2018.kanban.model.Veranstaltung;

import java.util.HashMap;
import java.util.Map;

/*Only needed for creating or updating a task?! */
public class TaskProtocol {

    // String is category, Task enthält die Map.
    // TODO: Oder eine Map<String,String> anstatt TAsk?
    private Map<String, Task> task = new HashMap<>();

    public TaskProtocol() {
        task.put("telefonat", new Telefonat());
        task.put("veranstaltung", new Veranstaltung());
    }


    public void process(Map<Long, String> data) {
        task.get("category").process(data);
    }
}
