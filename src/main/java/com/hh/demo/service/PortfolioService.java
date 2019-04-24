package com.hh.demo.service;

import java.util.List;
import java.util.Optional;

import com.hh.demo.model.Portfolio;

public interface PortfolioService {

	public List<Portfolio> get();
	public Optional<Portfolio> get(int id);
	public Portfolio create(Portfolio portfolio);
	public void delete(int id);
	
}
