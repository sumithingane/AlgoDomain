package com.example.service.seller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.FourWheelerRepository;

@Service
public class FourWheelerService {
	
	@Autowired
	private FourWheelerRepository fourWheelerRepo;
	
	
}
