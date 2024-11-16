/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.st10024150_lesegogamede_poetask1;

import static assignment.st10024150_lesegogamede_poetask1.login.DD;
import static assignment.st10024150_lesegogamede_poetask1.login.TDuration;
import static assignment.st10024150_lesegogamede_poetask1.login.TS;
import javax.swing.JOptionPane;

/**
 *
 * @author Lesego
 */
public class Task {
    
  
    
   public  int total=0;
    public int value(){
        return total;
    }
        
          public static boolean checkTaskDescription(StringBuilder taskDescription ){
             //this method checks the description
              if (taskDescription.length( )<=50){
                 return true;
              
              }else{
                  return false;
          }
          }
          
          int num=0;
          public static String  createTaskID(StringBuilder taskName,StringBuilder developerDetails,int num ){
              // creates a product id
              
                String id= taskName.substring(0,2)+":"+num+":"+ developerDetails.substring(developerDetails.length()-3,developerDetails.length());
                return id.toUpperCase();
          }
          public static String printTaskDetails(StringBuilder developerDetails,StringBuilder taskDescription,int taskDuration,StringBuilder taskStatus ,StringBuilder taskName,int num,StringBuilder conclusion){
            //print out the task
           conclusion.append("Task name: ").append(taskName).append("\n Task description: ").append(taskDescription).append("\n task duration:").append(taskDuration).append("\n developer Details: ").append(developerDetails).append("\n task status:").append(taskStatus).append("\n task id: ").append(createTaskID(taskName,developerDetails,num ));
           String summary= conclusion.toString();
           return summary;
            
          }
          public  int returnTotalHours(int taskDuration ){
             total +=taskDuration; // calculating total hours
              return total;
          }
 
      
        }
        
    
    
    

