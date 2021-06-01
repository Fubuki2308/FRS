package com.company;

import java.time.LocalDateTime;

class TouristTicket extends Ticket {
    private String hotelAddress;
    private String[] touristLocation;

    //Constructor to call Ticket Class constructor by using super and initialising values
    public TouristTicket(String pnr, String from, String to, String departureDateTime,
                         String arrivalDateTime, String seatNo, float price, boolean cancelled,
                         Flight flight, Passenger passenger, String hotelAddress,
                         String[] touristLocation) {
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, price, cancelled, flight, passenger);
        this.hotelAddress = hotelAddress;
        this.touristLocation = touristLocation;
    }

    public String getHotelAddress() {//getter for hotel address
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {//setter for hotel address
        this.hotelAddress = hotelAddress;
    }

    public String[] getTouristLocation() {//getter for Tourist Location
        return touristLocation;
    }

    public void setTouristLocation(String[] selectedTouristLocation) {//setter for Tourist Location
        this.touristLocation = selectedTouristLocation;
    }

    public void removeTouristLocation(String location) {//method for removing any tourist location
        int index=-1;
        for (int i=0; i<touristLocation.length; i++) {
            if (touristLocation[i].equals(location)) {
                index = i;
                break;
            }
        }
        if (index == -1) {//incase no tourist location are there
            return ;
        }
        for (int i=index; i< touristLocation.length-1; i++) {//adjusting the array for Tourist Location
            touristLocation[i] = touristLocation[i+1];
        }
        touristLocation[touristLocation.length-1] = null;
    }

    public void addTouristLocation(String location) {//method for adding tourist location
        int index = -1;
        for (int i=0; i< touristLocation.length; i++) {//incase max location are already there
            if (touristLocation[i] == null) {
                index = i;
                break;
            }
        }
        if (index != -1) {//adding the location to array
            touristLocation[index] = location;
        }
    }
}
