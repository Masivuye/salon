package com.salon.controller.ordersController;

import com.salon.domain.orders.Supplier;
import com.salon.repositories.ordersRepository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/salon/supplier" )
public class SupplierController {

    @Autowired
    SupplierRepository supplierRepository;

    @GetMapping(value = "/all")
    public List<Supplier> getAll(){
        return supplierRepository.findAll();
    }
    @PostMapping(value = "/load")
    public List<Supplier> persist(@RequestBody final Supplier supplier){
        supplierRepository.save(supplier);
        return supplierRepository.findAll();
    }
}
