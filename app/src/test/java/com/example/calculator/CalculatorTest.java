package com.example.calculator;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class CalculatorTest {

    //Member variable
    Calculator c;

    @Before
    public void setUp(){
        c = new Calculator();
    }

    @Test
    public void testAddition_input5and5_output() throws Exception {
        //1. Arrange
        double num1 = 5;
        double num2 = 5;

        //2.Act
        double result = c.Addition(num1,num2);

        //3.Assert
        assertEquals(10.0,result,1);
    }

    @Test
    public void subtraction() {
    }

    @Test
    public void multiplication() {
    }

    @Test
    public void division() {
    }
}