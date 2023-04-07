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



public class Tester {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine().trim());
        for(int test =0; test<t; test++)
        {
            try {
              AssignPlan aplan= new AssignPlan();
              String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
              if (firstMultipleInput.length ==5)
              {
                
                String highestPriorityItem = firstMultipleInput[0];
                int numOutStanding = Integer.parseInt(firstMultipleInput[1]);
                int numComplete = Integer.parseInt(firstMultipleInput[2]);
                int hoursAvailable = Integer.parseInt(firstMultipleInput[3]);
                double totalPoints = Double.parseDouble(firstMultipleInput[4]);
                AssignPlan a = new AssignPlan(highestPriorityItem,numOutStanding,numComplete,hoursAvailable,totalPoints);
                aplan = a;
              }
              if (firstMultipleInput.length ==1)
              {
                int numOutStanding = Integer.parseInt(firstMultipleInput[0]);
                AssignPlan a = new AssignPlan(numOutStanding);
                aplan = a;
              }
              String aname = bufferedReader.readLine();
              if (aname.length() >0)
                   aplan.setPriorityTo(aname);
              int assigns = Integer.parseInt(bufferedReader.readLine().trim());
              for (int anum=0; anum<assigns;anum++)
              {
              String secondInput= bufferedReader.readLine();
                
                if (!(secondInput==null))
                {
                String[] secondMultipleInput = secondInput.replaceAll("\\s+$", "").split(" ");
                if (secondMultipleInput.length ==4)
                {
                     String uaname = secondMultipleInput[0];
                     int effort = Integer.parseInt(secondMultipleInput[1]);
                     int resources = Integer.parseInt(secondMultipleInput[2]);
                     int difficulty = Integer.parseInt(secondMultipleInput[3]);
                     aplan.handleUrgentAssignment(uaname, effort, resources, difficulty);
                    
                  
                }
                
                }
              }//for anum
                
                 System.out.println(aplan.toString());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
      
     bufferedReader.close();
    }
}
