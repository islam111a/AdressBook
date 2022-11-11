/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.epmloyeartest;

/**
 *
 * @author Microsoft
 */
public class date {
  
    private int year , mon ,day ;

    public date(int year, int mon, int day) {
        this.year = year;
        this.mon = mon;
        this.day = day;
    }
  

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMon() {
        return mon;
    }

    public void setMon(int mon) {
        this.mon = mon;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    
    public String getdate(){
        return this.day +"/"+ this.mon +"/"+this.year ;
                
    }
}
