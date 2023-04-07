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



public class Assignment {
     //Question 4.
  
      //The Assignment class will privately store information on the effort (hours required to complete)(int), the number of resources to be referenced (int), the estimated difficulty(int), and the expected score(double). 
    
      private int effort;
      private int resources;
      private int difficulty;
      private double score;
      private String name;
      
      
      //Create a constructor for an Assignment, that accepts the name, effort, resources and difficulty. The constructor then evaluates and stores the expected score of the asignment,
      
      public Assignment(String name, int effort, int resources, int difficulty) {
          
          this.effort = effort;
          this.resources = resources;
          this.difficulty = difficulty;
          this.score = estScore();
      }
  
      public double estScore(){
          return Math.round( 0.1 * (effort * difficulty + ((resources * effort)*(resources * effort)) / (Math.PI * Math.sqrt(difficulty))) * 10 ) /10.0;
      }
          
  
  
      
      
      //The Assignment returns accessors for all private variables
      
      public int geteffort() {
      return effort;
      }
      
      public int getresources() {
      return resources;
      }
      
      public int getdifficulty() {
      return difficulty;
      }
      
      public double getscore() {
      return score;
      }
      
      public String getname() {
      return name;
      }
    
}
