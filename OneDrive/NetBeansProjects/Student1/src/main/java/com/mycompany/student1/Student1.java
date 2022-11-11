

package com.mycompany.student1;

import java.util.Scanner;


public class Student1 {

    public static void main(String[] args) {

       Scanner input= new Scanner(System.in);
        int Id;
        String name ;
        double avg ;
       
       Students1 [] stu=new Students1[5];
       
        for (int i = 0; i< stu.length ; ++i) {
         System.out.println("Please enter person id, name, and avg");
        
        Id= input.nextInt();
        name = input.next();
        avg=input.nextDouble();
         
        stu[i]= new Students1(Id, name, avg);
        
    }
        for (int i = 1; i <5; i++) {
            System.out.println("//////////////");
            System.out.println("student " + i +" = " );
           stu[i].getInfo();
        }
    }
   
}