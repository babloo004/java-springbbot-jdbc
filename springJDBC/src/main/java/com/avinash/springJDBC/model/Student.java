package com.avinash.springJDBC.model;

import org.springframework.stereotype.Component;

@Component
public class Student {

    //properties

    private int roll;

    private String name;

    private int marks;

    //setters

    //setRoll()
    public void setRoll(int roll){
        this.roll = roll;
    }

    //setName()
    public void setName(String name){
        this.name = name;
    }

    //setMarks()
    public void setMarks(int marks){
        this.marks = marks;
    }

    //getters

    //getRoll()
    public int getRoll(){
        return this.roll;
    }

    //getName()
    public String getName(){
        return this.name;
    }

    //getMarks()
    public int getMarks(){
        return this.marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + this.roll +
                ", name='" + this.name + '\'' +
                ", marks=" + this.marks +
                '}';
    }
}
