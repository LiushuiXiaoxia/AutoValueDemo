package cn.mycommons.autovaluedemo;

import com.google.gson.TypeAdapterFactory;
import com.ryanharter.auto.value.gson.GsonTypeAdapterFactory;

/**
 * MyAdapterFactory <br/>
 * Created by xiaqiulei on 2016-12-02.
 */
@GsonTypeAdapterFactory
public abstract class MyAdapterFactory implements TypeAdapterFactory {

    public static TypeAdapterFactory create() {
        return new AutoValueGson_MyAdapterFactory();
    }
}