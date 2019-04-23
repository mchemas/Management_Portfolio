package com.hh.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "consultant")
public class Consultant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	@Column
	private String name;
	@Column
	private String role;
	@Column
	private int duration; //months
	
	public Consultant() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Consultant(String name, String role, int duration) {
		super();
		this.name = name;
		this.role = role;
		this.duration = duration;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}



	@Override
	public String toString() {
		return "Consultant [id=" + id + ", name=" + name + ", role=" + role + ", duration=" + duration + "]";
	}


	
	
	
	
	
}
