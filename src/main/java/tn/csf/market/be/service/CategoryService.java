package tn.csf.market.be.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import tn.csf.market.be.model.Category;
import tn.csf.market.be.repository.CategoryRepository;


//defining the business logic  
@Service 

public class CategoryService {

	@Autowired  
	CategoryRepository cR;  

	//getting all client record by using the method findaAll() of CrudRepository  
	public List<Category> getAllCategory()   
	{  
		List<Category> category = new ArrayList<Category>();  
		cR.findAll().forEach(c  -> category.add(c));  
		return category;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Category getCategoryById(int id)   
	{  
		return cR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Category c)   
	{  
		cR.save(c);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		cR.deleteById(id);  
	} 

}

