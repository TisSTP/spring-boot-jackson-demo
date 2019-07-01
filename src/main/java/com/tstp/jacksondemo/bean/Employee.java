package com.tstp.jacksondemo.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sathaphorn.stp (Tis)
 * @since 01-07-2019, 23:43
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
  private String empId;
  private String firstname;
  private String lastName;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "Asia/Bangkok")
  private Date birthday;
}
