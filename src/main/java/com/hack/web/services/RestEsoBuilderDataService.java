package com.hack.web.services;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/esoBuilderData")
public class RestEsoBuilderDataService {
	@PersistenceContext(unitName = "hack", type = PersistenceContextType.EXTENDED)
	private EntityManager entityManager;

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String[] searchBuilds(@RequestParam(value = "type") String type,
			@RequestParam(value = "name") String name) {
		test();
		List<String> fieldNames = entityManager.createQuery(
				"select " + name + " from " + type).getResultList();

		return fieldNames.toArray(new String[] {});
	}
	
	public void test(){
		System.out.println(Arrays.toString(entityManager.createQuery(
				" from FACTION").getResultList().toArray()));
	}
}
