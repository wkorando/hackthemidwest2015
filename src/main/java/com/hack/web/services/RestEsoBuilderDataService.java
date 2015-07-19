package com.hack.web.services;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/esoBuilderData")
public class RestEsoBuilderDataService {

	@RequestMapping( method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String[] searchBuilds(@RequestParam(value="type") String type) {
		String[] types = new String[] {type};
		return types;
	}
}
