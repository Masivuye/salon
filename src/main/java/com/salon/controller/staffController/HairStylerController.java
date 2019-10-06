package com.salon.controller.staffController;



import com.salon.domain.staff.HairStyler;
import com.salon.repositories.staffRepository.HairStylerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/salon/hair_styler")
public class HairStylerController {

    @Autowired
    HairStylerRepository hairStylerRepository;

    @GetMapping(value = "/all")
    public List<HairStyler> getAll(){
        return hairStylerRepository.findAll();
    }
    @PostMapping(value = "/load")
    public List<HairStyler> persist(@RequestBody final HairStyler hairStyler){
        hairStylerRepository.save(hairStyler);
        return hairStylerRepository.findAll();
    }
}
