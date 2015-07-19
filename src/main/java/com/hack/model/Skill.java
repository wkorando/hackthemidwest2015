package com.hack.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SKILL")
public class Skill implements Serializable {

	private static final long serialVersionUID = 6153442601960426108L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SKILL_ID")
	private long id;
	
	@Column(name = "SKILL_NAME")
	private String skillName;
	
	@Lob
	@Column(name = "SKILL_DESC")
	private String skillDescription;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "SKILL_TYPE")
	private SkillType skillType;
	
	@ManyToMany(mappedBy="skills")
	private Set<Build> builds = new HashSet<Build>();
	
	@ManyToOne
    @JoinColumn(name="SKILL_LINE_ID")
    private SkillLine skillLine;

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

	public Set<Build> getBuilds() {
		return builds;
	}

	public void setBuilds(Set<Build> builds) {
		this.builds = builds;
	}

	public SkillLine getSkillLine() {
		return skillLine;
	}

	public void setSkillLine(SkillLine skillLine) {
		this.skillLine = skillLine;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((builds == null) ? 0 : builds.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((skillDescription == null) ? 0 : skillDescription.hashCode());
		result = prime * result + ((skillLine == null) ? 0 : skillLine.hashCode());
		result = prime * result + ((skillName == null) ? 0 : skillName.hashCode());
		result = prime * result + ((skillType == null) ? 0 : skillType.hashCode());
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
		if (builds == null) {
			if (other.builds != null)
				return false;
		} else if (!builds.equals(other.builds))
			return false;
		if (id != other.id)
			return false;
		if (skillDescription == null) {
			if (other.skillDescription != null)
				return false;
		} else if (!skillDescription.equals(other.skillDescription))
			return false;
		if (skillLine == null) {
			if (other.skillLine != null)
				return false;
		} else if (!skillLine.equals(other.skillLine))
			return false;
		if (skillName == null) {
			if (other.skillName != null)
				return false;
		} else if (!skillName.equals(other.skillName))
			return false;
		if (skillType != other.skillType)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Skill [id=" + id + ", skillName=" + skillName + ", skillDescription=" + skillDescription
				+ ", skillType=" + skillType + ", builds=" + builds + ", skillLine=" + skillLine + "]";
	}

}
