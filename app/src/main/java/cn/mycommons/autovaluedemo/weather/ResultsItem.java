package cn.mycommons.autovaluedemo.weather;

import com.google.auto.value.AutoValue;
import com.google.gson.TypeAdapter;

import javax.annotation.Generated;

import com.google.gson.annotations.SerializedName;
import com.google.gson.Gson;

@Generated("com.robohorse.robopojogenerator")
@AutoValue
public abstract class ResultsItem {

    @SerializedName("now")
    public abstract Now now();

    @SerializedName("last_update")
    public abstract String lastUpdate();

    @SerializedName("location")
    public abstract Location location();

    public static TypeAdapter<ResultsItem> typeAdapter(Gson gson) {
        return new AutoValue_ResultsItem.GsonTypeAdapter(gson);
    }
}