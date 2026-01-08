package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.RoomBooking;

public interface RoomBookingRepository extends JpaRepository<RoomBooking, Integer>{

}
