package com.in28minutes.unittesting.unittesting.business;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SomeBusinessTest {

    @Test
    public void calculateSum_basic() {
        SomeBusinessImpl business = new SomeBusinessImpl();
        int actualResult = business.calculateSum(new int[]{1, 2, 3});
        int expectedResult = 6;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSum_empty() {
        SomeBusinessImpl business = new SomeBusinessImpl();
        int actualResult = business.calculateSum(new int[]{});
        int expectedResult = 0;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSum_five() {
        SomeBusinessImpl business = new SomeBusinessImpl();
        int actualResult = business.calculateSum(new int[]{5});
        int expectedResult = 5;
        Assert.assertEquals(expectedResult, actualResult);
    }
}
