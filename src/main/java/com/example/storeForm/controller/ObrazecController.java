package com.example.storeForm.controller;

import com.example.storeForm.model.Obrazec;
import com.example.storeForm.service.ObrazecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class ObrazecController {

    @Autowired
    private ObrazecService obrazecService;

    @PostMapping("/add")
    public ResponseEntity<Obrazec> addEmployee(@RequestBody Obrazec obrazec) {
        Obrazec newObrazec = obrazecService.addObrazec(obrazec);
        return new ResponseEntity<>(newObrazec, HttpStatus.CREATED);
    }
}
