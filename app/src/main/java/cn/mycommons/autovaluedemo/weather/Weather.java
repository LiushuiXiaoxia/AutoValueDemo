package cn.mycommons.autovaluedemo.weather;

import java.util.List;

import com.google.auto.value.AutoValue;
import com.google.gson.TypeAdapter;

import javax.annotation.Generated;

import com.google.gson.annotations.SerializedName;
import com.google.gson.Gson;

@Generated("com.robohorse.robopojogenerator")
@AutoValue
public abstract class Weather {

    @SerializedName("results")
    public abstract List<ResultsItem> results();

    public static Weather create(List<ResultsItem> results) {
        return builder()
                .results(results)
                .build();
    }

    public static TypeAdapter<Weather> typeAdapter(Gson gson) {
        return new AutoValue_Weather.GsonTypeAdapter(gson);
    }

    public static Builder builder() {
        return new AutoValue_Weather.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder results(List<ResultsItem> results);

        public abstract Weather build();
    }


}