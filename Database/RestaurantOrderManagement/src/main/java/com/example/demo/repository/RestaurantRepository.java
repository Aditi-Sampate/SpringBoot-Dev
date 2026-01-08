package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.RestaurantOrder;


public interface RestaurantRepository extends JpaRepository<RestaurantOrder, Integer>{

}
