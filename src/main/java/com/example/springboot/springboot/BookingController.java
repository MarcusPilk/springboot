package com.example.springboot.springboot;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping (value = "/bookings")
public class BookingController {
    private List<HotelBooking> bookingList;

    public BookingController() {
        bookingList = new ArrayList<>();

        bookingList.add(new HotelBooking("Marriot",200,3));
        bookingList.add(new HotelBooking("Ibis",90,4));
        bookingList.add(new HotelBooking("Novotel",140,1));
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<HotelBooking> getAll(){
        return bookingList;
    }

    @RequestMapping(value = "/aff/{price}", method = RequestMethod.GET)
    public List<HotelBooking> getAffordable(@PathVariable double price){
        return bookingList.stream().filter(x -> x.getHotelPrice() <= price)
                .collect(Collectors.toList());
    }

    @RequestMapping (value = "/new",method = RequestMethod.POST)
    public List<HotelBooking> newBooking(@RequestBody HotelBooking hotelBooking){
        bookingList.add(hotelBooking);

        return bookingList;
    }

}
