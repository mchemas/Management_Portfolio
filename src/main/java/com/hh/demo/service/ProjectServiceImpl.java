package com.hh.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hh.demo.dao.ProjectDAO;
import com.hh.demo.model.Project;

@Service
public class ProjectServiceImpl {

	@Autowired
	private ProjectDAO projectDAO;
	
	@Transactional
	public List<Project> get() {
		
		return projectDAO.findAll();
	}
	@Transactional
	public Optional<Project> get(int id) {
		return projectDAO.findById(id);
	}
	@Transactional
	public void create(Project project) {
		projectDAO.save(project);
	}
	@Transactional
	public void delete(Project project) {
		projectDAO.delete(project);
	}
}
