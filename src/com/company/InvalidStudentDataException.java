package com.company;

public class InvalidStudentDataException extends StudentDataException{
    InvalidStudentDataException(String msg){
        super(msg);
    }
}
