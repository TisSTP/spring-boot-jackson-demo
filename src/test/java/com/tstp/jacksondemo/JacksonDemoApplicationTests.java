package com.tstp.jacksondemo;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tstp.jacksondemo.bean.Employee;
import com.tstp.jacksondemo.bean.Event;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JacksonDemoApplicationTests {

  @Test
  public void whenUsingJsonFormatAnnotationToFormatDate_thenCorrect()
      throws JsonProcessingException, ParseException {

    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
    df.setTimeZone(TimeZone.getTimeZone("Asia/Bangkok"));

    String toParse = "1996-03-13T00:36:03Z";
    Date date = df.parse(toParse);
    Employee employee = new Employee("01", "name", "surname", date);

    ObjectMapper mapper = new ObjectMapper();
    String result = mapper.writeValueAsString(employee);
    assertThat(result, containsString(toParse));
  }

  @Test
  public void whenUsingCustomDateSerializer_thenCorrect()
      throws JsonProcessingException, ParseException {

    SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

    String toParse = "20-12-2014 02:30:00";
    Date date = df.parse(toParse);
    Event event = new Event("party", date);

    ObjectMapper mapper = new ObjectMapper();
    String result = mapper.writeValueAsString(event);
    assertThat(result, containsString(toParse));
  }
}
