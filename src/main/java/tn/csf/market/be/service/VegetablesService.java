package tn.csf.market.be.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import tn.csf.market.be.model.Vegetables;
import tn.csf.market.be.repository.VegetablesRepository;


//defining the business logic  
@Service 

public class VegetablesService {

	@Autowired  
	VegetablesRepository vR;  

	//getting all fruits record by using the method findaAll() of CrudRepository  
	public List<Vegetables> getAllVegetables()   
	{  
		List<Vegetables> vegetables = new ArrayList<Vegetables>();  
		vR.findAll().forEach(v  -> vegetables.add(v));  
		return vegetables;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Vegetables getVegetablesById(int id)   
	{  
		return vR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Vegetables v)   
	{  
		vR.save(v);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		vR.deleteById(id);  
	} 

}
