package com.hack.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class CharacterRace {

	@Column
	private long id;
	@Column
	private String raceName;
	@Column
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
