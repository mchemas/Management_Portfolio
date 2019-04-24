package com.hh.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hh.demo.dao.ProjectDAO;
import com.hh.demo.model.Project;

@Service
public class ProjectServiceImpl implements ProjectService{

	@Autowired
	private ProjectDAO projectDAO;
	
	@Transactional
	@Override
	public List<Project> get() {
		return projectDAO.findAll();
	}
	
	@Transactional
	@Override
	public Optional<Project> get(int id) {
		return projectDAO.findById(id);
	}
	
	@Transactional
	@Override
	public Project create(Project project) {
		return projectDAO.save(project);
	}
	
	@Transactional
	@Override
	public void delete(int id) {
		projectDAO.deleteById(id);
	}
}
