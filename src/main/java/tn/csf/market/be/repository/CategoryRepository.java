package tn.csf.market.be.repository;

import org.springframework.data.repository.CrudRepository;

import tn.csf.market.be.model.Category;
 
//repository that extends CrudRepository  

public interface CategoryRepository extends CrudRepository<Category, Integer>  
{  
}  


