package com.devsuperior.desafio01.entities;

import org.springframework.beans.factory.annotation.Autowired;

import com.devsuperior.desafio01.services.ShippingService;

public class Order {

    private int code;
    private double basic;
    private double discount;
    
    @Autowired
    ShippingService service;

    public Order() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
