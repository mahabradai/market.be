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

import tn.csf.market.be.model.Category;
import tn.csf.market.be.service.CategoryService;

//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")
public class CategoryController {

	//autowire the CategoryService class  
	@Autowired  
	CategoryService cs;  

	//creating a get mapping that retrieves all the Category detail from the database   
	@GetMapping("/category")
	private List<Category> getAllCategory() {  
		return cs.getAllCategory();  
	}  

	//creating a get mapping that retrieves the detail of a specific Category 
	@GetMapping("/category/{id}")  
	private Category getCategory(@PathVariable("id") int id) {  
		return cs.getCategoryById(id);  
	}  

	//creating a delete mapping that deletes a specified category  
	@DeleteMapping("/category/{id}")  
	private void deleteCategory(@PathVariable("id") int id) {  
		cs.delete(id);  
	} 

	//create new category
	@PostMapping("/category")  
	private int saveCategory(@RequestBody Category c) {  
		cs.saveOrUpdate(c);  
		return c.getId();  
	} 

	//creating put mapping that updates the category detail
	@PutMapping("/category")  
	private Category update(@RequestBody  Category c) {  
		cs.saveOrUpdate(c);  
		return c;  
	}  
}