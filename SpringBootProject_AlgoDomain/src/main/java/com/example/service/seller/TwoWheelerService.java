package com.example.service.seller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.TwoWheelerRepository;

@Service
public class TwoWheelerService {
	
	@Autowired
	private TwoWheelerRepository twoWheelerRepo;
	
	
}
