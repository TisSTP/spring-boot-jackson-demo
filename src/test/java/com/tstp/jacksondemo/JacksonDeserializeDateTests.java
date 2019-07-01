package com.tstp.jacksondemo;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tstp.jacksondemo.bean.Employee;

/**
 * @author sathaphorn.stp (Tis)
 * @since 02-07-2019, 01:13
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JacksonDeserializeDateTests {

  @Test
  public void whenDeserializingDateWithJackson_thenCorrect()
      throws JsonProcessingException, IOException {

    String json = "{\n"
        + "    \"empId\": \"000001\",\n"
        + "    \"firstName\": \"Sathaphorn\",\n"
        + "    \"lastName\": \"Sunthornpan\",\n"
        + "    \"birthday\": \"1996-03-13T00:36:03Z\"\n"
        + "}";

    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
    df.setTimeZone(TimeZone.getTimeZone("Asia/Bangkok"));

    ObjectMapper mapper = new ObjectMapper();
    mapper.setDateFormat(df);

    Employee employee = mapper.readerFor(Employee.class).readValue(json);
    assertEquals("1996-03-13T00:36:03Z", df.format(employee.getBirthday()));
  }

}
