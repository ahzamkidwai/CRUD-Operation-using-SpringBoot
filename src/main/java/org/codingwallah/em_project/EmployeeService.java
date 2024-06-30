package org.codingwallah.em_project;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> readEmployee();

    boolean deleteEmployee(Long id);
}
