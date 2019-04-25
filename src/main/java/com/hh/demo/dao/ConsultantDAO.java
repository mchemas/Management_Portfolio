package com.hh.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hh.demo.model.Consultant;

public interface ConsultantDAO extends JpaRepository<Consultant, Integer>{

	@Query(value = "SELECT * FROM consultant c WHERE c.id NOT IN (SELECT consultants_id FROM project_consultants)",
            nativeQuery=true
    )
    public List<Consultant> getUnassignedConsultants();
}
