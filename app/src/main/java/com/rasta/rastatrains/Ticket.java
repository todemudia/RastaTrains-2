package com.rasta.rastatrains;

/**
 * Created by triumph on 2017-05-02.
 */

public class Ticket {


    /* Decalaring the fields for the custom ListView Routes */
    /* location */
    private String location;
    private String ticketType;
    private String destination;

    //price of ticket
    private String price = "40£";

    //Time and date
    private String departureTime = "16:00";
    private String arrivalTime = "17:00";
    private String depDayName = "";
    private String depMonth = " ";
    private String arrDayName = "";
    private String arrMonth = "";
    private String depMonthNo = "";
    private String depDayNo = "17";
    private String arrMonthNo = "";
    private String arrDayNo = "17";



    public Ticket(String location, String destination, String arrDayName, String arrMonth, String depDayName, String depMonth){

        this.location = location;
        this.destination = destination;
        this.depDayName = depDayName;
        this.depMonth = depMonth;
        this.arrDayName = arrDayName;
        this.arrMonth = arrMonth;
    }



    public String getPrice(){
        return price;
    }

    public String getLocation(){
        return location;
    }

    public String getDestination(){
        return destination;
    }

    public String getArrDayName(){
        return arrDayName;
    }

    public String getArrMonth(){
        return arrMonth;
    }

    public String getDepDayName(){
        return depDayName;
    }

    public String getDepMonth(){
        return depMonth;
    }

    public String getArrDayNo(){
        return arrDayNo;
    }

    public String getArrMonthNo(){
        return arrMonthNo;
    }

    public String getArrivalTime(){
        return arrivalTime;
    }

    public String getDepartureTime(){
        return departureTime;
    }



}
