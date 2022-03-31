package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.FourWheeler;

@Repository
public interface FourWheelerRepository extends JpaRepository<FourWheeler, Integer>{

}
