package com.hack.dao;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Service;

@Service
public class SearchBuildsDao {
	private EntityManager entityManager = EntityManagerUtil.getEntityManager();
	
}
