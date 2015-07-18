package com.hack.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class CharacterClass {

	@Column
	private long id;
	@Column
	private String className;
	@Column
	private String classDescription;

	public String getClassDescription() {
		return classDescription;
	}

	public void setClassDescription(String classDescription) {
		this.classDescription = classDescription;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public String toString() {
		return "CharacterClass [id=" + id + ", className=" + className
				+ ", classDescription=" + classDescription + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((classDescription == null) ? 0 : classDescription.hashCode());
		result = prime * result
				+ ((className == null) ? 0 : className.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
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
		CharacterClass other = (CharacterClass) obj;
		if (classDescription == null) {
			if (other.classDescription != null)
				return false;
		} else if (!classDescription.equals(other.classDescription))
			return false;
		if (className == null) {
			if (other.className != null)
				return false;
		} else if (!className.equals(other.className))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
}