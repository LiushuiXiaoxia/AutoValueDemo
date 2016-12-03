package cn.mycommons.autovaluedemo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.io.IOException;

import cn.mycommons.autovaluedemo.weather.IWeatherApi;
import cn.mycommons.autovaluedemo.weather.RetrofitUtil;
import cn.mycommons.autovaluedemo.weather.Weather;
import rx.functions.Action1;

/**
 * AutoTest <br/>
 * Created by xiaqiulei on 2016-11-29.
 */
@FixMethodOrder(value = MethodSorters.JVM)
public class AutoTest {


    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testUser() {
        User user = User.newInstance(100, "test");

        System.out.println("user = " + user);
        Assert.assertEquals(user.id(), 100);
        Assert.assertEquals(user.name(), "test");
    }

    @Test(expected = NullPointerException.class)
    public void testUserNullPointException() throws Exception {
        User.newInstance(100, null);
    }

    @Test
    public void testUserNullable() {
        NullableUser user = NullableUser.newInstance(100, "test");

        System.out.println("user = " + user);
        Assert.assertEquals(user.id(), 100);
        Assert.assertEquals(user.name(), "test");
    }

    @Test
    public void testUserToJson() {
        User user = User.newInstance(100, "test");

        String json = new Gson().toJson(user);
        System.out.println(json);

        Assert.assertEquals("{\"id\":100,\"name\":\"test\"}", json);
    }

    @Test
    public void testUserParseFromJson() {
        String json = "{\"id\":100,\"name\":\"test\"}";
        Gson gson = new GsonBuilder().registerTypeAdapterFactory(MyAdapterFactory.create()).create();

        User user = gson.fromJson(json, User.class);
        System.out.println(user);
        Assert.assertNotNull(user);
        Assert.assertEquals(user.name(), "test");
        Assert.assertEquals(user.id(), 100);

        NullableUser nullableUser = gson.fromJson(json, NullableUser.class);
        System.out.println(nullableUser);
        Assert.assertNotNull(nullableUser);
        Assert.assertEquals(nullableUser.name(), "test");
        Assert.assertEquals(nullableUser.id(), 100);
    }

    @Test
    public void testUserBuilder() {
        BuildUser buildUser = new AutoValue_BuildUser.Builder()
                .id(100)
                .name("test")
                .build();

        System.out.println(buildUser);

        Assert.assertEquals(buildUser.id(), 100);
        Assert.assertEquals(buildUser.name(), "test");
    }

    @Test
    public void testRetrofitWithAutoValue() {
        Gson gson = new GsonBuilder().registerTypeAdapterFactory(MyAdapterFactory.create()).create();
        IWeatherApi weatherApi = RetrofitUtil.createApi(IWeatherApi.class, gson);
        try {
            Weather weather = weatherApi.getWeather().execute().body();
            Assert.assertNotNull(weather);

            System.out.println(weather);

            weatherApi.getWeatherWithRx().subscribe(new Action1<Weather>() {
                @Override
                public void call(Weather weather) {
                    System.out.println(weather);
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFactoryUser() {
        FactoryUser user = new FactoryUserFactory().create(100, "test");

        System.out.println(user);
        Assert.assertNotNull(user);
        Assert.assertEquals(100, user.getId());
        Assert.assertEquals("test", user.getName());
    }

    @After
    public void tearDown() throws Exception {
    }
}