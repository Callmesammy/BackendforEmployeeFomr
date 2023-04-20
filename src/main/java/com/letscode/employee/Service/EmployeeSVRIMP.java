package com.letscode.employee.Service;

import com.letscode.employee.Entity.EmployeeENT;
import com.letscode.employee.Model.EmployeeMDL;
import com.letscode.employee.Reporsitory.EmployeeRPR;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeSVRIMP implements EmployeeSVR{

    public final EmployeeRPR employeeRPR;

    public EmployeeSVRIMP(EmployeeRPR employeeRPR) {
        this.employeeRPR = employeeRPR;
    }

    @Override
    public EmployeeMDL createemployee(EmployeeMDL employeeMDL) {
        EmployeeENT employeeENT = new EmployeeENT();
        BeanUtils.copyProperties(employeeMDL, employeeENT);
        employeeRPR.save(employeeENT);
        return employeeMDL;
    }

    @Override
    public List<EmployeeMDL> getAllEmployee() {
        List<EmployeeENT> employeeENT = employeeRPR.findAll();
        List<EmployeeMDL> employee = employeeENT
                .stream()
                .map(mpa -> new EmployeeMDL(mpa.getId(), mpa.getFirstName(), mpa.getLastName(),
                        mpa.getEmail())).collect(Collectors.toList());
        return employee;
    }


}
