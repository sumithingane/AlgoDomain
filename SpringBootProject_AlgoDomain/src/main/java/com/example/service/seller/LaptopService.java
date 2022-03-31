package com.example.service.seller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.entity.Laptop;

import com.example.repository.LaptopRepository;

@Service
public class LaptopService {
	
	@Autowired
	private LaptopRepository laptopRepo;
	
	
	// add all laptop
	public List<Laptop> saveLaptop(List<Laptop> laptop)
	{
		 return laptopRepo.saveAll(laptop);
	}
	
	// add laptop
	public Laptop saveLaptop(Laptop laptop)
	{
		return laptopRepo.save(laptop);
	}
	
	
	//get all laptop
	public List<Laptop>getAllLaptop()
	{
		return laptopRepo.findAll();
	}
	
	// get laptop by id
	public Laptop getLaptopsById(int id)
	{
		return laptopRepo.findById(id).orElse(null);
	}
	
	// update by id
	public Laptop updateLaptopById(Laptop laptop)
	{
		Laptop existingLaptop = laptopRepo.findById(laptop.getId()).orElse(null);
		existingLaptop.setRam(laptop.getRam());
		existingLaptop.setCpu(laptop.getCpu());
		existingLaptop.setScreenSize(laptop.getScreenSize());
		existingLaptop.setGpu(laptop.getGpu());
		existingLaptop.setBrand(laptop.getBrand());
		existingLaptop.setPrice(laptop.getPrice());
		
		return laptopRepo.save(existingLaptop);
	}
	
	// delete by id
	public String deleteLaptopById(int id)
	{
		laptopRepo.deleteById(id);
		return "Laptop deleted successfully : "+id;
	}
	
	// delete all books
	public void deleteAllLaptops()
	{
		laptopRepo.deleteAll();
	}
	
	
}
