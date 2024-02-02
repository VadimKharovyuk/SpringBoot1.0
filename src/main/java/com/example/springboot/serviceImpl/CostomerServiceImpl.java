package com.example.springboot.serviceImpl;

import com.example.springboot.model.CustomerDto;
import com.example.springboot.service.CostomerService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class CostomerServiceImpl implements CostomerService {
    private Map<Integer,CustomerDto>  persist = new HashMap<>();

    @Override
    public void addCostomer(int id, String name) {
        persist.put(id,new CustomerDto(id,name));
    }

    @Override
    public CustomerDto getCostimerId(int id) {
        return persist.get(id);
    }
}
