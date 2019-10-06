package com.salon.controller.manicureController;

import com.salon.domain.manicure.Manicure;
import com.salon.repositories.manicureRepository.ManicureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/salon/manicure")
public class ManicureController {
    @Autowired
    ManicureRepository manicureRepository;

    @GetMapping(value = "/all")
    public List<Manicure> getAll(){
        return manicureRepository.findAll();
    }
    @PostMapping(value = "/load")
    public List<Manicure> persist(@RequestBody final Manicure manicure){
        manicureRepository.save(manicure);
        return manicureRepository.findAll();
    }
}
