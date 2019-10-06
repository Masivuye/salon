package com.salon.controller.staffController;

import com.salon.domain.staff.Cleaners;
import com.salon.repositories.staffRepository.CleanersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/salon/cleaners")
public class CleanersController {

    @Autowired
    CleanersRepository cleanersRepository;

    @GetMapping(value = "/all")
    public List<Cleaners> getAll(){
        return cleanersRepository.findAll();
    }
    @PostMapping(value = "/load")
    public List<Cleaners> persist(@RequestBody final Cleaners cleaners)
    {
        cleanersRepository.save(cleaners);
        return cleanersRepository.findAll();
    }
}
