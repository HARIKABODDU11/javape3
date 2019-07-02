package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentsMarks m;
    @Before
    public void setUp(){
        System.out.println("Before");
        m=new StudentsMarks();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        m=null;
    }
    @Test
    public void givenMarksShouldReturnSuccess(){
        String result =m.marks(new int[]{57,14,76,90},4);
        assertEquals("success",result);
    }
    @Test
    public void givenMarksShouldReturnNUll(){
        String result =m.marks(new int[]{67,22,900,75},4);
        assertEquals("error",result);
    }


}