package com.example.springboot.service;

import com.example.springboot.model.CustomerDto;

public interface CostomerService  {
    void addCostomer(int id, String name);
    CustomerDto getCostimerId(int id) ;

}
