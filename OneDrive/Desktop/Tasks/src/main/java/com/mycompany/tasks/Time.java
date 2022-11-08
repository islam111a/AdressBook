package com.mycompany.tasks;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Microsoft
 */
public class Time {
    private int min ;
    private int hour ;

    public Time() {
        this.min = 00 ;
        this.hour = 12;
    }

    public Time(int hour, int min) {
        this.min = min;
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    @Override
    public String toString(){
        return getHour() + " "+ getMin();
    }
}
