package com.springrest.springrest.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//import javax.persistence.Entity;
//import javax.persistence.Id;


@Entity
public class Truck {
	@Id
	private long id;
	private String title;
	private String description;
	
	public Truck(long id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}
	
	
	
	
	
	public Truck() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Truck [id=" + id + ", title=" + title + ", description=" + description + "]";
	}

}
