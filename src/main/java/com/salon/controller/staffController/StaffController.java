package com.salon.controller.staffController;

import com.salon.domain.staff.Staff;
import com.salon.repositories.staffRepository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/salon/staff")
public class StaffController {
    @Autowired
    StaffRepository staffRepository;

    @GetMapping(value = "/all")
    public List<Staff> getAll(){
       return staffRepository.findAll();
    }
    @PostMapping(value = "/load")
    public List<Staff> persist(@RequestBody final Staff staff)
    {
        staffRepository.save(staff);
        return staffRepository.findAll();
    }
}
