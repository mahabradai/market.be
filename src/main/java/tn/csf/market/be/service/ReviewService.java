package tn.csf.market.be.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import tn.csf.market.be.model.Review;
import tn.csf.market.be.repository.ReviewRepository;


//defining the business logic  
@Service 

public class ReviewService {

	@Autowired  
	ReviewRepository rR;  

	//getting all Review record by using the method findaAll() of CrudRepository  
	public List<Review> getAllReview()   
	{  
		List<Review> review = new ArrayList<Review>();  
		rR.findAll().forEach(r  -> review.add(r));  
		return review;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Review getReviewById(int id)   
	{  
		return rR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Review r)   
	{  
		rR.save(r);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		rR.deleteById(id);  
	} 

}

