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

import tn.csf.market.be.model.Facture;
import tn.csf.market.be.service.FactureService;

//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")

public class FactureController {

	//autowire the FactureService class  
	@Autowired  
	FactureService fs;  

	//creating a get mapping that retrieves all the Facture detail from the database   
	@GetMapping("/facture")
	private List<Facture> getAllFacture()   
	{  
		return fs.getAllFacture();  
	}  

	//creating a get mapping that retrieves the detail of a specific Facture 
	@GetMapping("/facture/{id}")  
	private Facture getFacture(@PathVariable("id") int id)   
	{  
		return fs.getFactureById(id);  
	}  

	//creating a delete mapping that deletes a specified facture  
	@DeleteMapping("/facture/{id}")  
	private void deleteFacture(@PathVariable("id") int id)   
	{  
		fs.delete(id);  
	} 

	//create new facture
	@PostMapping("/facture")  
	private int saveFacture(@RequestBody Facture f)   
	{  
		fs.saveOrUpdate(f);  
		return f.getId();  
	} 

	//creating put mapping that updates the facture detail
	@PutMapping("/facture")  
	private Facture update(@RequestBody  Facture f)   
	{  
		fs.saveOrUpdate(f);  
		return f;  
	}  
}

