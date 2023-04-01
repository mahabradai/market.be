package tn.csf.market.be.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import tn.csf.market.be.model.Client;
import tn.csf.market.be.repository.ClientRepository;


//defining the business logic  
@Service 

public class ClientService {

	@Autowired  
	ClientRepository cR;  

	//getting all client record by using the method findaAll() of CrudRepository  
	public List<Client> getAllClient()   
	{  
		List<Client> client = new ArrayList<Client>();  
		cR.findAll().forEach(c  -> client.add(c));  
		return client;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Client getClientById(int id)   
	{  
		return cR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Client c)   
	{  
		cR.save(c);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		cR.deleteById(id);  
	} 

}



