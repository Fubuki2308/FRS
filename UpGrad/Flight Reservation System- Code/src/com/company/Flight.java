package com.company;


public class Flight {
    private String flightNo;
    private String airlineName;
    private int capacity;
    private int bookedSeats;

    public Flight(String flightNo, String airlineName, int capacity, int bookedSeats) {//Flight constructor for initializing values
        this.flightNo = flightNo;
        this.airlineName = airlineName;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }

    public String getFlightNo() {//getter for flight number

        return flightNo;
    }

    public void setFlightNo(String flightNo) {//setter for flight number

        this.flightNo = flightNo;
    }

    public String getAirlineName() {//getter for flight name

        return airlineName;
    }

    public void setAirlineName(String airlineName) {//setter for flight name

        this.airlineName = airlineName;
    }

    public int getCapacity() {//getter for capacity
        return capacity;
    }

    public void setCapacity(int capacity) {//setter for capacity
        this.capacity = capacity;
    }

    public int getBookedSeats() {//getter for number of booked tickets
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {//setter for number of booked tickets
        this.bookedSeats = bookedSeats;
    }

    public String getFlightDetails() {//Flight details method
        return "Flight No: " + flightNo + "\nAirline Name: " + airlineName +
                "\nCapacity: " + capacity + "\nBooked Seats: " + bookedSeats;
    }

    public boolean checkAvailability() {//checking whether booked seats is less than capacity for not overbooking
        return bookedSeats < capacity;
    }

    public void incrementBookingCount() {//Incrementing booked seats
        bookedSeats++;
    }
}
