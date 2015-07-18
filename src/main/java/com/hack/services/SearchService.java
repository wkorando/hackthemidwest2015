package com.hack.services;

import org.springframework.stereotype.Service;

import com.hack.model.CharacterClass;

@Service
public class SearchService {

	public CharacterClass search(String name){
		CharacterClass characterClass = new CharacterClass();
		characterClass.setClassDescription("Healer/Tank");
		characterClass.setClassName(name);
		characterClass.setId(1L);
		return characterClass;
	}
}
