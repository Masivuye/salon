package com.salon.controller.manicureController;

import com.salon.domain.manicure.Nails;
import com.salon.repositories.manicureRepository.NailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/salon/nails")
public class NailsController {

    @Autowired
    NailsRepository nailsRepository;
    @GetMapping(value = "/all")
    public List<Nails> getAll()
    {
        return nailsRepository.findAll();
    }
    @PostMapping(value ="/load")
    public List<Nails> persist(@RequestBody final Nails nails)
    {
        nailsRepository.save(nails);
        return nailsRepository.findAll();
    }
}
