package com.hh.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hh.demo.dao.ClientPocDAO;
import com.hh.demo.dao.ConsultantDAO;
import com.hh.demo.model.ClientPOC;
import com.hh.demo.model.Consultant;

@SpringBootApplication
public class ManagementPortfolioApplication implements CommandLineRunner{

	@Autowired
	private ConsultantDAO consultantDAO;
	@Autowired
	private ClientPocDAO pocDAO;
	
	public static void main(String[] args) {
		SpringApplication.run(ManagementPortfolioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		consultantDAO.save(new Consultant("Mike", "Engineer", 2));
		consultantDAO.save(new Consultant("Derek", "Engineer", 3));
		consultantDAO.save(new Consultant("Honda", "Engineer", 1));
		pocDAO.save(new ClientPOC("Hasib", "Hasib@aol.com"));
		pocDAO.save(new ClientPOC("Chang", "Chang@aol.com"));
	}

}
