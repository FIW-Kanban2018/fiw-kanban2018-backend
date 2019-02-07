package de.htw.fiw2018.kanban.controller;

import de.htw.fiw2018.kanban.entity.GenericTaskEntity;
import de.htw.fiw2018.kanban.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    List<GenericTaskEntity> referatList = new ArrayList<>();
    List<GenericTaskEntity> geschaeftList = new ArrayList<>();
    List<GenericTaskEntity> langfristigList = new ArrayList<>();
    List<GenericTaskEntity> doneList = new ArrayList<>();

    @GetMapping(path = "/referatsueber")
    public List<GenericTaskEntity> findAllReferatsueber() {
        this.referatList.addAll(dringendTaskRepository.findAllByCardCategoryReferat());
        this.referatList.addAll(telefonatTaskRepository.findAllByCardCategoryReferat());
        this.referatList.addAll(mitarbeiteranmeldenTaskRepository.findAllByCardCategoryReferat());
        this.referatList.addAll(sonstigesTaskRepository.findAllByCardCategoryReferat());
        this.referatList.addAll(veranstaltungTaskRepository.findAllByCardCategoryReferat());
        this.referatList.addAll(wanderkarteTaskRepository.findAllByCardCategoryReferat());
//        referatList.forEach((temp) -> {
//            System.out.println(temp.toString());
//        });
//        for (Map.Entry<String, String> entry : referatList.entrySet())
//        {
//            System.out.println(entry.getKey() + "/" + entry.getValue());
//        }
        return this.referatList;
    }

    @GetMapping(path = "/geschaeft")
    public Iterable<GenericTaskEntity> findAllGeschäftszimmer() {
        this.geschaeftList.addAll(dringendTaskRepository.findAllByCardCategoryGeschaeft());
        this.geschaeftList.addAll(telefonatTaskRepository.findAllByCardCategoryGeschaeft());
        this.geschaeftList.addAll(mitarbeiteranmeldenTaskRepository.findAllByCardCategoryGeschaeft());
        this.geschaeftList.addAll(sonstigesTaskRepository.findAllByCardCategoryGeschaeft());
        this.geschaeftList.addAll(veranstaltungTaskRepository.findAllByCardCategoryGeschaeft());
        this.geschaeftList.addAll(wanderkarteTaskRepository.findAllByCardCategoryGeschaeft());
        return this.geschaeftList;
    }

    @GetMapping(path = "/langfristig")
    public Iterable<GenericTaskEntity> findAllLangfristig() {
        this.langfristigList.addAll(dringendTaskRepository.findAllByCardCategoryLang());
        this.langfristigList.addAll(telefonatTaskRepository.findAllByCardCategoryLang());
        this.langfristigList.addAll(mitarbeiteranmeldenTaskRepository.findAllByCardCategoryLang());
        this.langfristigList.addAll(sonstigesTaskRepository.findAllByCardCategoryLang());
        this.langfristigList.addAll(veranstaltungTaskRepository.findAllByCardCategoryLang());
        this.langfristigList.addAll(wanderkarteTaskRepository.findAllByCardCategoryLang());
        return this.langfristigList;
    }

    @GetMapping(path = "/done")
    public Iterable<GenericTaskEntity> findAllDone() {
        this.doneList.addAll(dringendTaskRepository.findAllByCardCategoryDone());
        this.doneList.addAll(telefonatTaskRepository.findAllByCardCategoryDone());
        this.doneList.addAll(mitarbeiteranmeldenTaskRepository.findAllByCardCategoryDone());
        this.doneList.addAll(sonstigesTaskRepository.findAllByCardCategoryDone());
        this.doneList.addAll(veranstaltungTaskRepository.findAllByCardCategoryDone());
        this.doneList.addAll(wanderkarteTaskRepository.findAllByCardCategoryDone());
        return this.doneList;
    }

}
