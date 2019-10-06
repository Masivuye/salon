package com.salon.controller.bookingController;



import com.salon.domain.booking.Booking;
import com.salon.repositories.bookingRepository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/salon/booking")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/all")
    public List<Booking> getAll(){
        return bookingRepository.findAll();
    }


    @PostMapping(value = "/load")
    public List<Booking> persist(@RequestBody final Booking booking){
        bookingRepository.save(booking);
        return bookingRepository.findAll();
    }

}
