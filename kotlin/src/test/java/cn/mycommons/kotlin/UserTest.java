package cn.mycommons.kotlin;

import org.junit.Assert;
import org.junit.Test;

/**
 * UserTest <br/>
 * Created by xiaqiulei on 2016-12-03.
 */
public class UserTest {

    @Test
    public void testUser() {
        KotlinUser user = new KotlinUser(100, "test");

        System.out.println(user);

        Assert.assertEquals(100, user.getId());
        Assert.assertEquals("test", user.getName());
    }
}