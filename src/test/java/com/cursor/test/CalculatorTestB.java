package com.cursor.test;

import com.cursor.Calculator;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CalculatorTestB {
    private Calculator calculator = new Calculator();

    @DataProvider(name = "setOfNumbers1", parallel = true)
    public static Object[][] primeNumbers() {
        return new Object[][]{{2}, {6}, {19}, {22}, {23}};

    }

    @BeforeTest
    public void init() {
        calculator = new Calculator();
    }

    @Test(groups = "smoke")
    public void addTest5_6() throws InterruptedException {
        int a = 5, b = 6;
        int expectedResult = a + b;
        int actualResult = calculator.add(a, b);
        Thread.sleep(3000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void addTest10_13() throws InterruptedException {
        int a = 10, b = 13;
        int expectedResult = a + b;
        int actualResult = calculator.add(a, b);
        Thread.sleep(3000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    @Parameters("int2")
    public void addTest145(int a) throws InterruptedException {
        int expectedResult = calculator.getResult() + a;
        int actualResult = calculator.add(a);
        Thread.sleep(3000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void addTest43() throws InterruptedException {
        int a = 43;
        int expectedResult = calculator.getResult() + a;
        int actualResult = calculator.add(a);
        Thread.sleep(3000);
        assertEquals(actualResult, expectedResult);
    }

    @Test(groups = "smoke")
    public void multiplyTest25_48() throws InterruptedException {
        int a = 25, b = 48;
        int expectedResult = a * b;
        int actualResult = calculator.multiply(a, b);
        Thread.sleep(3000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void multiplyTest12_78() throws InterruptedException {
        int a = 12, b = 78;
        int expectedResult = a * b;
        int actualResult = calculator.multiply(a, b);
        Thread.sleep(3000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void multiplyTest78() throws InterruptedException {
        int a = 78;
        int expectedResult = calculator.getResult() * a;
        int actualResult = calculator.multiply(a);
        Thread.sleep(3000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void multiplyTest2() throws InterruptedException {
        int a = 2;
        int expectedResult = calculator.getResult() * a;
        int actualResult = calculator.multiply(a);
        Thread.sleep(3000);
        assertEquals(actualResult, expectedResult);
    }

    @Test(groups = "smoke")
    public void divisionTest12_32() throws InterruptedException {
        int a = 12, b = 32;
        int expectedResult = a / b;
        int actualResult = calculator.division(a, b);
        Thread.sleep(3000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void divisionTest15_48() throws InterruptedException {
        int a = 15, b = 48;
        int expectedResult = a / b;
        int actualResult = calculator.division(a, b);
        Thread.sleep(3000);
        assertEquals(actualResult, expectedResult);
    }

    @Test(dataProvider = "setOfNumbers1")
    public void divisionTest48(Integer a) throws InterruptedException {
        int expectedResult = calculator.getResult() / a;
        int actualResult = calculator.division(a);
        Thread.sleep(3000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void divisionTest7() throws InterruptedException {
        int a = 7;
        int expectedResult = calculator.getResult() / a;
        int actualResult = calculator.division(a);
        Thread.sleep(3000);
        assertEquals(actualResult, expectedResult);
    }

    @Test(groups = "smoke")
    public void subtractTest7() throws InterruptedException {
        int a = 7;
        int expectedResult = calculator.getResult() - a;
        int actualResult = calculator.subtract(a);
        Thread.sleep(3000);
        assertEquals(actualResult, expectedResult);
    }

    @Test(dataProvider = "setOfNumbers1")
    public void subtractTest96(Integer a) throws InterruptedException {
        int expectedResult = calculator.getResult() - a;
        int actualResult = calculator.subtract(a);
        Thread.sleep(3000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void subtractTest485_367() throws InterruptedException {
        int a = 485, b = 367;
        int expectedResult = a - b;
        int actualResult = calculator.subtract(a, b);
        Thread.sleep(3000);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void subtractTest975_1286() throws InterruptedException {
        int a = 975, b = 1286;
        int expectedResult = a - b;
        int actualResult = calculator.subtract(a, b);
        Thread.sleep(3000);
        assertEquals(actualResult, expectedResult);
    }
}
