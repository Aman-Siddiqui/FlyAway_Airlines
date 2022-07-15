package com.flyaway.model;

public class Search {

	String source;
	String destination;
	String journeyDate;
	String numberOfSeats;
	
	public Search() {
		
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(String journeyDate) {
		this.journeyDate = journeyDate;
	}

	public String getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(String numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public Search(String source, String destination, String journeyDate, String numberOfSeats) {
		super();
		this.source = source;
		this.destination = destination;
		this.journeyDate = journeyDate;
		this.numberOfSeats = numberOfSeats;
	}
	
	
}
