package com.myProject.mentoriaHB.estudoDeCaso.controllers;

import com.myProject.mentoriaHB.estudoDeCaso.dtos.PeopleRecordDto;
import com.myProject.mentoriaHB.estudoDeCaso.model.PeopleModel;
import com.myProject.mentoriaHB.estudoDeCaso.repository.PeopleRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleController {

    @Autowired
    PeopleRepository peopleRepository;

    @PostMapping("/people")
    public ResponseEntity<Object> savePeople(@RequestBody @Valid PeopleRecordDto peopleRecordDto) {
        var peopleModel = new PeopleModel();
        BeanUtils.copyProperties(peopleRecordDto, peopleModel);
        PeopleModel savedPeopleModel = peopleRepository.save(peopleModel);

        String responseMessage = String.format("Meu nome é %s, e tenho %d anos", savedPeopleModel.getName(), savedPeopleModel.getAge());

        if (savedPeopleModel == null || savedPeopleModel.getId() == null) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao salvar a entidade.");
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(responseMessage);
    }
}
