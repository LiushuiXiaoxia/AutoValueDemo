package cn.mycommons.autovaluedemo.weather;

import android.support.annotation.NonNull;

import com.google.gson.Gson;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * RetrofitUtil <br/>
 * Created by xiaqiulei on 2016-12-02.
 */
public class RetrofitUtil {

    // https://api.thinkpage.cn/v3/weather/now.json?key=x4qjfuniyu97mt9y&location=beijing&language=zh-Hans&unit=c

    /**
     * 创建RetrofitApi对象
     */
    public static <T> T createApi(@NonNull Class<T> tClass, Gson gson) {
        return new Retrofit.Builder()
                .baseUrl("https://api.thinkpage.cn")
                .client(new OkHttpClient.Builder().build())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build()
                .create(tClass);
    }
}