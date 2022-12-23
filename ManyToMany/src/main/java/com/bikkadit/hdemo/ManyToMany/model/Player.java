package com.bikkadit.hdemo.ManyToMany.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="Team")
public class Player {
	@Id
	private int id;
	@Column(name="Player_name")
	private String name;
	
	@ManyToMany
	@JoinTable(name="MappingTable",
	joinColumns = {@JoinColumn(name="P_ID")},
	inverseJoinColumns = {@JoinColumn(name="S_ID")} )
	private List<Sport> sport;
	
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
	
	public List<Sport> getSport() {
		return sport;
	}
	public void setSport(List<Sport> sport) {
		this.sport = sport;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", sport=" + sport + "]";
	}
}
