/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.st10024150_lesegogamede_poetask1;

import static assignment.st10024150_lesegogamede_poetask1.login.CC2;
import static assignment.st10024150_lesegogamede_poetask1.login.DD2;
import static assignment.st10024150_lesegogamede_poetask1.login.TDuration2;
import static assignment.st10024150_lesegogamede_poetask1.login.TN2;
import static assignment.st10024150_lesegogamede_poetask1.login.TS2;
import static assignment.st10024150_lesegogamede_poetask1.login.noOfTask;

/**
 *
 * @author Lesego
 */
 public class Task3 {
     
           public static String searchDeveloper(String [] DD,String [] TN,int[] TDuration,String [] TS,String pick){
               //this method shows all task done by a developer
            String dev="";
             for(int x=0;x<DD.length;x++){
                   if (pick.equals(DD[x])){
                            dev="Developer Name: "+DD[x]+"\n"+"Task Name: "+TN[x]+"\n"+"Task status: "+TS[x]+"\n";
                        }
                       }
           return dev;
        }
        public static String statusOfDone(String [] DD,String [] TN,int[] TDuration,String [] TS,String pick){
            //this method shows all tasks with a status of done
            String status="";
            for(int t=0;t<TS.length;t++){
                      if(TS[t].equals("Done")){
                            status+="Task Name: "+TN[t]+"\n"+"task Duration: "+TDuration[t]+" hours"+"\n Deveoper: "+DD[t]+"\n";
                                    }
                                    
               }
            return status;
        }
        public static String longestDuration(String [] DD,String [] TN,int[] TDuration,String [] TS ){
            // this methods shows the longest duration
             int highest=TDuration[0];
                            String time="";
                               int index=0;
                               for(int a=0;a<TDuration.length;a++)
                                if (TDuration[a]>highest){
                                    index=a;
                                    highest=TDuration[a];
                                }
                               time="Task Name: "+TN[index]+"\n"+"Developer: "+DD[index]+"\n";
                               return time;
        }
        
        public static String searchTaskName(String [] DD,String [] TN,int[] TDuration,String [] TS,String taskSearch){
            // this method searches for task and displays the task name,status and developer
                String task="";
            for(int z=0;z<TN.length;z++){
                                  if(taskSearch.equals(TN[z])){
                                   task="Task Name : "+TN[z]+"\n"+"Task status: "+TS[z]+"\n"+"Developer: "+DD[z];
                                  }
                              }
            return task;
        
        }
        public static  String deleteTask(String [] DD2,String [] TN2,int[] TDuration2,String [] TS2,String TaskSearch,String[]TN){
            // this method deletes a task
                                int g=0;
             DD2=new String[login.DD.length-1];
            CC2=new String[login.CC.length-1];
            TS2=new String[login.TS.length-1];
            TN2=new String[login.TN.length-1];
            TDuration2=new int [login.TDuration.length-1];
                                for(int e=0;e<TN.length;e++){
                                    if(!(TaskSearch.equals(TN[e]))){
                                        
                                        TS2[g]=login.TS[e];
                                        DD2[g]=login.DD[e];
                                        TN2[g]=login.TN[e];
                                        TDuration2[g]=login.TDuration[e];
                                        g++;
                                    
                                    }
                                }
                                    login.TN=TN2;
                                    login.TS=TS2;
                                    login.DD=DD2;
                                    login.TDuration=TDuration2;
                                                  
               String done="task deleted";
               return done;
        }
        
        public static String displayReport(String [] DD,String [] TN,int[] TDuration,String [] TS){
            //this method will displays the final report 
            String report="";
                               for(int v=0;v<login.TN.length;v++){
                                  report+="Task Name: "+login.TN[v]+"\n"+"Task Status: "+login.TS[v]+"\n"+"Developer Details: "+login.DD[v]+"\n"+"Task Duration: "+login.TDuration[v]+"\n";
                               
                               }
                               return report;
        }
    
}
