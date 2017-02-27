package com.example.entities;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class HotelUrgencyInfo {
	
	private int airAttachRemainingTime;

	private int numberOfPeopleViewing;
	
	private int numberOfPeopleBooked;
	
	private int numberOfRoomsLeft;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd,HH:00", timezone="CET")
	private Date lastBookedTime;
	
	private String almostSoldStatus;
	
	private String link;
	
	private List<Object> almostSoldOutRoomTypeInfoCollection;
	
	private boolean airAttachEnabled;

	public int getAirAttachRemainingTime() {
		return this.airAttachRemainingTime;
	}

	public void setAirAttachRemainingTime(int airAttachRemainingTime) {
		this.airAttachRemainingTime = airAttachRemainingTime;
	}

	public int getNumberOfPeopleViewing() {
		return this.numberOfPeopleViewing;
	}

	public void setNumberOfPeopleViewing(int numberOfPeopleViewing) {
		this.numberOfPeopleViewing = numberOfPeopleViewing;
	}

	public int getNumberOfPeopleBooked() {
		return this.numberOfPeopleBooked;
	}

	public void setNumberOfPeopleBooked(int numberOfPeopleBooked) {
		this.numberOfPeopleBooked = numberOfPeopleBooked;
	}

	public int getNumberOfRoomsLeft() {
		return this.numberOfRoomsLeft;
	}

	public void setNumberOfRoomsLeft(int numberOfRoomsLeft) {
		this.numberOfRoomsLeft = numberOfRoomsLeft;
	}

	public Date getLastBookedTime() {
		return this.lastBookedTime;
	}

	public void setLastBookedTime(Date lastBookedTime) {
		this.lastBookedTime = lastBookedTime;
	}

	public String getAlmostSoldStatus() {
		return this.almostSoldStatus;
	}

	public void setAlmostSoldStatus(String almostSoldStatus) {
		this.almostSoldStatus = almostSoldStatus;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public List<Object> getAlmostSoldOutRoomTypeInfoCollection() {
		return this.almostSoldOutRoomTypeInfoCollection;
	}

	public void setAlmostSoldOutRoomTypeInfoCollection(List<Object> almostSoldOutRoomTypeInfoCollection) {
		this.almostSoldOutRoomTypeInfoCollection = almostSoldOutRoomTypeInfoCollection;
	}

	public boolean getAirAttachEnabled() {
		return this.airAttachEnabled;
	}

	public void setAirAttachEnabled(boolean airAttachEnabled) {
		this.airAttachEnabled = airAttachEnabled;
	}

	@Override
	public String toString() {
		return "HotelUrgencyInfo [airAttachRemainingTime=" + airAttachRemainingTime + ", numberOfPeopleViewing="
				+ numberOfPeopleViewing + ", numberOfPeopleBooked=" + numberOfPeopleBooked + ", numberOfRoomsLeft="
				+ numberOfRoomsLeft + ", lastBookedTime=" + lastBookedTime + ", almostSoldStatus=" + almostSoldStatus
				+ ", link=" + link + ", almostSoldOutRoomTypeInfoCollection=" + almostSoldOutRoomTypeInfoCollection
				+ ", airAttachEnabled=" + airAttachEnabled + "]";
	}
}