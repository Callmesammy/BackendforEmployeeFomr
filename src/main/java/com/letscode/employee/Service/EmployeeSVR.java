package com.letscode.employee.Service;

import com.letscode.employee.Model.EmployeeMDL;

import java.util.List;

public interface EmployeeSVR {
    EmployeeMDL createemployee(EmployeeMDL employeeMDL);

    List<EmployeeMDL> getAllEmployee();
}
