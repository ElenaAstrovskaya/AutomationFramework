package project.by.stormnet.functional.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SomeTests {
    public int a;
    public int b;
    private int actualResult;

    @BeforeClass
    public void setUpData() {
        a = 5;
        b = 4;
    }

    @Test
    public void test1() {
        int expectedResult = 9;
        actualResult = a + b;
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println("Test passed!");
    }

    @Test
    public void test2() {
        int expectedResult = 1;
        actualResult = a - b;
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println("Test passed!");
    }

    @Test
    public void test3() {
        Assert.fail();
    }

    @Test(enabled = false)
    public void test4() {
        System.out.println("Skipped test!");
    }
}