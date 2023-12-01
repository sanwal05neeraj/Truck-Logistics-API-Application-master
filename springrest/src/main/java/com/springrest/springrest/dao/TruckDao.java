package com.springrest.springrest.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.springrest.springrest.entities.Truck;


public interface TruckDao extends JpaRepository<Truck, Long> {

}
