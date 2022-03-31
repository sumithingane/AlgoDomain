package com.example.service.seller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.WomensClothingRepository;

@Service
public class WomensClothingService {
	
	@Autowired
	private WomensClothingRepository womensClothingRepo;
	
}