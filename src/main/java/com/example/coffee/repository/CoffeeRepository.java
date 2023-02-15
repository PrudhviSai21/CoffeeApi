package com.example.coffee.repository;

import com.example.coffee.models.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeRepository extends JpaRepository<Coffee,Integer> {
}
