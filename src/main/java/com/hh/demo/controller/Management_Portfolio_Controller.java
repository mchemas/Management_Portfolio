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

import com.hh.demo.model.Portfolio;
import com.hh.demo.service.PortfolioService;
//import com.hh.demo.service.ProjectService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class Management_Portfolio_Controller {

	/*
	 * @Autowired private ProjectService projectService;
	 */
	
	@Autowired
	private PortfolioService portfolioService;
	
	/*********************************************************************************************/
	
	@GetMapping("/portfolios")
	public List<Portfolio> getPortfolios() {
		return portfolioService.get();
	}
	
	@GetMapping("/portfolio/{id}")
	public Optional<Portfolio> getPortfolio(@PathVariable Integer id) {
		return portfolioService.get(id);
	}
	
	@DeleteMapping("/portfolio/{id}")
	public boolean deletePortfolio(@PathVariable Integer id) {
		portfolioService.delete(id);
		return true;
	}
	
	@PostMapping("/portfolio")
	public Portfolio createPortfolio(@RequestBody Portfolio portfolio) {
		return portfolioService.create(portfolio);
	}
	
	@PutMapping("/portfolio")
	public Portfolio updatePortfolio(@RequestBody Portfolio portfolio) {
		return portfolioService.create(portfolio);
	}
	
	
	/*********************************************************************************************/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
