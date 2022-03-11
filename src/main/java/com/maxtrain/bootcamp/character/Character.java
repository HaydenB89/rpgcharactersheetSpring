package com.maxtrain.bootcamp.character;

import javax.persistence.*;

import com.maxtrain.bootcamp.classtype.Classtype;
import com.maxtrain.bootcamp.equipment.Equipment;

@Entity
@Table(uniqueConstraints=@UniqueConstraint(name="UIDX_playerTag", columnNames= {"playerTag"}))
public class Character {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(length=30, nullable=false)
	private String name;
	@Column(length=30, nullable=false)
	private String playerTag;
	@Column(length=20, nullable=false)
	private String race;
	@Column(length=12, nullable=false)
	private String gender;
	private boolean active;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="classtypeId")
	private Classtype classtype;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="equipmentId")
	private Equipment equipment;
	
	public Character() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlayerTag() {
		return playerTag;
	}

	public void setPlayerTag(String playerTag) {
		this.playerTag = playerTag;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Classtype getClasstype() {
		return classtype;
	}

	public void setClasstype(Classtype classtype) {
		this.classtype = classtype;
	}
	
	
	

}
