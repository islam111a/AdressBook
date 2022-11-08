/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tasks;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Microsoft
 */
public class Tasks {

    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in); 
        System.out.println("enter time ");
        Time t = new Time(inp.nextInt(), inp.nextInt());
        System.out.println("enter title task ");
        Task p = new Task(inp.next(), t);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }
        
           System.out.println("1- add\n 2- delet \n 3-print \n 4-edit \n ");
             int in = inp.nextInt(); 
             String cin;
        switch (in) {
            case 1:
                for (int i = 0; i < 10; i++) {
                    arr.add(inp.nextInt());
                }
                break;
            case 2 : 
                arr.remove(inp.nextInt());
                break;
            case 3 :
               for (int i = 0; i < arr.size(); i++) {
                   Integer get = arr.get(i);
                }
               break ;
            case 4 :
                System.out.println("enter name task to edit ");
                cin  = inp.next();
                if ( arr.equals(p))
                
            default:
                System.out.println(" unvalid");
             
        }
        
        
        
        System.out.println( p.toString());
    }
}
