package com.example.storeForm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.storeForm.model.Store;

public interface StoreRepo extends JpaRepository<Store, String> {

}
