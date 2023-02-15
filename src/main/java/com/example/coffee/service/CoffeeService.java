package com.example.coffee.service;

import com.example.coffee.models.Coffee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CoffeeService {

    Coffee createCoffe(Coffee coffee);
    List<Coffee> listCoffee();

    List<String> menu();

}
