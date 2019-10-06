package com.salon.controller.staffController;

import com.salon.domain.staff.Admin;
import com.salon.repositories.staffRepository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/salon/admin")
public class AdminController {
    @Autowired
    AdminRepository adminRepository;

    @GetMapping(value = "/all")
    public List<Admin> getAll(){
        return adminRepository.findAll();
    }
    @PostMapping(value = "/load")
    public List<Admin> persist(@RequestBody final Admin admin){
        adminRepository.save(admin);
        return adminRepository.findAll();
    }
}
