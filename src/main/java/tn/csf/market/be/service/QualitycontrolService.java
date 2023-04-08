package tn.csf.market.be.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import tn.csf.market.be.model.Qualitycontrol;
import tn.csf.market.be.repository.QualitycontrolRepository;


//defining the business logic  
@Service 

public class QualitycontrolService {

	@Autowired  
	QualitycontrolRepository qR;  

	//getting all Qualitycontrol record by using the method findaAll() of CrudRepository  
	public List<Qualitycontrol> getAllQualitycontrol()   
	{  
		List<Qualitycontrol> qualitycontrol = new ArrayList<Qualitycontrol>();  
		qR.findAll().forEach(q  -> qualitycontrol.add(q));  
		return qualitycontrol;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Qualitycontrol getQualitycontrolById(int id)   
	{  
		return qR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Qualitycontrol q)   
	{  
		qR.save(q);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		qR.deleteById(id);  
	} 

}

