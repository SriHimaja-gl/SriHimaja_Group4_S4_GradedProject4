package com.greatLearning.employeeManagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="fname")
	private String FirstName;
	
	@Column(name="lname")
	private String LastName;
	
	@Column(name="email")
	private String email;
	
	public Employee() 
	{
		
	}

	public Employee(int id, String firstName, String lastName, String email) 
	{		
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		this.email = email;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getFirstName() 
	{
		return FirstName;
	}

	public void setFirstName(String firstName) 
	{
		FirstName = firstName;
	}

	public String getLastName() 
	{
		return LastName;
	}

	public void setLastName(String lastName) 
	{
		LastName = lastName;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	@Override
	public String toString() 
	{
		return "Employee [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", email=" + email + "]";
	}

	
}
