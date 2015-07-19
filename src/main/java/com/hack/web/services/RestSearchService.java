package com.hack.web.services;

import javax.annotation.Resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hack.model.Build;
import com.hack.services.SearchCriteria;
import com.hack.services.SearchService;

@RestController("/search")
public class RestSearchService {
	@Resource
	private SearchService service;

	@RequestMapping( method= RequestMethod.POST, name = "/builds", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Build[] searchBuilds(@RequestBody(required=true) SearchCriteria<?>[] searchCriteria) {
		return service.search(searchCriteria);
	}
}