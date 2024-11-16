/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package assignment.st10024150_lesegogamede_poetask1;

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author Lesego
 */
 public class login {
                    

                  public static String userName;
                  public static String passWord;
                  public static int noTask;
                  public static int taskDuration;
                  
             public static  int noOfTask=0;
             public static String[] DD;
              public static String[] CC;
              public static String[] TS;
              public static String[] TN;
              public static int [] TDuration;
              public static String[] DD2;
              public static String[] CC2;
              public static String[] TS2;
              public static String[] TN2;
              public static int [] TDuration2;
                  

    public static void main(String[] args) {
                  Scanner myObj = new Scanner(System.in);
                  Task kanban =new Task();
                   Scanner obj =new Scanner(System.in);
                   Task3 ghost=new Task3();
                 // TaskFeature hours=new TaskFeature();
                     StringBuilder taskName =new StringBuilder();
                     StringBuilder taskDescription = new StringBuilder();
                     StringBuilder developerDetails = new StringBuilder(); // 
                    // StringBuilder taskNo=new StringBuilder();
                     StringBuilder taskStatus = new StringBuilder();
                     StringBuilder conclusion = new StringBuilder();
                     
              
              
              
             
                
                     
         
                
                     
                  int numTask=1;
              
                  int taskDuration=0;
               
 
           System.out.println("Enter your name:");
            String name=myObj.nextLine();
            
            System.out.println("Enter your Surname:");
            String surname = myObj.nextLine();
            
            System.out.println("enter your username:");
            userName = myObj.nextLine();
            if (checkUserName(userName)){
                
            }else {
                System.out.println("incorrect format");
            }
            
            
           System.out.println("Enter your Password:");
            passWord = myObj.nextLine();
           if (checkPassWord(passWord)){
               
           }else{
               System.out.println("incorrect format");
           }
           registerUser(userName,passWord);
           
           System.out.println("welcome"+" "+userName);
           System.out.println("enter your username:");
           String username2= myObj.nextLine();
       
           
            System.out.println("Enter your Password:");
             String passWord2= myObj.nextLine();
             loginUser(username2,passWord2);
             if (returnStatus(username2,passWord2)){ // calling the return status method
                    System.out.println("sucessfully logged in");
                   
             }else{
                 System.out.println("log in failed");
             }
                
             if (loginUser( username2,passWord2)){
                      boolean prompt2;
                      boolean prompt;      
                while (prompt=!false){
                    
                    
                    
                         
                         int i=0;
                         int num=0;
                          int ot=Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                                    welcome to EasyKanban
                                                                                    1) add task 
                                                                                    2)show report
                                                                                    3)quit"""));
                 if (ot==1){
                                  
                      noTask= Integer.parseInt(JOptionPane.showInputDialog("how many tasks do you wanna add?"));
           noOfTask+=noTask;
            DD=new String[noOfTask];
            CC=new String[noOfTask];
            TS=new String[noOfTask];
            TN=new String[noOfTask];
            TDuration=new int [noOfTask];
            

                    
                     for (int p=0;p< noTask;p++){
                         
                         //i++;
                     
                         num ++;
                         
                         
                         taskName.append(JOptionPane.showInputDialog("enter Task "+numTask+ " name:"));
                         
                         
                         taskDescription.append(JOptionPane.showInputDialog("enter task Description:"+"(ensure that you have less than 50 characters)"));
                       
                         taskDuration = Integer.parseInt(JOptionPane.showInputDialog("enter task Duration:"));
                       
                         developerDetails.append(JOptionPane.showInputDialog("enter developer details:"));
                         
                         int userOption= Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                      1)to do
                                                                                      2)done
                                                                                      3)doing
                                                                                      """));
                         //String taskStatus="";
                         if (userOption==1){
                            taskStatus.append("To do");
                        
                         }
                         if (userOption==2){
                             taskStatus.append("Done");
                         }
                         if(userOption==3){
                            taskStatus.append("Doing");
                         }
                        
                         JOptionPane.showMessageDialog(null, Task.printTaskDetails(developerDetails, taskDescription,taskDuration,taskStatus ,taskName, num,conclusion));// prints out summary of the task
                         for (int t=0;t==numTask;t++){
                             kanban.total += taskDuration;
                         }
                          
                           JOptionPane.showMessageDialog(null,"total hours "+ kanban.returnTotalHours(taskDuration));
                           
                           String holdThis1 = developerDetails.toString();
                           
                           String holdThis3 = taskStatus.toString();
                           String holdThis4 = taskName.toString();
                           String holdThis5 = conclusion.toString();
                           
                             DD[p]=holdThis1;
                             TS[p]=holdThis3;
                             TN[p]=holdThis4;
                             CC[p]=holdThis5;
                             TDuration[p]=taskDuration;
                             
                            
                             
                           taskDescription.delete(0,taskDescription.length());
                           developerDetails.delete(0,developerDetails.length());
                           taskName.delete(0,taskName.length());
                           taskStatus.delete(0,taskStatus.length());
                           conclusion.delete(0,conclusion.length());

                           
                        numTask++;
                         
                     }
                    
                       
                        
                 } 
                           if (ot==2){
                               while(prompt2=!false){
                           int  showReportFeature= Integer.parseInt(JOptionPane.showInputDialog(null,"""
                                                                                                     what do you want to do today?
                                                                                                     1)search for tasks with status of done?
                                                                                                     2)display longest duration?
                                                                                                     3)search for a task?
                                                                                                     4)search for a developer assigned with a task
                                                                                                     5)delete a task ?
                                                                                                     6)Display a report
                                                                                                     7)Go back to main menu
                                                                                                     """));
                           if (showReportFeature==1){
                               String pick=JOptionPane.showInputDialog("enter task status");
                               
                                          JOptionPane.showMessageDialog(null,Task3.statusOfDone( DD, TN, TDuration,TS, pick));        
                           }
                           if (showReportFeature==2){
                            
                               JOptionPane.showMessageDialog(null,Task3.longestDuration(DD, TN, TDuration, TS ));
                           }
                           if(showReportFeature==3){
                           String taskSearch=JOptionPane.showInputDialog("enter task Name:");
                            
                                   JOptionPane.showMessageDialog(null,Task3.searchTaskName(DD,TN, TDuration,TS,taskSearch));  
                           }
                           if(showReportFeature==4){
                           String DevSearch=JOptionPane.showInputDialog("enter Developer:");
                                JOptionPane.showMessageDialog(null,Task3.searchDeveloper( DD, TN,TDuration, TS,DevSearch));
                           }
                            
                           if(showReportFeature==5){
                              String TaskSearch=JOptionPane.showInputDialog("enter Task Name:");
                                Task3.deleteTask( DD2,TN2, TDuration2,TS2, TaskSearch,TN);
                              
                           }
                           
                           if(showReportFeature==6){
                 
                              
                                  JOptionPane.showMessageDialog(null,Task3.displayReport(DD, TN, TDuration, TS));
                              
                               
                           }
                           
                            if (showReportFeature==7){
                               prompt2=false;
                               break;
                               
                           }
                        }
                             
                               
                           }
                        if (ot==3){
                            prompt=false;
                            System.exit(0);
                        }        
             } 
                
             }
    }
   public static boolean returnStatus(String username2,String passWord2){
       //checks if  the username and password is the correct one
      
    if (loginUser(username2,passWord2)== true){
        return true;
    }else{
       return false;
    }
    
   }
    public  static boolean checkUserName( String userName){
        // checks the username complexity
       boolean userComplex=false;
       if (userName.contains("_") && userName.length() <= 5){
           userComplex=true ;
        
       }else{
           userComplex=false;
       }
       if (userComplex ==true ){
     
        return true;
       }
       else{
           return false;
       }
    }
        
    
    
    public static String registerUser(String userName,String passWord){
        //checks if the username and password are entered correctly
           
            if (checkUserName(userName) && checkPassWord(passWord)==true){
               
               return ("captured");
            }else {
                return ("incorrect format");
            }    
            
    }

        public static boolean loginUser(String username2 ,String passWord2 ){
            //checks if username and password is the same as regisitration
            
            if (username2.equals(userName) && passWord2.equals(passWord)){
              return true;
          
            }else {
                
                return false;
            }
 
        }
    
     public static boolean checkPassWord(String passWord){
    
                 /* changing password from strings to a ascii values
                    then storing it in a array.
                 */
                    int count = 8;
                int[] val = new int [count];
                    for (int i =0 ; i < passWord.length();i++){
                           val[i] = (int) passWord.charAt(i);
                          
                           
             
                    }
                           
                            boolean  checkCaps= false; // checking password complexity
                            boolean checkNum = false;
                            boolean checkSpecial= false;
                            
                            
                            
                        for (int i=0 ;  i < val.length;i++){
                            
                            
                                if (val[i] >= 65 && val[i] <= 90){             
                                                                
                                    checkCaps=true;
                                }
                                else if (val[i] >= 48 && val[i] <=57 ){
                                    checkNum = true;
                                }
                                else if (val[i] >= 33 && val[i] <=47 || val[i] >= 123 
                                        && val[i] <= 126 || val[i] >= 91 && val[i] <= 96
                                        || val[i] >= 58 && val[i] <= 64){
                                    checkSpecial = true;
                                   
                       }
                                
                        }
                        if (val.length >= count ){
                                return true;
                            }
                        else{
                           
                        }
                    
                          if (checkCaps){
                                   return true;
                                }else{
                          
                          }
                                if  (checkSpecial){
                                    return true;
                          }else {
                                
                                }
                                if (checkNum){
                                   return true;
                                }
                                else{
                                   
                                }
                                return true;
     }
        
     
}   

