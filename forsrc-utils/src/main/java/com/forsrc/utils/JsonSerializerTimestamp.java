package com.forsrc.utils;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;



/**
 * The type Json serializer timestamp.
 */
public class JsonSerializerTimestamp extends JsonSerializer<Timestamp> {

    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public void serialize(Timestamp date, JsonGenerator gen, SerializerProvider provider) throws IOException {
        String value = dateFormat.format(date);
        gen.writeString(value);
    }
}