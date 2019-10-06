package com.salon.controller.manicureController;

import com.salon.domain.manicure.UpperMassage;
import com.salon.repositories.manicureRepository.UpperMassageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/salon/uppermassage")
public class UpperMassageController {
    @Autowired
    UpperMassageRepository upperMassageRepository;

    @GetMapping(value = "/all")
    public List<UpperMassage> getAll(){
        return upperMassageRepository.findAll();
    }
    @PostMapping(value = "/load")
    public List<UpperMassage> persist(@RequestBody final UpperMassage upperMassage){
        upperMassageRepository.save(upperMassage);
        return upperMassageRepository.findAll();
    }
}
