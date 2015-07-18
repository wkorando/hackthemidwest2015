package com.hack.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class SkillType {

	@Column
	private long id;
	@Column
	private String skillTypeName;
	@Column
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