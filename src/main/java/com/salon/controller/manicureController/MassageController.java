package com.salon.controller.manicureController;

import com.salon.domain.manicure.Massage;
import com.salon.repositories.manicureRepository.MassageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/salon/massage")
public class MassageController {
    @Autowired
    MassageRepository massageRepository;

    @GetMapping(value = "/all")
    public List<Massage> getAll(){
         return massageRepository.findAll();
    }
    @PostMapping(value = "/load")
    public List<Massage> persist(@RequestBody final Massage massage){
        massageRepository.save(massage);
        return massageRepository.findAll();
    }
}
