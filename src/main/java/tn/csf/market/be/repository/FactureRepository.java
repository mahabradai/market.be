package tn.csf.market.be.repository;

import org.springframework.data.repository.CrudRepository;

import tn.csf.market.be.model.Facture;

 
//repository that extends CrudRepository  

public interface FactureRepository extends CrudRepository<Facture, Integer>  
{  
}  
