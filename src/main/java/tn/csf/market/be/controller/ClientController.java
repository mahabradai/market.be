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

import tn.csf.market.be.model.Client;
import tn.csf.market.be.service.ClientService;

//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")

public class ClientController {

	//autowire the ClientService class  
	@Autowired  
	ClientService cs;  

	//creating a get mapping that retrieves all the Client detail from the database   
	@GetMapping("/client")
	private List<Client> getAllClient()   
	{  
		return cs.getAllClient();  
	}  

	//creating a get mapping that retrieves the detail of a specific Client 
	@GetMapping("/client/{id}")  
	private Client getClient(@PathVariable("id") int id)   
	{  
		return cs.getClientById(id);  
	}  

	//creating a delete mapping that deletes a specified client  
	@DeleteMapping("/client/{id}")  
	private void deleteClient(@PathVariable("id") int id)   
	{  
		cs.delete(id);  
	} 

	//create new client
	@PostMapping("/client")  
	private int saveClient(@RequestBody Client c)   
	{  
		cs.saveOrUpdate(c);  
		return c.getId();  
	} 

	//creating put mapping that updates the client detail
	@PutMapping("/client")  
	private Client update(@RequestBody  Client c)   
	{  
		cs.saveOrUpdate(c);  
		return c;  
	}  
}

