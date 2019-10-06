package com.salon.controller.manicureController;

import com.salon.domain.manicure.FullMassage;
import com.salon.repositories.manicureRepository.FullMassageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/salon/fullMassage")
public class FullMassageController {
    @Autowired
    FullMassageRepository fullMassageRepository;

    @GetMapping(value = "/all")
    public List<FullMassage> getAll(){
        return fullMassageRepository.findAll();
    }
    @PostMapping(value = "/load")
    public List<FullMassage> persist(@RequestBody final FullMassage fullMassage){
        fullMassageRepository.save(fullMassage);
        return fullMassageRepository.findAll();
    }
}
