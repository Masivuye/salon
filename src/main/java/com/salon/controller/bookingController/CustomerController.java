package com.salon.controller.bookingController;

import com.salon.domain.booking.Customer;
import com.salon.repositories.bookingRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/salon/customer" )
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/")
    public String showPage(Model model,@RequestParam(defaultValue = "0")int page){
        model.addAttribute("data",customerRepository.findAll(new PageRequest(page,4)));
        model.addAttribute("currentPage",page);
        return "index";

    }

    @PostMapping(value = "/save")
    public List<Customer> persist(@RequestBody final Customer customer){
        customerRepository.save(customer);
        return customerRepository.findAll();
    }
    @GetMapping(value = "/delete")
    public String deleteCustomer(Integer id){
        customerRepository.deleteById(id);
        return "redirect:/";
    }


}
