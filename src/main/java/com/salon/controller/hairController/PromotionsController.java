package com.salon.controller.hairController;

import com.salon.domain.hair.Promotions;
import com.salon.repositories.hairRepository.PromotionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/salon/promotion")
public class PromotionsController {

    @Autowired
    PromotionsRepository promotionsRepository;

    @GetMapping(value = "/all")
    public List<Promotions> getAll(){
        return promotionsRepository.findAll();
    }
    @PostMapping(value = "/load")
    public List<Promotions> persist(@RequestBody  final Promotions promotions){
        promotionsRepository.save(promotions);
        return promotionsRepository.findAll();

    }
}
