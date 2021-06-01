package com.company;

import java.time.LocalDateTime;

 class RegularTicket extends Ticket {
    private String specialServices;

     //Constructor to call Ticket Class constructor by using super and initialising values
    public RegularTicket(String pnr, String from, String to, String departureDateTime,
                         String arrivalDateTime, String seatNo, float price, boolean cancelled,
                         Flight flight, Passenger passenger, String specialServices) {
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, price, cancelled,
                flight, passenger);
        this.specialServices = specialServices;
    }

    public String getSpecialServices() {//getter for Special Services

        return specialServices;
    }

    public void setSpecialServices(String specialServices) {//setter for Special Services

        this.specialServices = specialServices;
    }
}

