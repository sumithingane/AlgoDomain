package com.example.service.seller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.WashingMachineRepository;

@Service
public class WashingMachineService {
		
	@Autowired
	private WashingMachineRepository washingMachineRepo;
}
