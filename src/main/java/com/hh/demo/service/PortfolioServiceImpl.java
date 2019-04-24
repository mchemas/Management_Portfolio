package com.hh.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hh.demo.dao.PortfolioDAO;
import com.hh.demo.model.Portfolio;

@Service
public class PortfolioServiceImpl implements PortfolioService{

	@Autowired
	private PortfolioDAO portfolioDAO;
	
	@Transactional
	@Override
	public List<Portfolio> get() {
		
		return portfolioDAO.findAll();
	}
	@Transactional
	@Override
	public Optional<Portfolio> get(int id) {
		return portfolioDAO.findById(id);
	}
	@Transactional
	@Override
	public Portfolio create(Portfolio portfolio) {
		return portfolioDAO.save(portfolio);
	}
	@Transactional
	@Override
	public void delete(int id) {
		portfolioDAO.deleteById(id);
	}
}
