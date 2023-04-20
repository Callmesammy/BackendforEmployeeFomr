package com.letscode.employee.Controller;

import com.letscode.employee.Model.EmployeeMDL;
import com.letscode.employee.Service.EmployeeSVR;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeCONT {

    private final EmployeeSVR employeeSVR;

    public EmployeeCONT(EmployeeSVR employeeSVR) {
        this.employeeSVR = employeeSVR;
    }

    @PostMapping("/employee")
    private EmployeeMDL createEmployee(@RequestBody EmployeeMDL employeeMDL){
        return employeeSVR.createemployee(employeeMDL);
    }

    @GetMapping("/employee")
    private List<EmployeeMDL> getAllEmployee(){
        return employeeSVR.getAllEmployee();
    }
}
