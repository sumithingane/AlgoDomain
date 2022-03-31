package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.WomensClothing;

@Repository
public interface WomensClothingRepository extends JpaRepository<WomensClothing, Integer>{

}
