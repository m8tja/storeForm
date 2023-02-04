package com.example.storeForm.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "obrazec")
public class Obrazec implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String date;
    private String served_by;
    private String email;
    private String bt_broadband;
    private String bttv_package;
    @Transient
    private Integer monthly_charge;
    @Transient
    private Integer upfront_fee;
    @Transient
    private Integer payment_installments;
    private String handy_information;
    private Integer total_payment;
    private String sport_package;

    public Obrazec() {}

    public Obrazec(String name, String date, String served_by, String email, String bt_broadband, String bttv_package,
                   String handy_information, String sport_package, Integer total_payment) {
        this.name = name;
        this.date = date;
        this.served_by = served_by;
        this.email = email;
        this.bt_broadband = bt_broadband;
        this.bttv_package = bttv_package;
        this.total_payment = total_payment;
        this.handy_information = handy_information;
        this.sport_package = sport_package;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getServed_by() {
        return served_by;
    }

    public void setServed_by(String served_by) {
        this.served_by = served_by;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBt_broadband() {
        return bt_broadband;
    }

    public void setBt_broadband(String bt_broadband) {
        this.bt_broadband = bt_broadband;
    }

    public String getBttv_package() {
        return bttv_package;
    }

    public void setBttv_package(String bttv_package) {
        this.bttv_package = bttv_package;
    }

    public Integer getMonthly_charge() {
        return monthly_charge;
    }

    public void setMonthly_charge(Integer monthly_charge) {
        this.monthly_charge = monthly_charge;
    }

    public Integer getUpfront_fee() {
        return upfront_fee;
    }

    public void setUpfront_fee(Integer upfront_fee) {
        this.upfront_fee = upfront_fee;
    }

    public Integer getPayment_installments() {
        return payment_installments;
    }

    public void setPayment_installments(Integer payment_installments) {
        this.payment_installments = payment_installments;
    }

    public String getHandy_information() {
        return handy_information;
    }

    public void setHandy_information(String handy_information) {
        this.handy_information = handy_information;
    }

    public Integer getTotal_payment() {
        return total_payment;
    }

    public void setTotal_payment(Integer total_payment) {
        this.total_payment = total_payment;
    }

    public String getSport_package() {
        return sport_package;
    }

    public void setSport_package(String sport_package) {
        this.sport_package = sport_package;
    }
}
