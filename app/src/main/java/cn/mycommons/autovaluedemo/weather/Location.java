package cn.mycommons.autovaluedemo.weather;

import com.google.auto.value.AutoValue;
import com.google.gson.TypeAdapter;

import javax.annotation.Generated;

import com.google.gson.annotations.SerializedName;
import com.google.gson.Gson;

@Generated("com.robohorse.robopojogenerator")
@AutoValue
public abstract class Location {

    @SerializedName("country")
    public abstract String country();

    @SerializedName("path")
    public abstract String path();

    @SerializedName("timezone")
    public abstract String timezone();

    @SerializedName("timezone_offset")
    public abstract String timezoneOffset();

    @SerializedName("name")
    public abstract String name();

    @SerializedName("id")
    public abstract String id();

    public static TypeAdapter<Location> typeAdapter(Gson gson) {
        return new AutoValue_Location.GsonTypeAdapter(gson);
    }
}