package com.hack.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.springframework.stereotype.Service;

import com.hack.model.Build;

@Service
public class SearchBuildsDao {

	@PersistenceContext(unitName = "hack", type = PersistenceContextType.EXTENDED)
	private EntityManager entityManager;

	public Build[] findBuilds() {
		List<Build> builds = entityManager.createQuery("from SKILL")
				.getResultList();
		return builds.toArray(new Build[]{});
	}

}
