package com.hack.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CHARACTER_RACE")
public class CharacterRace implements Serializable {

	private static final long serialVersionUID = -507402258582531365L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CHARACTER_RACE_ID")
	private long id;
	
	@Column(name = "RACE_NAME")
	private String raceName;
	
	@Column(name = "RACE_DESC")
	private String raceDescription;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRaceName() {
		return raceName;
	}

	public void setRaceName(String raceName) {
		this.raceName = raceName;
	}

	public String getRaceDescription() {
		return raceDescription;
	}

	public void setRaceDescription(String raceDescription) {
		this.raceDescription = raceDescription;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result
				+ ((raceDescription == null) ? 0 : raceDescription.hashCode());
		result = prime * result
				+ ((raceName == null) ? 0 : raceName.hashCode());
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
		CharacterRace other = (CharacterRace) obj;
		if (id != other.id)
			return false;
		if (raceDescription == null) {
			if (other.raceDescription != null)
				return false;
		} else if (!raceDescription.equals(other.raceDescription))
			return false;
		if (raceName == null) {
			if (other.raceName != null)
				return false;
		} else if (!raceName.equals(other.raceName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CharacterRace [id=" + id + ", raceName=" + raceName
				+ ", raceDescription=" + raceDescription + "]";
	}
}
