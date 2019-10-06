package com.salon.controller.ordersController;

import com.salon.domain.orders.ImportSupplier;
import com.salon.repositories.ordersRepository.ImportSupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/salon/import_supplier")
public class ImportSupplierController {
    @Autowired
    ImportSupplierRepository importSupplierRepository;

    @GetMapping(value = "/all")
    public List<ImportSupplier> getAll(){
        return importSupplierRepository.findAll();
    }
    @PostMapping(value = "/load")
    public List<ImportSupplier> persist(@RequestBody final ImportSupplier importSupplier){
        importSupplierRepository.save(importSupplier
        );
        return importSupplierRepository.findAll();
    }
}
