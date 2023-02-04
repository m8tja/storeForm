package com.example.storeForm.service;

import com.example.storeForm.model.Obrazec;
import com.example.storeForm.repository.ObrazecRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObrazecService {

    @Autowired
    private ObrazecRepo obrazecRepo;

    public List<Obrazec> getObrazec() {
        return (List<Obrazec>) obrazecRepo.findAll();
    }

    public Obrazec addObrazec(Obrazec obrazec) {

        int fee = obrazec.getUpfront_fee();
        int charge = obrazec.getMonthly_charge();
        int installments = obrazec.getPayment_installments();

        int total = fee + (charge * installments);
        obrazec.setTotal_payment(total);

        return obrazecRepo.save(obrazec);
    }
}
