package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.WashingMachine;

@Repository
public interface WashingMachineRepository extends JpaRepository<WashingMachine, Integer> {

}
