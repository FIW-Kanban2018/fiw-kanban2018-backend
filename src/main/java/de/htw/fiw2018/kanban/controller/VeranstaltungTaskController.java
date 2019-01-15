package de.htw.fiw2018.kanban.controller;

import de.htw.fiw2018.kanban.repository.VeranstaltungTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/veranstaltung")
public class VeranstaltungTaskController extends GenericTaskController {

    @Autowired
    private VeranstaltungTaskRepository repo;




}
