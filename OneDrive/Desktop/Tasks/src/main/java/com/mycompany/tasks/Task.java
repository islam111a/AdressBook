package com.mycompany.tasks;


import com.mycompany.tasks.Time;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Microsoft
 */
public class Task {
    private String task;
    private Time t ; 

    public Task() {
        task = "untitel";
        this.t=null;
    }

    public Task(String task, Time t) {
        this.task = task;
        this.t = t;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }    
    @Override
    public String toString(){
    return  getTask()+" "+
            t.toString();
    }
    
    
}
