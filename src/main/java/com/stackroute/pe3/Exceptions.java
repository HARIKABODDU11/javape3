package com.stackroute.pe3;

public class Exceptions {  //Raises userdefined exception
    public Exceptions(String str) {
    }
    public static String main(int number) {
        String display="";
        try{
            display="Exception is raised when number is less than 0";
            if(number<0){
                throw new Exception();
            }
        }
        catch (Exception e)
        {
            display="catch block";
        }
        finally {
            display="Finally block";
        }
        return display;
    }
}