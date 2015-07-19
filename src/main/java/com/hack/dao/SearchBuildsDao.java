package com.hack.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.springframework.stereotype.Service;

@Service
public class SearchBuildsDao {
	
	@PersistenceContext(unitName = "hack", type = PersistenceContextType.EXTENDED)
	private EntityManager entityManager;
	
}
