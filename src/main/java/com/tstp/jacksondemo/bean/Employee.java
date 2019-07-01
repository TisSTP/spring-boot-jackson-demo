package com.tstp.jacksondemo.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * @author sathaphorn.stp (Tis)
 * @since 01-07-2019, 23:43
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Employee {

  @NonNull
  public String empId;
  @NonNull
  public String firstname;
  @NonNull
  public String lastName;
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "Asia/Bangkok")
  public Date birthday;

}
