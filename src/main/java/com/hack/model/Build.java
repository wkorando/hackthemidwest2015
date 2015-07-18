package com.hack.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BUILD")
public class Build implements Serializable{


	private static final long serialVersionUID = 3299809239698289063L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "BUILD_ID")
	private long id;
	
	@Column(name = "BUILD_NAME")
	private String buildName;
	
	@Column(name = "BUILD_DESC")
	private String buildDescription;
	
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
		result = prime
				* result
				+ ((buildDescription == null) ? 0 : buildDescription.hashCode());
		result = prime * result
				+ ((buildName == null) ? 0 : buildName.hashCode());
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
		if (id != other.id)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Build [id=" + id + ", buildName=" + buildName
				+ ", buildDescription=" + buildDescription + "]";
	}
}
