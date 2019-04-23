package com.hh.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hh.demo.model.Portfolio;

public interface PortfolioDAO extends JpaRepository<Portfolio, Integer>{

}
