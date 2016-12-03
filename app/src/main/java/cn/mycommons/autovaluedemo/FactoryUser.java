package cn.mycommons.autovaluedemo;

import com.google.auto.factory.AutoFactory;

/**
 * FactoryUser <br/>
 * Created by xiaqiulei on 2016-12-03.
 */
@AutoFactory
public class FactoryUser {

    private final int id;

    private final String name;

    public FactoryUser(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "FactoryUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}