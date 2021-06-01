package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Default data for Tourist Ticket
        //IMP:- Date Time Should be in YYYY-MM-DD"T"HH:MM:SS Format when input in String to avoid error in code.
        String[] Location={"Maitri Bagh","Ghanta Ghar"};
        TouristTicket touristT= new TouristTicket("123456","Bhilai","Raipur",
                "2021-06-01T17:09:42",
                "2021-06-02T17:09:42",
                "1",123.45f,false,null,null,"Chaya Garden",
                Location);
        //IMP:- Date Time Should be in YYYY-MM-DD"T"HH:MM:SS Format when input in String to avoid error in code.




        //Default data for Regular Ticket
        //IMP:- Date Time Should be in YYYY-MM-DD"T"HH:MM:SS Format when input in String to avoid error in code.
        String special_Service="Kindly provide me with Hot water in every 1 hr interval";
        RegularTicket regularT = new RegularTicket("7890","Raipur","Bhilai",
                "2021-06-03T17:09:42",
                "2021-06-04T17:09:42",
                "1",678.90f,false,null,null,special_Service);
        //IMP:- Date Time Should be in YYYY-MM-DD"T"HH:MM:SS Format when input in String to avoid error in code.

        printTicketDetails(touristT);//passing Tourist Ticket Reference variable
        printTicketDetails(regularT);//passing Regular Ticket Reference variable
    }

    public static void printTicketDetails(Ticket ticket) {

        System.out.println(ticket.getPnr());//Printing the pnr
    }
}



