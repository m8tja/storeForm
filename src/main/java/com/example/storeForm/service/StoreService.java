package com.example.storeForm.service;

import com.example.storeForm.model.Store;
import com.example.storeForm.repository.StoreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {

    @Autowired
    private StoreRepo storeRepo;

    public List<Store> getStore() {
        return (List<Store>) storeRepo.findAll();
    }
}
