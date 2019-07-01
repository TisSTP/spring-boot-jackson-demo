package com.tstp.jacksondemo.bean;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.tstp.jacksondemo.serialize.CustomDateSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sathaphorn.stp (Tis)
 * @since 02-07-2019, 00:59
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {

  private String name;
  @JsonSerialize(using = CustomDateSerializer.class)
  private Date eventDate;

}
