package com.example.storeForm.controller;

import com.example.storeForm.model.Store;
import com.example.storeForm.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class StoreController {

    @Autowired
    private StoreService storeService;

    @GetMapping("/getStore")
    public List<Store> getStore() {
        return storeService.getStore();
    }
}
