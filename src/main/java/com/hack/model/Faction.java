package com.hack.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FACTION")
public class Faction implements Serializable {

	private static final long serialVersionUID = 4565167870138805056L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "FACTION_ID")
	private long id;
	
	@Column(name = "FACTION_NAME")
	private String factionName;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFactionName() {
		return factionName;
	}

	public void setFactionName(String factionName) {
		this.factionName = factionName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((factionName == null) ? 0 : factionName.hashCode());
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
		Faction other = (Faction) obj;
		if (factionName == null) {
			if (other.factionName != null)
				return false;
		} else if (!factionName.equals(other.factionName))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Faction [id=" + id + ", factionName=" + factionName + "]";
	} 

}
