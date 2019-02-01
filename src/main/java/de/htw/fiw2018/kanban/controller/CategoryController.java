package de.htw.fiw2018.kanban.controller;

import de.htw.fiw2018.kanban.entity.TelefonatTaskEntity;
import de.htw.fiw2018.kanban.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController extends GenericTaskController {

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

    List<Object> referatList = new ArrayList<>();
    List<Object> geschaeftList = new ArrayList<>();
    List<Object> langfristigList = new ArrayList<>();
    List<Object> doneList = new ArrayList<>();

    @GetMapping(path = "/referatsueber")
    public Iterable<Object> findAllReferatsueber() {
        this.referatList.addAll(dringendTaskRepository.findAllByCardCategoryReferat());
        this.referatList.addAll(telefonatTaskRepository.findAllByCardCategoryReferat());
        this.referatList.addAll(mitarbeiteranmeldenTaskRepository.findAllByCardCategoryReferat());
        this.referatList.addAll(sonstigesTaskRepository.findAllByCardCategoryReferat());
        this.referatList.addAll(veranstaltungTaskRepository.findAllByCardCategoryReferat());
        this.referatList.addAll(wanderkarteTaskRepository.findAllByCardCategoryReferat());
        System.out.println("referatList: " + this.referatList.size());
        return this.referatList;
    }

    @GetMapping(path = "/geschaeft")
    public Iterable<Object> findAllGeschäftszimmer() {
        this.geschaeftList.addAll(dringendTaskRepository.findAllByCardCategoryGeschaeft());
        this.geschaeftList.addAll(telefonatTaskRepository.findAllByCardCategoryGeschaeft());
        this.geschaeftList.addAll(mitarbeiteranmeldenTaskRepository.findAllByCardCategoryGeschaeft());
        this.geschaeftList.addAll(sonstigesTaskRepository.findAllByCardCategoryGeschaeft());
        this.geschaeftList.addAll(veranstaltungTaskRepository.findAllByCardCategoryGeschaeft());
        this.geschaeftList.addAll(wanderkarteTaskRepository.findAllByCardCategoryGeschaeft());
        System.out.println("geschaeftList: " + this.geschaeftList.size());
        return this.geschaeftList;
    }

     @GetMapping(path = "/langfristig")
    public Iterable<Object> findAllLangfristig() {
        return this.langfristigList;
    }

    @GetMapping(path = "/done")
    public Iterable<Object> findAllDone() {
        return this.doneList;
    }

}
