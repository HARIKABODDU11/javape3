package com.stackroute.pe3;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static com.stackroute.pe3.Exceptions.main;

public class ExceptionsTest {
    public Exception exc;

    @Before
    public void setUp() {
        System.out.println("Before");
        exc = new Exception();

    }

    @After
    public void tearDown() {
        System.out.println("After");
        exc = null;
    }

    @Test
    public void givenclassShouldThrowException() {
        String result = main(-23);
        assertEquals("Finally block", result);

    }
}

