package tn.csf.market.be.repository;

import org.springframework.data.repository.CrudRepository;

import tn.csf.market.be.model.Vegetables;

 
//repository that extends CrudRepository  

public interface VegetablesRepository extends CrudRepository<Vegetables, Integer>  
{  
}  
