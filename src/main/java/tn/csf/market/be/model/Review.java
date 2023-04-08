package tn.csf.market.be.model;

import java.sql.Date;

import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;  
 
@Entity  
@Table  
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column 
    private int id;  
    @Column  
    private String name;
    @Column
    private String email;
    @Column  
    private String comment;
    @Column
    private Date date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Review [id=" + id + ", name=" + name + ", email=" + email + ", comment=" + comment + ", date=" + date
				+ "]";
	}
}