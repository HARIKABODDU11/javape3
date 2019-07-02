package com.stackroute.pe3;

public class StudentsMarks {
    String r;

    public String marks(int[] stuGrades,int numOfStudents) {
        if(stuGrades.length!=numOfStudents)
            r="error";
        else{
            for(int i=0;i<numOfStudents;i++){
                if(stuGrades[i]>=0&&stuGrades[i]<=100){
                    r="success";
                }
                else{
                    r="error";
                    break;
                }
            }
        }

         return r;
    }
}