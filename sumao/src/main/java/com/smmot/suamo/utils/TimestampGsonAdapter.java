package com.smmot.suamo.utils;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: adams
 * Date:  2018/1/30
 * Time: 15:21
 */
public class TimestampGsonAdapter implements JsonSerializer<Timestamp>, JsonDeserializer<Timestamp> {

    private DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     构造方法 void TimestampGsonAdapter()
     */
    public TimestampGsonAdapter() {}

    /**
     构造方法 void TimestampGsonAdapter()
     @param dateFormat	String	日期字符串格式
     */
    public TimestampGsonAdapter(String dateFormat) {
        this.format = new SimpleDateFormat(dateFormat);
    }

    @Override
    public Timestamp deserialize(JsonElement arg0, Type arg1,
                                 JsonDeserializationContext arg2) throws JsonParseException {
        if (!(arg0 instanceof JsonPrimitive)) {
            throw new JsonParseException("The date should be a string value");
        }

        try {
            Date date = format.parse(arg0.getAsString());
            return new Timestamp(date.getTime());
        } catch (ParseException e) {
            throw new JsonParseException(e);
        }
    }

    @Override
    public JsonElement serialize(Timestamp arg0, Type arg1,
                                 JsonSerializationContext arg2) {
        String dateFormatAsString = format.format(new Date(arg0.getTime()));
        return new JsonPrimitive(dateFormatAsString);
    }

}

