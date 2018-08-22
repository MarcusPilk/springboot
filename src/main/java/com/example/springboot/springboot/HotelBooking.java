package com.example.springboot.springboot;

public class HotelBooking {
    private String hotelName;
    private double hotelPrice;
    private int noOfNights;

    public HotelBooking(String hotelName, double hotelPrice, int noOfNights) {
        this.hotelName = hotelName;
        this.hotelPrice = hotelPrice;
        this.noOfNights = noOfNights;
    }

    public HotelBooking(){

    }

    public String getHotelName() {
        return hotelName;
    }

    public double getHotelPrice() {
        return hotelPrice;
    }

    public int getNoOfNights() {
        return noOfNights;
    }

    public double getTotalPrice(){
        return hotelPrice * noOfNights;
    }
}
