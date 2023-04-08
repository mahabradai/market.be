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

import tn.csf.market.be.model.Review;
import tn.csf.market.be.service.ReviewService;

//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")

public class ReviewController {

	//autowire the ReviewService class  
	@Autowired  
	ReviewService rs;  

	//creating a get mapping that retrieves all the Review detail from the database   
	@GetMapping("/review")
	private List<Review> getAllReview()   
	{  
		return rs.getAllReview();  
	}  

	//creating a get mapping that retrieves the detail of a specific Review 
	@GetMapping("/review/{id}")  
	private Review getReview(@PathVariable("id") int id)   
	{  
		return rs.getReviewById(id);  
	}  

	//creating a delete mapping that deletes a specified Review  
	@DeleteMapping("/review/{id}")  
	private void deleteReview(@PathVariable("id") int id)   
	{  
		rs.delete(id);  
	} 

	//create new review
	@PostMapping("/review")  
	private int saveReview(@RequestBody Review r)   
	{  
		rs.saveOrUpdate(r);  
		return r.getId();  
	} 

	//creating put mapping that updates the Review detail
	@PutMapping("/review")  
	private Review update(@RequestBody  Review r)   
	{  
		rs.saveOrUpdate(r);  
		return r;  
	}  
}

