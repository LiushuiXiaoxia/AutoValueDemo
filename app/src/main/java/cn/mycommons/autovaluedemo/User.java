package cn.mycommons.autovaluedemo;


import android.os.Parcelable;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

@AutoValue
public abstract class User implements Serializable, Parcelable {

    @SerializedName("id")
    public abstract int id();

    @SerializedName("name")
    public abstract String name();

    public static User newInstance(int id, String name) {
        return new AutoValue_User(id, name);
    }

    public static TypeAdapter<User> typeAdapter(Gson gson) {
        return new AutoValue_User.GsonTypeAdapter(gson);
    }
}