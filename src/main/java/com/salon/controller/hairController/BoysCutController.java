package com.salon.controller.hairController;

import com.salon.domain.hair.BoysCut;
import com.salon.repositories.hairRepository.BoysCutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/salon/boys_cut")
public class BoysCutController {
    @Autowired
    BoysCutRepository boysCutRepository;

    @GetMapping(value = "/all")
    public List<BoysCut> getAll(){
        return boysCutRepository.findAll();
    }

    @PostMapping(value = "/load")
    public List<BoysCut> persist(@RequestBody final BoysCut boysCut){
        boysCutRepository.save(boysCut);
        return boysCutRepository.findAll();
    }
}
