package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.seller.FourWheelerService;
import com.example.service.seller.LaptopService;
import com.example.service.seller.MensClothingService;
import com.example.service.seller.TwoWheelerService;
import com.example.service.seller.WashingMachineService;
import com.example.service.seller.WomensClothingService;

import com.example.entity.Laptop;

@RestController
public class LaptopController {
	
	@Autowired
	private LaptopService laptopServ;
	
//	@Autowired
//	WashingMachineService washingMachineServ;
//	
//	@Autowired
//	MensClothingService mensClothingServ;
//	
//	@Autowired
//	WomensClothingService womensClothingServ;
//	
//	@Autowired
//	FourWheelerService fourWheelerServ;
//	
//	@Autowired
//	TwoWheelerService twoWheelerServ;
	
	
	@PostMapping("/addAllLaptops")
	public List<Laptop> addAllLaptops(@RequestBody List<Laptop> laptop)
	{
		return laptopServ.saveLaptop(laptop);
	}
	
	@PostMapping("/addLaptop")
	public Laptop addLaptops(@RequestBody Laptop laptop)
	{
		return laptopServ.saveLaptop(laptop);
	}
	
	@GetMapping("/getAll")
	public List<Laptop> findAllLaptops()
	{
		return laptopServ.getAllLaptop();
				
	}
	
	@GetMapping("/findId/{id}")
	public Laptop findLaptops(@PathVariable int id)
	{
		return laptopServ.getLaptopsById(id);
	}

	@PutMapping("update/{id}")
	public Laptop updateBookId(@RequestBody Laptop laptop)
	{
		return laptopServ.updateLaptopById(laptop);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delBooks(@PathVariable int id)
	{
		return laptopServ.deleteLaptopById(id);
	}
	
	@DeleteMapping("/deleteAll")
	public void deleteAll()
	{
		laptopServ.deleteAllLaptops();
	}
}
