package com.hack.web.services;

import javax.persistence.EntityManager;

import com.hack.EntityManagerUtil;
import com.hack.model.CharacterClass;
import com.hack.model.CharacterRace;
import com.hack.model.Faction;
import com.hack.model.Skill;

public class DataLoadServices {

	private EntityManager entityManager = EntityManagerUtil.getEntityManager();

	public void init() {
		loadCharacterClassData();
		loadCharacterRaceData();
		loadFactionData();
		loadSkillData();
	}

	private void loadCharacterClassData() {
		CharacterClass dragonKnight = new CharacterClass();
		dragonKnight.setClassName("Dragon Knight");
		dragonKnight.setClassDescription("The powerful Dragon Knight wields the power of fire to dish out serious amounts of damage");
		entityManager.merge(dragonKnight);
		
		CharacterClass sorcerer = new CharacterClass();
		sorcerer.setClassName("Sorcerer");
		sorcerer.setClassDescription("These long range damage dealers have multiple skill trees that allow them to dish out powerful spells.");
		entityManager.merge(sorcerer);
		
		CharacterClass templar = new CharacterClass();
		templar.setClassName("Templar");
		templar.setClassDescription("The Templar is one of the most diverse classes in the game. Each skill tree allows you to do something different, ranging from tanking to crowd control effects to healing.");
		entityManager.merge(templar);
		
		CharacterClass nightblade = new CharacterClass();
		nightblade.setClassName("Nightblade");
		nightblade.setClassDescription("The most dedicated DPS class in the game, the Nightblade allows players to deal large amounts of damage, while being heavily focused on stealth. ");
		entityManager.merge(nightblade);
	}

	private void loadCharacterRaceData() {
		CharacterRace altmer = new CharacterRace();
		altmer.setRaceName("Altmer");
		altmer.setRaceDescription("Altmer's are the most magically proficient race in Tamriel.");
		entityManager.merge(altmer);
		
		CharacterRace argonian = new CharacterRace();
		argonian.setRaceName("Argonian");
		argonian.setRaceDescription("Argonian's are known for high intelligence, breathing under water indefinitely and having natural resistances to disease.");
		entityManager.merge(argonian);
		
		CharacterRace bosmer = new CharacterRace();
		bosmer.setRaceName("Bosmer");
		bosmer.setRaceDescription("Bosmer's are known for being the best archers on the continent.");
		entityManager.merge(bosmer);
		
		CharacterRace breton = new CharacterRace();
		breton.setRaceName("Breton");
		breton.setRaceDescription("Breton's quick grasp of magic makes them good spellcasters, healers and magic-based characters.");
		entityManager.merge(breton);
		
		CharacterRace dunmer = new CharacterRace();
		dunmer.setRaceName("Dunmer");
		dunmer.setRaceDescription("Dunmer's are known to be extremely strong, intelligent, and very quick.");
		entityManager.merge(dunmer);
		
		CharacterRace imperial = new CharacterRace();
		imperial.setRaceName("Imperial");
		imperial.setRaceDescription("Imperial's can be a member of any faction, and their abilities are currently unknown.");
		entityManager.merge(imperial);
		
		CharacterRace khajiit = new CharacterRace();
		khajiit.setRaceName("Khajiit");
		khajiit.setRaceDescription("Khajiit's make excellent thieves due to their natural stealthiness but are also known to be outstanding warriors.");
		entityManager.merge(khajiit);
		
		CharacterRace nord = new CharacterRace();
		nord.setRaceName("Nord");
		nord.setRaceDescription("Nord's are the physically strongest race, towering above all but the altmer.");
		entityManager.merge(nord);
		
		CharacterRace orc = new CharacterRace();
		orc.setRaceName("Orc");
		orc.setRaceDescription("Orc's make perfect tanks. The orcs are tall and powerful. Only nords are larger.");
		entityManager.merge(orc);
		
		CharacterRace redguard = new CharacterRace();
		redguard.setRaceName("Redguard");
		redguard.setRaceDescription("Redguard's knowledge of all weapon and armor types, makes many Redguards great warriors or rogue (thief) characters.");
		entityManager.merge(redguard);

	}

	private void loadFactionData() {
		Faction ebonheartPact = new Faction();
		ebonheartPact.setFactionName("Ebonheart Pact");
		entityManager.merge(ebonheartPact);
		
		Faction aldmeriDominion = new Faction();
		aldmeriDominion.setFactionName("Aldmeri Dominion");
		entityManager.merge(aldmeriDominion);
		
		Faction daggerfallCovenant = new Faction();
		daggerfallCovenant.setFactionName("Daggerfall Covenant");
		entityManager.merge(daggerfallCovenant);
	}

	private void loadSkillData() {
		Skill fieryGrip = new Skill();
		fieryGrip.setSkillName("Fiery Grip");
		fieryGrip.setSkillDescription("Pull enemy towards you and deal 11 Fire Damage.");
		entityManager.merge(fieryGrip);
		
		Skill searingStrike = new Skill();
		searingStrike.setSkillName("Searing Strike");
		searingStrike.setSkillDescription("Deals 11 Flame Damage, and deals 15 Flame Damage over 8.5 seconds. Unlocks at Ardent Flame rank 4.");
		entityManager.merge(searingStrike);
		
		Skill fieryBreath = new Skill();
		fieryBreath.setSkillName("Fiery Breath");
		fieryBreath.setSkillDescription("Deals 5 Flame Damage in a cone in front of the player and ignites enemy for 12 Flame Damage over 8 seconds. Unlocks at Ardent Flame rank 20.");
		entityManager.merge(fieryBreath);
	}
}
