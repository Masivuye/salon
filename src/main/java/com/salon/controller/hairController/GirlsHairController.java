package com.salon.controller.hairController;

import com.salon.domain.hair.GirlsHair;
import com.salon.repositories.hairRepository.GirlsHairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/salon/girls_hair")
public class GirlsHairController {
    @Autowired
    GirlsHairRepository girlsHairRepository;
    @GetMapping(value = "/all")
    public List<GirlsHair> getAll(){
        return girlsHairRepository.findAll();
    }
    @PostMapping(value = "/load")
    public List<GirlsHair> persist(@RequestBody final GirlsHair girlsHair){
        girlsHairRepository.save(girlsHair);
       return girlsHairRepository.findAll();
    }
}
