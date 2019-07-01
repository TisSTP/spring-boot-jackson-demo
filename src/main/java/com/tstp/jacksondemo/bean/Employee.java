package com.tstp.jacksondemo.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.tstp.jacksondemo.serialize.CustomDateForWebSerializer;
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
  private String empId;
  @NonNull
  private String firstName;
  @NonNull
  private String lastName;
//  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "Asia/Bangkok")
  @JsonSerialize(using = CustomDateForWebSerializer.class)
  private Date birthday;

}
