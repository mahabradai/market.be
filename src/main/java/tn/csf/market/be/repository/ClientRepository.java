package tn.csf.market.be.repository;

import org.springframework.data.repository.CrudRepository;

import tn.csf.market.be.model.Client;

 
//repository that extends CrudRepository  

public interface ClientRepository extends CrudRepository<Client, Integer>  
{  
}  
