/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.epmloyeartest;


/**
 *
 * @author Microsoft
 */
public class Employee {
    private String name ;
    private date Her_date ;
    private double Monthsalary ;

    public Employee(String name, date Her_date,double Monthsalary) {
        this.name = name;
        this.Her_date = Her_date;
        this.Monthsalary = Monthsalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public date getHer_date() {
        return Her_date;
    }

    public void setHer_date(date Her_date) {
        this.Her_date = Her_date;
    }

    public double getMonthsalary() {
        return Monthsalary;
    }

    public void setMonthsalary(double Monthsalary) {
      
        if ( Monthsalary > 0 )
             this.Monthsalary = Monthsalary;
        else System.out.println("invalid ");
    }
     public String getEmployee (){
     return "name : " +this.name + "date : "+ Her_date.getdate() +"month salary : " + this.Monthsalary ;
             }
    
}
