package tn.csf.market.be.repository;

import org.springframework.data.repository.CrudRepository;

import tn.csf.market.be.model.Fruits;

 
//repository that extends CrudRepository  

public interface FruitsRepository extends CrudRepository<Fruits, Integer>  
{  
}  
