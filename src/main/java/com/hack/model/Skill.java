package com.hack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SKILL")
public class Skill {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SKILL_ID")
	private long id;
	
	@Column(name = "SKILL_NAME")
	private String skillName;
	
	@Column(name = "SKILL_DESC")
	private String skillDescription;
	
	@Column(name = "SKILL_TYPE")
	private SkillType skillType;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public String getSkillDescription() {
		return skillDescription;
	}

	public void setSkillDescription(String skillDescription) {
		this.skillDescription = skillDescription;
	}

	public SkillType getSkillType() {
		return skillType;
	}

	public void setSkillType(SkillType skillType) {
		this.skillType = skillType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime
				* result
				+ ((skillDescription == null) ? 0 : skillDescription.hashCode());
		result = prime * result
				+ ((skillName == null) ? 0 : skillName.hashCode());
		result = prime * result
				+ ((skillType == null) ? 0 : skillType.hashCode());
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
		Skill other = (Skill) obj;
		if (id != other.id)
			return false;
		if (skillDescription == null) {
			if (other.skillDescription != null)
				return false;
		} else if (!skillDescription.equals(other.skillDescription))
			return false;
		if (skillName == null) {
			if (other.skillName != null)
				return false;
		} else if (!skillName.equals(other.skillName))
			return false;
		if (skillType == null) {
			if (other.skillType != null)
				return false;
		} else if (!skillType.equals(other.skillType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Skill [id=" + id + ", skillName=" + skillName
				+ ", skillDescription=" + skillDescription + ", skillType="
				+ skillType.toString() + "]";
	}
}
