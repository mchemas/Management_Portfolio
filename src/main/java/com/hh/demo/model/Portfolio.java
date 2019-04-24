package com.hh.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "portfolio")
public class Portfolio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	@Column
	private String name;
	@Column
	private double budget;
	@Column
	private String owner;
	@Column
	@ElementCollection(targetClass = Project.class)
	private List<Project> projects;

	public Portfolio() {
		// TODO Auto-generated constructor stub
	}

	public Portfolio(String name, double budget, String owner, ArrayList<Project> projects) {
		super();
		this.name = name;
		this.budget = budget;
		this.owner = owner;
		this.projects = projects;
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

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Portfolio [id=" + id + ", name=" + name + ", budget=" + budget + ", owner=" + owner + ", projects="
				+ projects + "]";
	}

}
