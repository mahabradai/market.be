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

import tn.csf.market.be.model.Qualitycontrol;
import tn.csf.market.be.service.QualitycontrolService;

//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")

public class QualitycontrolController {

	//autowire the FactureService class  
	@Autowired  
	QualitycontrolService qs;  

	//creating a get mapping that retrieves all the Qualitycontrol detail from the database   
	@GetMapping("/qualitycontrol")
	private List<Qualitycontrol> getAllQualitycontrol()   
	{  
		return qs.getAllQualitycontrol();  
	}  

	//creating a get mapping that retrieves the detail of a specific Qualitycontrol 
	@GetMapping("/qualitycontrol/{id}")  
	private Qualitycontrol getQualitycontrol(@PathVariable("id") int id)   
	{  
		return qs.getQualitycontrolById(id);  
	}  

	//creating a delete mapping that deletes a specified Qualitycontrol 
	@DeleteMapping("/qualitycontrol/{id}")  
	private void deletequalitycontrol(@PathVariable("id") int id)   
	{  
		qs.delete(id);  
	} 

	//create new qualitycontrol
	@PostMapping("/qualitycontrol")  
	private int saveQualitycontrol(@RequestBody Qualitycontrol q)   
	{  
		qs.saveOrUpdate(q);  
		return q.getId();  
	} 

	//creating put mapping that updates the Qualitycontrol detail
	@PutMapping("/qualitycontrol")  
	private Qualitycontrol update(@RequestBody  Qualitycontrol q)   
	{  
		qs.saveOrUpdate(q);  
		return q;  
	}  
}

