package com.flyaway.model;

public class Flights {

	private int flightId;
	private String airlineName;
	private String source;
	private String destination;
	private String departureTime;
	private String departureDate;
	private String arrivalTime;
	private double fare;
	private int availableSeat;
	
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public int getAvailableSeat() {
		return availableSeat;
	}
	public void setAvailableSeat(int availableSeat) {
		this.availableSeat = availableSeat;
	}
	public Flights(int flightId, String airlineName, String source, String departureTime, String departureDate,
			String destination, String arrivalTime, double fare, int availableSeat) {
		super();
		this.flightId = flightId;
		this.airlineName = airlineName;
		this.source = source;
		this.departureTime = departureTime;
		this.departureDate = departureDate;
		this.destination = destination;
		this.arrivalTime = arrivalTime;
		this.fare = fare;
		this.availableSeat = availableSeat;
	}
	@Override
	public String toString() {
		return "Flights [flightId=" + flightId + ", airlineName=" + airlineName + ", source=" + source
				+ ", departureTime=" + departureTime + ", departureDate=" + departureDate + ", destination="
				+ destination + ", arrivalTime=" + arrivalTime + ", fare=" + fare + ", availableSeat=" + availableSeat
				+ "]";
	}

}
