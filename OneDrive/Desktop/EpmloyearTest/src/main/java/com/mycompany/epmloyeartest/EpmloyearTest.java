/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.epmloyeartest;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Microsoft
 */
public class EpmloyearTest {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String menu = " 1- add new employee \n "
                      + " 2-Remove an employee by his/her name if exists: \n"
                      + " 3-Print annual salary for each employee: \n"
                      + " 4-Add a certain raise percentage to each employee’s monthly salary: \n"
                      + " 5-Print all employee’s information: \n"
                      + " 6-Exit: ";
        ArrayList<Employee> emp = new ArrayList<>();
        while (true){
            System.out.println(menu);
            switch (in.nextInt() )
            {
            case 1:
                System.out.println("plz enter date year then mon then day ");
                int year = in.nextInt();
                int mon = in.nextInt();
                int day = in.nextInt();
                System.out.println("enter name then month salary ");
               emp.add(new Employee(in.next(), new date(year, mon, day ) ,in.nextDouble()));
                break;
            case 2:
                System.out.println("enter name by emp to delet");
                String str = in.next();
                for (int i = 0; i < emp.size(); i++) {
                   if (emp.get(i).getName().equals(str))
                       emp.remove(i);
                }
                break;
            case 3:
                  for (int i = 0; i < emp.size(); i++) {
                          System.out.println(emp.get(i).getName()+"\\"+emp.get(i).getMonthsalary()*12 );
                }
                break;
            case 4:
                for (int i = 0; i < emp.size(); i++) {
                    double sa = emp.get(i).getMonthsalary();
                    sa =sa+100;
                    emp.get(i).setMonthsalary(sa);
                    
                }
               
                break;
            case 5:
                for (int i = 0; i < emp.size(); i++) {
                    System.out.println(emp.get(i).getEmployee());   
                    
                }
                break;
            case 6:
                 System.exit(0);
                break;
            default:
               
            }      
        }
    }          
}

