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



    @GetMapping(path = "/referatsueber")
    public List<GenericTaskEntity> findAllReferatsueber() {
        List<GenericTaskEntity> referatList = new ArrayList<>();
        referatList.addAll(dringendTaskRepository.findAllByCardCategoryReferat());
        referatList.addAll(telefonatTaskRepository.findAllByCardCategoryReferat());
        referatList.addAll(mitarbeiteranmeldenTaskRepository.findAllByCardCategoryReferat());
        referatList.addAll(sonstigesTaskRepository.findAllByCardCategoryReferat());
        referatList.addAll(veranstaltungTaskRepository.findAllByCardCategoryReferat());
        referatList.addAll(wanderkarteTaskRepository.findAllByCardCategoryReferat());

        return referatList;
    }

    @GetMapping(path = "/geschaeft")
    public List<GenericTaskEntity> findAllGeschäftszimmer() {
        List<GenericTaskEntity> geschaeftList = new ArrayList<>();
        geschaeftList.addAll(dringendTaskRepository.findAllByCardCategoryGeschaeft());
        geschaeftList.addAll(telefonatTaskRepository.findAllByCardCategoryGeschaeft());
        geschaeftList.addAll(mitarbeiteranmeldenTaskRepository.findAllByCardCategoryGeschaeft());
        geschaeftList.addAll(sonstigesTaskRepository.findAllByCardCategoryGeschaeft());
        geschaeftList.addAll(veranstaltungTaskRepository.findAllByCardCategoryGeschaeft());
        geschaeftList.addAll(wanderkarteTaskRepository.findAllByCardCategoryGeschaeft());
        return geschaeftList;
    }

    @GetMapping(path = "/langfristig")
    public List<GenericTaskEntity> findAllLangfristig() {
        List<GenericTaskEntity> langfristigList = new ArrayList<>();
        langfristigList.addAll(dringendTaskRepository.findAllByCardCategoryLang());
        langfristigList.addAll(telefonatTaskRepository.findAllByCardCategoryLang());
        langfristigList.addAll(mitarbeiteranmeldenTaskRepository.findAllByCardCategoryLang());
        langfristigList.addAll(sonstigesTaskRepository.findAllByCardCategoryLang());
        langfristigList.addAll(veranstaltungTaskRepository.findAllByCardCategoryLang());
        langfristigList.addAll(wanderkarteTaskRepository.findAllByCardCategoryLang());
        return langfristigList;
    }

    @GetMapping(path = "/done")
    public List<GenericTaskEntity> findAllDone() {
        List<GenericTaskEntity> doneList = new ArrayList<>();
        doneList.addAll(dringendTaskRepository.findAllByCardCategoryDone());
        doneList.addAll(telefonatTaskRepository.findAllByCardCategoryDone());
        doneList.addAll(mitarbeiteranmeldenTaskRepository.findAllByCardCategoryDone());
        doneList.addAll(sonstigesTaskRepository.findAllByCardCategoryDone());
        doneList.addAll(veranstaltungTaskRepository.findAllByCardCategoryDone());
        doneList.addAll(wanderkarteTaskRepository.findAllByCardCategoryDone());
        return doneList;
    }

}
