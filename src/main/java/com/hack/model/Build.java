package com.hack.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BUILD")
public class Build implements Serializable {

	private static final long serialVersionUID = 3299809239698289063L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "BUILD_ID")
	private long id;

	@Column(name = "BUILD_NAME")
	private String buildName;

	@Column(name = "BUILD_DESC")
	private String buildDescription;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private CharacterClass characterClass;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private CharacterRace characterRace;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Faction faction;
	
	@ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name="BUILD_SKILL", 
                joinColumns={@JoinColumn(name="BUILD_ID")}, 
                inverseJoinColumns={@JoinColumn(name="SKILL_ID")})
	private Set<Skill> skills = new HashSet<Skill>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBuildName() {
		return buildName;
	}

	public void setBuildName(String buildName) {
		this.buildName = buildName;
	}

	public String getBuildDescription() {
		return buildDescription;
	}

	public void setBuildDescription(String buildDescription) {
		this.buildDescription = buildDescription;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((buildDescription == null) ? 0 : buildDescription.hashCode());
		result = prime * result + ((buildName == null) ? 0 : buildName.hashCode());
		result = prime * result + ((characterClass == null) ? 0 : characterClass.hashCode());
		result = prime * result + ((characterRace == null) ? 0 : characterRace.hashCode());
		result = prime * result + ((faction == null) ? 0 : faction.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((skills == null) ? 0 : skills.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Build other = (Build) obj;
		if (buildDescription == null) {
			if (other.buildDescription != null)
				return false;
		} else if (!buildDescription.equals(other.buildDescription))
			return false;
		if (buildName == null) {
			if (other.buildName != null)
				return false;
		} else if (!buildName.equals(other.buildName))
			return false;
		if (characterClass == null) {
			if (other.characterClass != null)
				return false;
		} else if (!characterClass.equals(other.characterClass))
			return false;
		if (characterRace == null) {
			if (other.characterRace != null)
				return false;
		} else if (!characterRace.equals(other.characterRace))
			return false;
		if (faction == null) {
			if (other.faction != null)
				return false;
		} else if (!faction.equals(other.faction))
			return false;
		if (id != other.id)
			return false;
		if (skills == null) {
			if (other.skills != null)
				return false;
		} else if (!skills.equals(other.skills))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Build [id=" + id + ", buildName=" + buildName + ", buildDescription=" + buildDescription
				+ ", characterClass=" + characterClass + ", characterRace=" + characterRace + ", faction=" + faction
				+ ", skills=" + skills + "]";
	}

}
