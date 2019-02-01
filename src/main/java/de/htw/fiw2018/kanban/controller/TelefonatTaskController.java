package de.htw.fiw2018.kanban.controller;

import de.htw.fiw2018.kanban.entity.TelefonatTaskEntity;
import de.htw.fiw2018.kanban.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/telefonat")
public class TelefonatTaskController extends GenericTaskController {

    @Autowired
    private TelefonatTaskRepository telefonatTaskRepository;
    @Autowired
    private DringendTaskRepository dringendTaskRepository;
    @Autowired
    private MitarbeiteranmeldenTaskRepository mitarbeiteranmeldenTaskRepository;
    @Autowired
    private SonstigesTaskRepository sonstigesTaskRepository;
    @Autowired
    private VeranstaltungTaskRepository veranstaltungTaskRepository;
    @Autowired
    private WanderkarteTaskRepository wanderkarteTaskRepository;

    Iterable<TelefonatTaskEntity> telefonatTasks;
    List<Object> referatList = new ArrayList<>();
    List<Object> geschaeftList;
    List<Object> LangfristigList;
    List<Object> doneList;

    @GetMapping(path = "/referatsueber")
    public Iterable<Object> findAllReferatsueber() {
        this.referatList.addAll(dringendTaskRepository.findAllByCardCategoryReferat());
        this.referatList.addAll(telefonatTaskRepository.findAllByCardCategoryReferat());

        System.out.println("referatList: " + this.referatList.toString());
        return referatList;
    }

    @GetMapping(path = "/geschaeftszimmer")
    public Iterable<Object> findAllGeschäftszimmer() {
        return telefonatTaskRepository.findAllByCardCategoryGeschaeft();
    }


    @GetMapping(path = "/all")
    public Iterable<TelefonatTaskEntity> findAll() {
        return telefonatTaskRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<TelefonatTaskEntity> findTask(@PathVariable Long id) {
        return telefonatTaskRepository.findById(id);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteTask(@PathVariable Long id) {
        telefonatTaskRepository.deleteById(id);
    }


    /**
     * Example request:
     * <code>
     * {
     * "phonenumber": "123"
     * }
     * </code>
     *
     * @param entity
     * @return
     */
    @PostMapping(path = "/new")
    public String newTest(@RequestBody TelefonatTaskEntity entity) {
        telefonatTaskRepository.save(entity);
        return "Foo" + entity.getPhonenumber(); // returns "Foo123"
    }

    //@PutMapping(path = "/update/{id}")
    // public void  updateCard (@RequestBody TelefonatTaskEntity update, @PathVariable Long id) {
    //  telefonatTaskRepository.findById(id);
    // update.setCaller(update.getCaller());
    // update.setMessage(update.getMessage());
    // telefonatTaskRepository.save(update);
    // ResponseEntity.noContent().build();

}



