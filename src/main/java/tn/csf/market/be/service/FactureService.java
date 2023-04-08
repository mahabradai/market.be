package tn.csf.market.be.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import tn.csf.market.be.model.Facture;
import tn.csf.market.be.repository.FactureRepository;


//defining the business logic  
@Service 

public class FactureService {

	@Autowired  
	FactureRepository fR;  

	//getting all facture record by using the method findaAll() of CrudRepository  
	public List<Facture> getAllFacture()   
	{  
		List<Facture> facture = new ArrayList<Facture>();  
		fR.findAll().forEach(f  -> facture.add(f));  
		return facture;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Facture getFactureById(int id)   
	{  
		return fR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Facture f)   
	{  
		fR.save(f);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		fR.deleteById(id);  
	} 

}

