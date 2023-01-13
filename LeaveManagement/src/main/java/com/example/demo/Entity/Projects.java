package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Projects {

	@Id
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Projects(String id) {
		super();
		this.id = id;
	}

	public Projects() {
		super();

	}

	@Override
	public String toString() {
		return "Projects [id=" + id + "]";
	}
	
	
    
}
