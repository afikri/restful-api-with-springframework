package net.afikri.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	@Id
    @Column(name = "id")
    int id;

    @Column(name = "fullName")
    String fullName;

    @Column(name = "position")
    String position;
    
    @Column(name = "salary")
    float salary;

    public Employee() {
    	super();
    }
    
    public Employee(int id, String fullName, String position, float salary) {
    	super();
    	this.id = id;
    	this.fullName = fullName;
    	this.position = position;
    	this.salary = salary;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}   
}
