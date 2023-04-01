package tn.csf.market.be.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.csf.market.be.model.Fruits;
import tn.csf.market.be.service.FruitsService;

//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")

public class FruitsController {

	//autowire the FruitsService class  
	@Autowired  
	FruitsService fs;  

	//creating a get mapping that retrieves all the Fruits detail from the database   
	@GetMapping("/fruits")
	private List<Fruits> getAllFruits()   
	{  
		return fs.getAllFruits();  
	}  

	//creating a get mapping that retrieves the detail of a specific fruits 
	@GetMapping("/fruits/{id}")  
	private Fruits getFruits(@PathVariable("id") int id)   
	{  
		return fs.getFruitsById(id);  
	}  

	//creating a delete mapping that deletes a specified fruits  
	@DeleteMapping("/fruits/{id}")  
	private void deleteFruits(@PathVariable("id") int id)   
	{  
		fs.delete(id);  
	} 

	//create new fruits
	@PostMapping("/fruits")  
	private int saveFruits(@RequestBody Fruits f)   
	{  
		fs.saveOrUpdate(f);  
		return f.getId();  
	} 

	//creating put mapping that updates the fruits detail
	@PutMapping("/fruits")  
	private Fruits update(@RequestBody  Fruits f)   
	{  
		fs.saveOrUpdate(f);  
		return f;  
	}  
}

