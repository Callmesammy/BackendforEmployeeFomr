package com.letscode.employee.Reporsitory;

import com.letscode.employee.Entity.EmployeeENT;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRPR extends JpaRepository<EmployeeENT, Long> {
}
