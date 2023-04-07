package Scr;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



//Implement the AssignPlan class here


class AssignPlan{
  private String highestPriorityItem="";
  private int numAssignments, numComplete, hoursAvailable;
  private double totalPoints;

  
  //Question 1. Properly implement accessor methods for the private variables  highestPriorityItem, numAssignments, numComplete, hoursAvailable, totalPoints. 

    public int getNumAssignments(){

    return numAssignments;

    }

    public int getNumComplete(){

    return numComplete;

    }

    public double getTotalPoints(){

    return totalPoints;

    }

    public int getHoursAvailable(){

    return hoursAvailable;

    }

    public String getHighestPriorityItem(){

    return highestPriorityItem;

    }
  
  //private String getHighestPriorityItem(){return highestPriorityItem;}
  //public int getNumAssignments(){return 0;}
  //public int getNumComplete(){return 0;}
  //public int getHoursAvailable(){return 0;}
  //public double getTotalPoints(){return 0.0;}
  
  public String toString(){

    return "======================\n"
     + "-----TODAY'S PLAN-----\n"
     + "----------------------\n"
     + "Priority:"+getHighestPriorityItem()+"\n"
     + "Assignments:"+getNumAssignments()+"\n"
     + "Completed:"+getNumComplete()+"\n"
     + "Hours Avail:"+getHoursAvailable()+"\n"
     + "Tot. Points:"+getTotalPoints()+"\n";
           
  }
  

   public AssignPlan(){   
  }
  

 public AssignPlan(int numAssigns){   
     numAssignments = numAssigns;
  }
  
  
  //Question 2. Implement an alternate constructor for DailySchedule
  
   public AssignPlan(String hPriorityItem, int nAssigns, int nComplete, int hAvailable, double tPoints){
         //complete this constructor
       
       
    //public setNumAssignments(int numAssignments) {
    this.numAssignments = nAssigns;
    //}

    //public setNumComplete(int numComplete) {
    this.numComplete = nComplete;
    //}

    //public setTotalPoints(double totalPoints) {
    this.totalPoints = tPoints;
    //}

    //public setHighestPriorityItem(String highestPriorityItem) {
    this.highestPriorityItem = hPriorityItem;
    //}
       
    //public hoursAvailable(String hoursAvailable) {
    this.hoursAvailable = hAvailable;
    //}
       
       
     
  }


    //Question 3.    Implement a mutator function to set the highestPriorityItem
  public void setPriorityTo(String aname){
    this.highestPriorityItem = aname;

  }
  
 
  
  public void handleUrgentAssignment (String name, int effort, int resources, int difficulty){
//Question 5.    Complete the getUrgentAssignment method of the AssignPlan object so that it
//        a.    Updates the highest priority item to the value of the incoming name
    highestPriorityItem = name;
       
       
    
//        b.    Creates an Assignment with knowledge of the difficulty, resources and effort
    
Assignment UrgentAssignment = new Assignment(name, effort, resources,difficulty);

//        c.    Increments the number of assignments in the AssignPlan by 1
    numAssignments++;
    
//        d.    Increments the number complete by 1
    numComplete++;

//        e.    Update the hoursAvailable by subtracting the effortHours
    hoursAvailable = hoursAvailable - effort;
//        f.    Update the total points by adding the points calculated on the assignment.
    totalPoints = totalPoints + UrgentAssignment.getscore();

    }
  
             
}



