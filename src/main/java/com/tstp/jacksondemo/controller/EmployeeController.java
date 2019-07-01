package com.tstp.jacksondemo.controller;

import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tstp.jacksondemo.bean.Employee;

/**
 * @author sathaphorn.stp (Tis)
 * @since 01-07-2019, 23:42
 */
@RestController
@RequestMapping("employee")
public class EmployeeController {

  @GetMapping()
  public Employee getEmployee() {
    System.out.println("getEmployee");
    // set birthday
    Calendar calendar = Calendar.getInstance();
    calendar.set(1996, Calendar.MARCH, 13);

    // new Employee
    Employee employee = new Employee();
    employee.setEmpId("00001");
    employee.setFirstName("Sathaphorn");
    employee.setLastName("Sunthornpan");
    employee.setBirthday(calendar.getTime());

    return employee;
  }

  @PostMapping()
  public Employee postEmployee(@RequestBody Employee employee) {
    System.out.println("postEmployee");
    return employee;
  }
}
