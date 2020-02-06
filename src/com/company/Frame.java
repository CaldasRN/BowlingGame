package com.company;

public class Frame {
    //Private variable
    int roll1;
    int roll2;
    int roll3;

    //Constructor standard
    public Frame(int roll1, int roll2){
        this.roll1 = roll1;
        this.roll2 = roll2;
    }

    //Constructor final frame
    public Frame(int roll1, int roll2, int roll3){
        this.roll1 = roll1;
        this.roll2 = roll2;
        this.roll3 = roll3;
    }

    //method 1
    public int getRoll1(){
        return roll1;
    }
    //method 2
    public int getRoll2(){
        return roll2;
    }
    //method 3
    public int getRoll3(){
        return roll3;
    }
    public void setRoll1(int roll){
        this.roll1 = roll;
    }
}
