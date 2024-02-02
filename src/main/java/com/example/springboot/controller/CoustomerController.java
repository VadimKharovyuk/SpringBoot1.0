package com.example.springboot.controller;

import com.example.springboot.model.CustomerDto;
import com.example.springboot.service.CostomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class CoustomerController {
     private final CostomerService  costomerService ;

     @GetMapping()
    public CustomerDto getById(@RequestParam int id){
         return costomerService.getCostimerId(id);
     }
     @PostMapping()
    public void addCoustomer(@RequestParam  int id,@RequestParam String name){
         costomerService.addCostomer(id,name);

     }
}
