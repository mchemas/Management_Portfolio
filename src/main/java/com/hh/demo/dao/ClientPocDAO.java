package com.hh.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hh.demo.model.ClientPOC;

public interface ClientPocDAO extends JpaRepository<ClientPOC, Integer>{

}
