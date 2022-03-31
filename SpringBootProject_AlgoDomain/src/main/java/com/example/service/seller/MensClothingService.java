package com.example.service.seller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.MensClothingRepository;

@Service
public class MensClothingService {
	
	@Autowired
	private MensClothingRepository mensClothingRepo;
	
}
