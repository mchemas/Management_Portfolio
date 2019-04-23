package com.hh.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hh.demo.dao.PortfolioDAO;
import com.hh.demo.model.Portfolio;

@Service
public class PortfolioServiceImpl {

	@Autowired
	private PortfolioDAO portfolioDAO;
	
	@Transactional
	public List<Portfolio> get() {
		
		return portfolioDAO.findAll();
	}
	@Transactional
	public Optional<Portfolio> get(int id) {
		return portfolioDAO.findById(id);
	}
	@Transactional
	public void create(Portfolio portfolio) {
		portfolioDAO.save(portfolio);
	}
	@Transactional
	public void delete(Portfolio portfolio) {
		portfolioDAO.delete(portfolio);
	}
}
