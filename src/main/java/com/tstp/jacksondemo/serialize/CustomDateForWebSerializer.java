package com.tstp.jacksondemo.serialize;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

/**
 * @author sathaphorn.stp (Tis)
 * @since 02-07-2019, 01:31
 */
public class CustomDateForWebSerializer extends StdSerializer<Date> {

  private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

  public CustomDateForWebSerializer() {
    this(null);
  }

  protected CustomDateForWebSerializer(Class<Date> t) {
    super(t);
    formatter.setTimeZone(TimeZone.getTimeZone("Asia/Bangkok"));
  }

  @Override
  public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
      throws IOException {
    jsonGenerator.writeString(formatter.format(date));
  }

}
