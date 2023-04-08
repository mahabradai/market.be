package tn.csf.market.be.repository;
  
import org.springframework.data.repository.CrudRepository;

import tn.csf.market.be.model.Review;

 
//repository that extends CrudRepository  

public interface ReviewRepository extends CrudRepository<Review, Integer>  
{  
}  