package com.company;


public class Flight {
    private String flightNo;
    private String airlineName;
    private int capacity;
    private int bookedSeats;

    public Flight(String flightNo, String airlineName, int capacity, int bookedSeats) {
        this.flightNo = flightNo;
        this.airlineName = airlineName;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }

    public String getFlightNo() {

        return flightNo;
    }

    public void setFlightNo(String flightNo) {

        this.flightNo = flightNo;
    }

    public String getAirlineName() {

        return airlineName;
    }

    public void setAirlineName(String airlineName) {

        this.airlineName = airlineName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public String getFlightDetails() {
        return "Flight No: " + flightNo + "\nAirline Name: " + airlineName +
                "\nCapacity: " + capacity + "\nBooked Seats: " + bookedSeats;
    }

    public boolean checkAvailability() {
        return bookedSeats < capacity;
    }

    public void incrementBookingCount() {
        bookedSeats++;
    }
}
