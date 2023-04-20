package com.letscode.employee.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeMDL {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
}
