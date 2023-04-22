package com.letscode.employee.Controller;

import com.letscode.employee.Model.EmployeeMDL;
import com.letscode.employee.Service.EmployeeSVR;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeCONT {

    private final EmployeeSVR employeeSVR;

    public EmployeeCONT(EmployeeSVR employeeSVR) {
        this.employeeSVR = employeeSVR;
    }

    @PostMapping("/employee")
    private EmployeeMDL createEmployee(@RequestBody EmployeeMDL employeeMDL) {
        return employeeSVR.createemployee(employeeMDL);
    }

    @GetMapping("/employee")
    private List<EmployeeMDL> getAllEmployee() {
        return employeeSVR.getAllEmployee();
    }


    @DeleteMapping("/employee{id}")
   public ResponseEntity<Map<String, Boolean>> deletedEmployee(@PathVariable Long id){
        boolean deleted = false;
        deleted = employeeSVR.deletedEmployee(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", deleted);
        return ResponseEntity.ok(response);
   }



}