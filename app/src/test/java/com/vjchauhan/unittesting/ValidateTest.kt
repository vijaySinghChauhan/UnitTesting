package com.vjchauhan.unittesting

import org.junit.After
import org.junit.Assert
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.Test


class ValidateTest
{
    lateinit var validate: Validate
    @Before
    fun setUp() {
        validate = Validate()
    }

    @After
    fun tearDown() {
    }

    @Test
    fun isZero() {
        var result=validate.isZero(1)
       // assertThat()
        Assert.assertEquals(false,result)
    }
}