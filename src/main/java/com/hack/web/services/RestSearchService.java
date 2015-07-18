package com.hack.web.services;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hack.model.Build;
import com.hack.services.SearchCriteria;
import com.hack.services.SearchService;

@RestController
public class RestSearchService {
	@Resource
	private SearchService service;
	
	
@RequestMapping(method= RequestMethod.POST, name="/search")
	public Build[] search(@RequestBody  SearchCriteria<?>[] searchCriteria){
		return (Build[]) service.search(searchCriteria).toArray();
	}
}