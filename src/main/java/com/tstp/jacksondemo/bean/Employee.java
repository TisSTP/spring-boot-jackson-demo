package com.tstp.jacksondemo.bean;

import java.util.Date;

import lombok.Data;

/**
 * @author sathaphorn.stp (Tis)
 * @since 01-07-2019, 23:43
 */
@Data
public class Employee {
  private String empId;
  private String firstname;
  private String lastName;
  private Date birthday;
}
