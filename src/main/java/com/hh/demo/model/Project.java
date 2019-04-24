package com.hh.demo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "project")
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	@Column
	private String name;
	@Column
	private String type;
	@Column
	@Temporal(TemporalType.DATE)
	private Date start;
	@Column
	@Temporal(TemporalType.DATE)
	private Date end;
	@Column
	private int duration;
	@Column
	private String status;
	@Column
	private String methodology;
	@Column
	private String description;
	@Column
	private String tools;
	@Column
	private String pm;
	@Column
	private String dm;
	@Column
	private String client;
	@Column
	private double budget;
	@Column
	private double effort;
	@Column
	@ElementCollection(targetClass = Consultant.class)
	@OneToMany
	private List<Consultant> consultants;
	@Column
	@ElementCollection(targetClass = ClientPOC.class)
	@OneToMany
	private List<ClientPOC> clientPOCs;

	public Project() {
		// TODO Auto-generated constructor stub
	}

	
	
	public List<ClientPOC> getClientPOCs() {
		return clientPOCs;
	}



	public void setClientPOCs(List<ClientPOC> clientPOCs) {
		this.clientPOCs = clientPOCs;
	}



	public List<Consultant> getConsultants() {
		return consultants;
	}


	public void setConsultants(List<Consultant> consultants) {
		this.consultants = consultants;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMethodology() {
		return methodology;
	}

	public void setMethodology(String methodology) {
		this.methodology = methodology;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTools() {
		return tools;
	}

	public void setTools(String tools) {
		this.tools = tools;
	}

	public String getPm() {
		return pm;
	}

	public void setPm(String pm) {
		this.pm = pm;
	}

	public String getDm() {
		return dm;
	}

	public void setDm(String dm) {
		this.dm = dm;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public double getEffort() {
		return effort;
	}

	public void setEffort(double effort) {
		this.effort = effort;
	}



	public Project(String name, String type, Date start, Date end, int duration, String status, String methodology,
			String description, String tools, String pm, String dm, String client, double budget, double effort,
			List<Consultant> consultants, List<ClientPOC> clientPOCs) {
		super();
		this.name = name;
		this.type = type;
		this.start = start;
		this.end = end;
		this.duration = duration;
		this.status = status;
		this.methodology = methodology;
		this.description = description;
		this.tools = tools;
		this.pm = pm;
		this.dm = dm;
		this.client = client;
		this.budget = budget;
		this.effort = effort;
		this.consultants = consultants;
		this.clientPOCs = clientPOCs;
	}



	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", type=" + type + ", start=" + start + ", end=" + end
				+ ", duration=" + duration + ", status=" + status + ", methodology=" + methodology + ", description="
				+ description + ", tools=" + tools + ", pm=" + pm + ", dm=" + dm + ", client=" + client + ", budget="
				+ budget + ", effort=" + effort + ", consultants=" + consultants + ", clientPOCs=" + clientPOCs + "]";
	}
	
	


	

}
