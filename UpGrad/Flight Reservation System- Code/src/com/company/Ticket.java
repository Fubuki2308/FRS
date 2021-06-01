package com.company;


import java.time.LocalDateTime;

public abstract class Ticket {
    private String pnr;
    private String from;
    private String to;
    private String departureDT;
    private String arrivalDT;
    private String seatNo;
    private float price;
    private boolean cancelled;
    private Flight flight;
    private Passenger passenger;

    public Ticket(String pnr, String from, String to, String departureDT,
                  String arrivalDT, String seatNo, float price, boolean cancelled,
                  Flight flight, Passenger passenger) {//Constructor for initialising values
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDT = departureDT;
        this.arrivalDT = arrivalDT;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
        this.flight = flight;
        this.passenger = passenger;
    }

    public String checkStatus() {//method to return status of ticket
        return cancelled ? "Cancelled" : "Booked";
    }

    public int getFlightDuration() {//Changing ArrivalDt and DepartureDT to date and time to calculate duration of flight
        LocalDateTime departureLocalDateTime = LocalDateTime.parse(departureDT);
        LocalDateTime arrivalLocalDateTime = LocalDateTime.parse(arrivalDT);
        return (arrivalLocalDateTime.getDayOfMonth() - departureLocalDateTime.getDayOfMonth()) * 24 +
                (arrivalLocalDateTime.getHour() - departureLocalDateTime.getHour());
    }

    public void cancelling() {//Changing ticket satus to cancelled.
        cancelled = true;
    }

    public String getPnr() {//getter for pnr
        return pnr;
    }

    public void setPnr(String pnr) {//setter for pnr
        this.pnr = pnr;
    }

    public String getFrom() {//getter for Origin Location
        return from;
    }

    public void setFrom(String from) {//setter for Origin Location
        this.from = from;
    }

    public String getTo() {//getter for Destination Location
        return to;
    }

    public void setTo(String to) {//setter for Destination Location
        this.to = to;
    }

    public String getDepartureDT() {//getter for Departure date time
        return departureDT;
    }

    public void setDepartureDT(String departureDT) {//setter for Departure date time
        this.departureDT = departureDT;
    }

    public String getArrivalDT() {//getter for Arrival date time
        return arrivalDT;
    }

    public void setArrivalDT(String arrivalDT) {//setter for Arrival date time
        this.arrivalDT = arrivalDT;
    }

    public String getSeatNo() {//getter for seat number
        return seatNo;
    }

    public void setSeatNo(String seatNo) {//setter for seat number
        this.seatNo = seatNo;
    }

    public float getPrice() {//getter for price
        return price;
    }

    public void setPrice(float price) {//Setter for price
        this.price = price;
    }

    public boolean isCancelled() {//Checking the status of ticket
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {//setter for status oof ticket
        this.cancelled = cancelled;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {//returning the Passenger Class reference variable
        return passenger;
    }

    public void setPassenger(Passenger passenger) {//setting the Passenger Class reference variable
        this.passenger = passenger;
    }
}
