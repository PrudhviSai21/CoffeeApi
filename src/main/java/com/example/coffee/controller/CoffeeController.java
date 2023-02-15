package com.example.coffee.controller;

import com.example.coffee.models.ApiResponse;
import com.example.coffee.models.Coffee;
import com.example.coffee.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoffeeController {

    @Autowired
    private CoffeeService coffeeService;

    @PostMapping("/CreateCoffee")
    private ResponseEntity<Coffee> createCoffee(@RequestBody Coffee coffee){
        Coffee coffee1=this.coffeeService.createCoffe(coffee);
        return new ResponseEntity<>(coffee1, HttpStatus.CREATED);
    }

    @GetMapping("/coffeelist")
    private ResponseEntity<?> listAllCoffee(){
        List<String> s=this.coffeeService.menu();
        return new ResponseEntity<>(s,HttpStatus.OK);
    }

    @GetMapping("/coffeetaken")
    private ResponseEntity<List<Coffee>> completeCoffeList(){
        List<Coffee> c=this.coffeeService.listCoffee();
        return  new ResponseEntity<>(c,HttpStatus.OK);
    }

}
