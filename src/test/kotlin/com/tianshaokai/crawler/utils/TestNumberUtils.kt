package com.tianshaokai.crawler.utils

import org.junit.Assert
import org.junit.Test

class TestNumberUtils {

    @Test
    fun testGetNumber1() {
        Assert.assertEquals(NumberUtils.getNumber("共5页"), 5);
    }

    @Test
    fun testGetNumber2() {
        Assert.assertEquals(NumberUtils.getNumber(""), 0);
    }
}