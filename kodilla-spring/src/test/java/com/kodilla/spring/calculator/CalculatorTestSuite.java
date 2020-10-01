package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void addTest() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double a = 5.5, b = 4.5;
        double result = calculator.add(a,b);
        //Then
        Assert.assertEquals(10.0d, result,0.1);
    }

    @Test
    public void subTest() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double a = 5.5, b = 4.5;
        double result = calculator.sub(a,b);
        //Then
        Assert.assertEquals(1.0d, result,0.1);
    }

    @Test
    public void mulTest() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double a = 5.5, b = 4.5;
        double result = calculator.mul(a,b);
        //Then
        Assert.assertEquals(24.75d, result,0.1);
    }

    @Test
    public void divTest() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double a = 9, b = 4.5;
        double result = calculator.div(a,b);
        //Then
        Assert.assertEquals(2.0d, result,0.1);
    }
}
