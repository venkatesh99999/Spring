package com.org.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
	@Id
	@Column(name="studentId",length=30)
	private Integer id;
	@Column(name="name",length=30)
	private String name;
	@Column(name="mobileno",length=30)
	private long mobileno;
	public Integer getId() {
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
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobileno=" + mobileno + "]";
	}
	
	

}
