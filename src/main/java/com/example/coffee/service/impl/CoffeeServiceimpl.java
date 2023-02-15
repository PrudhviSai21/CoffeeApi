package com.example.coffee.service.impl;

import com.example.coffee.exception.ResourceNotFoundException;
import com.example.coffee.models.Coffee;
import com.example.coffee.repository.CoffeeRepository;
import com.example.coffee.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoffeeServiceimpl implements CoffeeService {

    @Autowired
    private CoffeeRepository coffeeRepository;
    int milk=400,water=200,coffepowder=200,completeCoffe=0;
    @Override
    public Coffee createCoffe(Coffee coffee) {
//        latte espresso cappacino
        switch (coffee.getType()){
            case "latte":
                if(milk>29 && water>4 && coffepowder>9){
                    milk=milk-30;
                    water=water-5;
                    coffepowder=coffepowder-10;
                    coffee.setMilk_quantity(30);
                    coffee.setCoffee_powder(10);
                    coffee.setWater_quantity(5);
                    System.out.println("Milk in millilitres taken "+milk+"Water in millilitres taken "+water+"Coffeepowder in milligrams taken"+coffepowder);
                }
                else
                    throw new ResourceNotFoundException("Coffee","type",coffee.getType());
                break;
            case "expresso":
                if( milk>34 && water>6 && coffepowder>19){
                    milk-=35;
                    water-=7;
                    coffepowder-=20;
                    System.out.println("Milk in millilitres taken "+milk+"Water in millilitres taken "+water+"Coffeepowder in milligrams taken"+coffepowder);
                    coffee.setMilk_quantity(35);
                    coffee.setCoffee_powder(7);
                    coffee.setWater_quantity(20);
                }
                else
                    throw new ResourceNotFoundException("Coffee","type",coffee.getType());
                break;
            case "cappacino":
                if(milk>39 && water>5 && coffepowder>24){
                    milk-=40;
                    water-=6;
                    coffepowder-=25;
                    System.out.println("Milk in millilitres taken "+milk+"Water in millilitres taken "+water+"Coffeepowder in milligrams taken"+coffepowder);
                    coffee.setMilk_quantity(30);
                    coffee.setCoffee_powder(10);
                    coffee.setWater_quantity(5);
                }
                else
                    throw new ResourceNotFoundException("Coffee","type",coffee.getType());
                break;
            case "milk":
                if(milk>39){
                    milk-=40;
                    System.out.println("Milk in millilitres taken "+milk);
                    coffee.setMilk_quantity(milk);
                    coffee.setCoffee_powder(0);
                    coffee.setWater_quantity(0);
                }
                else
                    throw new ResourceNotFoundException("Coffee","type",coffee.getType());
                break;
            default:
                throw new ResourceNotFoundException("Coffee","type",coffee.getType());
        }
       return this.coffeeRepository.save(coffee);
    }


    @Override
    public List<Coffee> listCoffee() {
        List<Coffee> coffee=this.coffeeRepository.findAll();
        return coffee;
    }

    @Override
    public List<String> menu() {
        List<String> coffees=new ArrayList<String>();
        coffees.add("latte");
        coffees.add("expresso");
        coffees.add("cappacino");
        coffees.add("milk");
        return coffees;
    }
}
