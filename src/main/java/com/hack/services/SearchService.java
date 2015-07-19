package com.hack.services;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hack.dao.SearchBuildsDao;
import com.hack.model.Build;

@Service
public class SearchService {

	@Resource
	private SearchBuildsDao searchBuildsDao;

	public SearchService() {
	}

	public SearchService(SearchBuildsDao searchBuildsDao) {
		this.searchBuildsDao = searchBuildsDao;
	}

	public Build[] search(SearchCriteria<?>[] searchCriteria) {
		return searchBuildsDao.findBuilds();
	}
}
