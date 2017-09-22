package com.map.bi;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Company_Table")
public class Company {
	
	@Id
	@GeneratedValue
	@Column (name="Cmp_id")
	 private int cId;
	
	@Column(name="Cmp_name")
	 private String cName;
	
	@Column (name="Cmp_Location")
	 private String cLoc;
	
 @OneToMany(mappedBy="company",cascade=CascadeType.ALL)
   private List<Employee> employee;
	
	public Company(String cName, String cLoc) {
		super();
		this.cName = cName;
		this.cLoc = cLoc;
	}


	public Company() {
		super();
	}


	public int getcId() {
		return cId;
	}


	public void setcId(int cId) {
		this.cId = cId;
	}


	public String getcName() {
		return cName;
	}


	public void setcName(String cName) {
		this.cName = cName;
	}


	public String getcLoc() {
		return cLoc;
	}


	public void setcLoc(String cLoc) {
		this.cLoc = cLoc;
	}


	@Override
	public String toString() {
		return "Company [cId=" + cId + ", cName=" + cName + ", cLoc=" + cLoc + "]";
	}
	
	
	
	
	

}
