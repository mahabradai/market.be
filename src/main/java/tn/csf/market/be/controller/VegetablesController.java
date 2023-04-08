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

import tn.csf.market.be.model.Vegetables;
import tn.csf.market.be.service.VegetablesService;

//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")

public class VegetablesController {

	//autowire the vegetablesService class  
	@Autowired  
	VegetablesService vs;  

	//creating a get mapping that retrieves all the vegetables detail from the database   
	@GetMapping("/vegetables")
	private List<Vegetables> getAllVegetables()   
	{  
		return vs.getAllVegetables();  
	}  

	//creating a get mapping that retrieves the detail of a specific vegetables 
		@GetMapping("/vegetables/{id}")  
		private Vegetables getVegetables(@PathVariable("id") int id)   
		{  
			return vs.getVegetablesById(id);  
		}  

	//creating a delete mapping that deletes a specified vegetables 
	@DeleteMapping("/vegetables/{id}")  
	private void deleteVegetables(@PathVariable("id") int id)   
	{  
		vs.delete(id);  
	} 

	//create new vegetables
	@PostMapping("/vegetables")  
	private int saveVegetables(@RequestBody Vegetables v)   
	{  
		vs.saveOrUpdate(v);  
		return v.getId();  
	} 

	//creating put mapping that updates the vegetables detail
	@PutMapping("/vegetables")  
	private Vegetables update(@RequestBody  Vegetables v)   
	{  
		vs.saveOrUpdate(v);  
		return v;  
	}  
}

