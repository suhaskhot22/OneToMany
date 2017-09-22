package com.map.uni;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Empl_Table")

public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column (name="Emp_id")
	 private int eId;
	
	@Column (name="Emp_name")
	  private String eName;
	@Column (name="Emp_sal")
	  private int eSal;
	
	@ManyToOne
	@JoinColumn(name="Cmp_Id")
	 private Company company;

	public Employee(String eName, int eSal) {
		super();
		this.eName = eName;
		this.eSal = eSal;
		}

	public Employee() {
		super();
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int geteSal() {
		return eSal;
	}

	public void seteSal(int eSal) {
		this.eSal = eSal;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eSal=" + eSal + ", company=" + company + "]";
	}
	
	
	

}
