package com.hh.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hh.demo.model.Project;

public interface ProjectDAO extends JpaRepository<Project, Integer>{

}
