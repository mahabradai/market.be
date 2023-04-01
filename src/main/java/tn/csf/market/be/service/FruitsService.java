package tn.csf.market.be.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import tn.csf.market.be.model.Fruits;
import tn.csf.market.be.repository.FruitsRepository;


//defining the business logic  
@Service 

public class FruitsService {

	@Autowired  
	FruitsRepository fR;  

	//getting all fruits record by using the method findaAll() of CrudRepository  
	public List<Fruits> getAllFruits()   
	{  
		List<Fruits> fruits = new ArrayList<Fruits>();  
		fR.findAll().forEach(f  -> fruits.add(f));  
		return fruits;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Fruits getFruitsById(int id)   
	{  
		return fR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Fruits f)   
	{  
		fR.save(f);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		fR.deleteById(id);  
	} 

}
