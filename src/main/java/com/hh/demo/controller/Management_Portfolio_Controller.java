package com.hh.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hh.demo.dao.ConsultantDAO;
import com.hh.demo.exception.CustomException;
import com.hh.demo.model.Consultant;
import com.hh.demo.model.Portfolio;
import com.hh.demo.model.Project;
import com.hh.demo.service.ConsultantService;
import com.hh.demo.service.PortfolioService;
import com.hh.demo.service.ProjectService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class Management_Portfolio_Controller {

	@Autowired
	private ProjectService projectService;

	@Autowired
	private PortfolioService portfolioService;

	@Autowired
	private ConsultantDAO consultantDAO;
	
	@Autowired
	private ConsultantService consultantService;

	/*********************************************************************************************/

	@GetMapping("/portfolios")
	public List<Portfolio> getPortfolios() {
		return portfolioService.get();
	}

	@GetMapping("/portfolio/{id}")
	public Optional<Portfolio> getPortfolio(@PathVariable Integer id) throws CustomException {
		Optional<Portfolio> portfolio = portfolioService.get(id);
		if (portfolio == null) {
			throw new CustomException("Portfolio with ID: " + id + " not found");
		}
		return portfolio;
	}

	@DeleteMapping("/portfolio/{id}")
	public boolean deletePortfolio(@PathVariable Integer id) {
		portfolioService.delete(id);
		return true;
	}

	@PostMapping("/portfolio")
	public Portfolio createPortfolio(@RequestBody Portfolio portfolio) throws CustomException {
		Portfolio p = portfolioService.create(portfolio);
		if (p == null) {
			throw new CustomException("Unable to create portfolio with ID: " + portfolio.getId());
		}
		return p;
	}

	@PutMapping("/portfolio")
	public Portfolio updatePortfolio(@RequestBody Portfolio portfolio) throws CustomException {
		Optional<Portfolio> preupdate = portfolioService.get(portfolio.getId());
		portfolio = portfolioService.create(portfolio);
		Optional<Portfolio> postupdate = portfolioService.get(portfolio.getId());
		if (preupdate.equals(postupdate)) {
			throw new CustomException("Unable to update portfolio with ID: " + portfolio.getId());
		}
		return portfolio;
	}

	/*********************************************************************************************/

	@GetMapping("/projects")
	public List<Project> getProjects() {
		return projectService.get();
	}

	@GetMapping("/project/{id}")
	public Project getProject(@PathVariable Integer id) throws CustomException {
		Project project = projectService.get(id);
		if (project == null) {
			throw new CustomException("Project with ID: " + id + " not found");
		}
		return project;
	}

	@DeleteMapping("/project/{id}")
	public boolean deleteProject(@PathVariable Integer id) {
		projectService.delete(id);
		return true;
	}

	@PostMapping("/project")
	public Project createProject(@RequestBody Project project) throws CustomException {
		Project p = projectService.create(project);
		if (p == null) {
			throw new CustomException("Unable to create project with ID: " + project.getId());
		}
		return p;
	}

	@PutMapping("/project")
	public Project updateProject(@RequestBody Project project) throws CustomException {
		Project preupdate = projectService.get(project.getId());
		project = projectService.create(project);
		Project postupdate = projectService.get(project.getId());
		if (preupdate.equals(postupdate)) {
			throw new CustomException("Unable to update project with ID: " + project.getId());
		}
		return project;
	}

	/*********************************************************************************************
	 * Custom Consultant Endpoint - Selects Consultants who are not currently assigned to a project
	 *********************************************************************************************/
	
	@GetMapping("/unassignedConsultants")
	public List<Consultant> getUnassignedConsultants() {
		return consultantDAO.getUnassignedConsultants();
	}

	/*********************************************************************************************/
	
	@GetMapping("/consultants")
	public List<Consultant> getConsultants() {
		return consultantService.get();
	}

	@GetMapping("/consultant/{id}")
	public Consultant getConsultant(@PathVariable Integer id) throws CustomException {
		Consultant consultant = consultantService.get(id);
		if (consultant == null) {
			throw new CustomException("Consultant with ID: " + id + " not found");
		}
		return consultant;
	}

	@DeleteMapping("/consultant/{id}")
	public boolean deleteConsultant(@PathVariable Integer id) {
		consultantService.delete(id);
		return true;
	}

	@PostMapping("/consultant")
	public Consultant createConsultant(@RequestBody Consultant consultant) throws CustomException {
		Consultant c = consultantService.create(consultant);
		if (c == null) {
			throw new CustomException("Unable to create consultant with ID: " + consultant.getId());
		}
		return c;
	}

	@PutMapping("/consultant")
	public Consultant updateConsultant(@RequestBody Consultant consultant) throws CustomException {
		Consultant preupdate = consultantService.get(consultant.getId());
		consultant = consultantService.create(consultant);
		Consultant postupdate = consultantService.get(consultant.getId());
		if (preupdate.equals(postupdate)) {
			throw new CustomException("Unable to update consultant with ID: " + consultant.getId());
		}
		return consultant;
	}
	
}
