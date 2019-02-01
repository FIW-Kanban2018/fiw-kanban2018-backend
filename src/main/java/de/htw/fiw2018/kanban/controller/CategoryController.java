package de.htw.fiw2018.kanban.controller;

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
        return this.geschaeftList;
    }

     @GetMapping(path = "/langfristig")
    public Iterable<Object> findAllLangfristig() {
         this.langfristigList.addAll(dringendTaskRepository.findAllByCardCategoryLang());
         this.langfristigList.addAll(telefonatTaskRepository.findAllByCardCategoryLang());
         this.langfristigList.addAll(mitarbeiteranmeldenTaskRepository.findAllByCardCategoryLang());
         this.langfristigList.addAll(sonstigesTaskRepository.findAllByCardCategoryLang());
         this.langfristigList.addAll(veranstaltungTaskRepository.findAllByCardCategoryLang());
         this.langfristigList.addAll(wanderkarteTaskRepository.findAllByCardCategoryLang());
        return this.langfristigList;
    }

    @GetMapping(path = "/done")
    public Iterable<Object> findAllDone() {
        this.doneList.addAll(dringendTaskRepository.findAllByCardCategoryDone());
        this.doneList.addAll(telefonatTaskRepository.findAllByCardCategoryDone());
        this.doneList.addAll(mitarbeiteranmeldenTaskRepository.findAllByCardCategoryDone());
        this.doneList.addAll(sonstigesTaskRepository.findAllByCardCategoryDone());
        this.doneList.addAll(veranstaltungTaskRepository.findAllByCardCategoryDone());
        this.doneList.addAll(wanderkarteTaskRepository.findAllByCardCategoryDone());
        return this.doneList;
    }

}
