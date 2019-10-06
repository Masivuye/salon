package com.salon.controller.ordersController;

import com.salon.domain.orders.LocalSuppliers;
import com.salon.repositories.ordersRepository.LocalSupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/salon/local_supplier")
public class LocalSupplierController {
    @Autowired
    LocalSupplierRepository localSupplierRepository;

    @GetMapping(value = "/all")
    public List<LocalSuppliers> getAll(){
        return localSupplierRepository.findAll();
    }
    @PostMapping(value = "/load")
    public List<LocalSuppliers> persist(@RequestBody final LocalSuppliers localSuppliers){
        localSupplierRepository.save(localSuppliers);
        return localSupplierRepository.findAll();
    }
}
