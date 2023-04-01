package tn.csf.market.be.model;

import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;  
 
@Entity  
@Table  
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column 
    private int id;  
    @Column  
    private String name;
    @Column
    private String email;
    @Column
    private long mobile;
    
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
    public long getMobile() {
        return mobile;
    }
    public void setMobile(long mobile) {
        this.mobile = mobile;
    }
    @Override
    public String toString() {
        return "Client [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
    }
}
