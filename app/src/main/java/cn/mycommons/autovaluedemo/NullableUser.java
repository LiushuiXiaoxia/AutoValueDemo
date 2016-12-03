package cn.mycommons.autovaluedemo;


import android.support.annotation.Nullable;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;

@AutoValue
public abstract class NullableUser {

    @SerializedName("id")
    public abstract int id();

    @Nullable
    @SerializedName("name")
    public abstract String name();

    public static NullableUser newInstance(int id, String name) {
        return new AutoValue_NullableUser(id, name);
    }

    public static TypeAdapter<NullableUser> typeAdapter(Gson gson) {
        return new AutoValue_NullableUser.GsonTypeAdapter(gson);
    }
}