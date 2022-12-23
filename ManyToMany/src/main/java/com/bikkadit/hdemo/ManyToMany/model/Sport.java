package com.bikkadit.hdemo.ManyToMany.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
@Entity
public class Sport {
	@Id
	private int Sid;
	private String SportName;
	
	@ManyToMany(mappedBy = "sport")
	private List<Player> player;
	
	
	@Override
	public String toString() {
		return "Sport [Sid=" + Sid + ", SportName=" + SportName + ", player=" + player + "]";
	}
	
	
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSportName() {
		return SportName;
	}
	public void setSportName(String sportName) {
		SportName = sportName;
	}


	public List<Player> getPlayer() {
		return player;
	}


	public void setPlayer(List<Player> player) {
		this.player = player;
	}
	

}
