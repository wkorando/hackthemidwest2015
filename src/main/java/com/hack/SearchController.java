package com.hack;

import javax.annotation.Resource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hack.services.SearchService;

@Controller
@EnableAutoConfiguration
public class SearchController {

	@Resource
	private SearchService searchService;

	public SearchController() {
		super();
	}

	public SearchController(SearchService searchService) {
		super();
		this.searchService = searchService;
	}

	@RequestMapping("/search")
	@ResponseBody
	public String searchResults() {
		return searchService.search();
	}
}
