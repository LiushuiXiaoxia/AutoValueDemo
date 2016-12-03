package cn.mycommons.kotlin

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * KotlinUserTest <br></br>
 * Created by xiaqiulei on 2016-12-03.
 */
class KotlinUserTest {

    @Before
    fun setUp() {

    }

    @Test
    fun testUser() {
        val user = KotlinUser(100, "test")
        println(user)

        Assert.assertEquals(100, user.id)
        Assert.assertEquals("test", user.name)
    }

    @After
    fun tearDown() {

    }
}