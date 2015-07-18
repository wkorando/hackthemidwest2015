package com.hack.web.services;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hack.model.CharacterClass;
import com.hack.services.SearchService;

@RestController
public class RestSearchService {
	@Resource
	private SearchService service;
	
	
	@RequestMapping("/search")
	public CharacterClass search(@RequestParam(value="name")  String name){
		return service.search(name);
	}

}
