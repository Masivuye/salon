package com.salon.controller.hairController;

import com.salon.domain.hair.HairStyle;
import com.salon.repositories.hairRepository.HairStyleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/salon/hairstyle")
public class HairStyleController {
    @Autowired
    HairStyleRepository hairStyleRepository;

    @GetMapping(value = "/all")
    public List<HairStyle> getAll(){
        return hairStyleRepository.findAll();
    }
    @PostMapping(value = "/load")
    public List<HairStyle> persist(@RequestBody final HairStyle hairStyle){
        hairStyleRepository.save(hairStyle);
        return hairStyleRepository.findAll();
    }
}
