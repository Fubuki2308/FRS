package com.company;

import java.time.LocalDateTime;

class TouristTicket extends Ticket {
    private String hotelAddress;
    private String[] touristLocation;

    public TouristTicket(String pnr, String from, String to, String departureDateTime,
                         String arrivalDateTime, String seatNo, float price, boolean cancelled,
                         Flight flight, Passenger passenger, String hotelAddress,
                         String[] touristLocation) {
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, price, cancelled, flight, passenger);
        this.hotelAddress = hotelAddress;
        this.touristLocation = touristLocation;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getTouristLocation() {
        return touristLocation;
    }

    public void setTouristLocation(String[] selectedTouristLocation) {
        this.touristLocation = selectedTouristLocation;
    }

    public void removeTouristLocation(String location) {
        int index=-1;
        for (int i=0; i<touristLocation.length; i++) {
            if (touristLocation[i].equals(location)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return ;
        }
        for (int i=index; i< touristLocation.length-1; i++) {
            touristLocation[i] = touristLocation[i+1];
        }
        touristLocation[touristLocation.length-1] = null;
    }

    public void addTouristLocation(String location) {
        int index = -1;
        for (int i=0; i< touristLocation.length; i++) {
            if (touristLocation[i] == null) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            touristLocation[index] = location;
        }
    }
}
