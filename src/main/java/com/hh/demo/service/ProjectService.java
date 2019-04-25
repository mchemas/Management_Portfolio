package com.hh.demo.service;

import java.util.List;
import java.util.Optional;

import com.hh.demo.model.Project;

public interface ProjectService {

	public List<Project> get();
	public Project get(int id);
	public Project create(Project project);
	public void delete(int id);
}
