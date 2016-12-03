package cn.mycommons.autovaluedemo.weather;

import retrofit2.Call;
import retrofit2.http.GET;
import rx.Observable;

/**
 * IWeatherApi <br/>
 * Created by xiaqiulei on 2016-12-02.
 */
public interface IWeatherApi {

    @GET("/v3/weather/now.json?key=x4qjfuniyu97mt9y&location=beijing&language=zh-Hans&unit=c")
    Call<Weather> getWeather();

    @GET("/v3/weather/now.json?key=x4qjfuniyu97mt9y&location=beijing&language=zh-Hans&unit=c")
    Observable<Weather> getWeatherWithRx();
}