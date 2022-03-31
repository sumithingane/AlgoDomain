package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.MensClothing;

@Repository
public interface MensClothingRepository extends JpaRepository<MensClothing, Integer> {

}
