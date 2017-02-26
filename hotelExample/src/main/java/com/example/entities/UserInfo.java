package com.example.entities;

public class UserInfo {
	
	private Persona persona;

	private String userId;

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "UserInfo [persona=" + persona + ", userId=" + userId + "]";
	}
}
