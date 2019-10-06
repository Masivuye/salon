package com.salon.controller.bookingController;

import com.salon.domain.booking.Customer;
import com.salon.repositories.bookingRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/salon/customer" )
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/all")
    public List<Customer> getAll(){
        return customerRepository.findAll();
    }

    @PostMapping(value = "/load")
    public List<Customer> persist(@RequestBody final Customer customer){
        customerRepository.save(customer);
        return customerRepository.findAll();
    }


}
