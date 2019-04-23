package com.hh.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hh.demo.model.Consultant;

public interface ConsultantDAO extends JpaRepository<Consultant, Integer>{

}
