package tn.csf.market.be.model;

import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;  
 
@Entity  
@Table  
public class Qualitycontrol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column 
    private int id;  
    @Column  
    private String product;
    @Column  
    private String defectType;
    @Column  
    private String description;
    @Column  
    private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getDefectType() {
		return defectType;
	}
	public void setDefectType(String defectType) {
		this.defectType = defectType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Qualitycontrol [id=" + id + ", product=" + product + ", defectType=" + defectType + ", description="
				+ description + ", status=" + status + "]";
	}
}