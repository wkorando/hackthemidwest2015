package com.hack.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SKILL_TYPE")
public class SkillType implements Serializable {

	private static final long serialVersionUID = 4062307757607996774L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SKILL_TYPE_ID")
	private long id;
	
	@Column(name = "SKILL_TYPE_NAME")
	private String skillTypeName;
	
	@Column(name = "SKILL_TYPE_DESC")
	private String skillTypeDescription;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSkillTypeName() {
		return skillTypeName;
	}
	public void setSkillTypeName(String skillTypeName) {
		this.skillTypeName = skillTypeName;
	}
	public String getSkillTypeDescription() {
		return skillTypeDescription;
	}
	public void setSkillTypeDescription(String skillTypeDescription) {
		this.skillTypeDescription = skillTypeDescription;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime
				* result
				+ ((skillTypeDescription == null) ? 0 : skillTypeDescription
						.hashCode());
		result = prime * result
				+ ((skillTypeName == null) ? 0 : skillTypeName.hashCode());
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
		SkillType other = (SkillType) obj;
		if (id != other.id)
			return false;
		if (skillTypeDescription == null) {
			if (other.skillTypeDescription != null)
				return false;
		} else if (!skillTypeDescription.equals(other.skillTypeDescription))
			return false;
		if (skillTypeName == null) {
			if (other.skillTypeName != null)
				return false;
		} else if (!skillTypeName.equals(other.skillTypeName))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "SkillType [id=" + id + ", skillTypeName=" + skillTypeName
				+ ", skillTypeDescription=" + skillTypeDescription + "]";
	}
}