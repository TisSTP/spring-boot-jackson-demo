package com.tstp.jacksondemo.serialize;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

/**
 * @author sathaphorn.stp (Tis)
 * @since 02-07-2019, 00:39
 */
public class CustomDateSerializer extends StdSerializer<Date> {

  private SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

  public CustomDateSerializer() {
    this(null);
  }

  protected CustomDateSerializer(Class<Date> t) {
    super(t);
  }

  @Override
  public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
      throws IOException {
    jsonGenerator.writeString(formatter.format(date));
  }

}
