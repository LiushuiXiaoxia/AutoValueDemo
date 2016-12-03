package cn.mycommons.autovaluedemo.weather;

import com.google.auto.value.AutoValue;
import com.google.gson.TypeAdapter;

import javax.annotation.Generated;

import com.google.gson.annotations.SerializedName;
import com.google.gson.Gson;

@Generated("com.robohorse.robopojogenerator")
@AutoValue
public abstract class Now {

    @SerializedName("code")
    public abstract String code();

    @SerializedName("temperature")
    public abstract String temperature();

    @SerializedName("text")
    public abstract String text();

    public static TypeAdapter<Now> typeAdapter(Gson gson) {
        return new AutoValue_Now.GsonTypeAdapter(gson);
    }
}