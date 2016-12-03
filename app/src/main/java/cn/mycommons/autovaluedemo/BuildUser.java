package cn.mycommons.autovaluedemo;

/**
 * BuildUser <br/>
 * Created by xiaqiulei on 2016-12-02.
 */

import com.google.auto.value.AutoValue;
import com.google.gson.annotations.SerializedName;

@AutoValue
public abstract class BuildUser {

    @SerializedName("id")
    public abstract int id();

    @SerializedName("name")
    public abstract String name();

    @AutoValue.Builder
    public static abstract class Builder {

        abstract Builder id(int id);

        abstract Builder name(String name);

        abstract BuildUser build();
    }
}