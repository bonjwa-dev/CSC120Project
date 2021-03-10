//CSC120Project1
import java.util.Scanner; 
import javax.swing.JOptionPane;
import javax.swing.JDialog;
import java.util.*;
import java.io.*;

public class project_mark_moreira {
   public static void main(String[] args)
      {
      
     String GpuSpeed, CpuSpeed, CpuCores;
     double ResMulti = 0;
            
     GpuSpeed = 
         JOptionPane.showInputDialog("What is your GPU Speed in Megahertz");
           int GpuSpeednum=Integer.parseInt(GpuSpeed);
           
      CpuSpeed = 
         JOptionPane.showInputDialog("What is your CPU Speed in Megahertz");
           int CpuSpeednum=Integer.parseInt(CpuSpeed);
           
       CpuCores = 
         JOptionPane.showInputDialog("How many Cores does your CPU have?");
           int CpuCoresnum=Integer.parseInt(CpuCores);

     
      String[] screenReso = { "1280 x 720", "1920 x 1080", "2560 x 1440", "3840 x 2160"};
    String Resinput = (String) JOptionPane.showInputDialog(null, "Select down below.",
        "Select Screen Resolution.", JOptionPane.QUESTION_MESSAGE, null,     
                
        screenReso, // Array of choices
        screenReso[1]); // Initial choice  
        
        
        if (Resinput == ("1280 x 720")){
            ResMulti = 1 ; 
     
      } else if (Resinput == ("1920 x 1080")){
            ResMulti = .75 ;
      
      } else if (Resinput == ("2560 x 1440")){
            ResMulti = .55 ;
      
      } else if (Resinput == ("3840 x 2160")){
            ResMulti = .35 ; 
       
}

      double CompScore = ((5*GpuSpeednum)+(CpuCoresnum*CpuSpeednum))*ResMulti;
      

 String ReccGraph = null;
    
    if (CompScore > 17000){
         ReccGraph = "Ultra" ;
         
      } else if (17000>=CompScore && CompScore>15000){
         ReccGraph = "High" ;
         
      } else if (15000>=CompScore && CompScore>13000){
         ReccGraph = "Medium" ;
         
      } else if (13000>=CompScore && CompScore>11000){
         ReccGraph = "Low" ;
      
      } else if (CompScore<=11000) {
         ReccGraph = "Unable to Play";
         
       }


        
             
    String CHGQRT = "Computer Hardware Graphics Quality Recommendation Tool";
        
        JOptionPane.showMessageDialog(null, "GPU Clock Speed: " + GpuSpeednum + "\n" + 
                                      "CPU Clock Speed: " + CpuSpeednum + "\n" +
                                      "Number of Cores: " + CpuCoresnum + "\n" +
                                      "Monitor Resolution: " + Resinput + "\n" +
                                      "Performance Score: " + CompScore + "\n" +
                                      "Recommended Graphics Quality: " + ReccGraph,
                                       CHGQRT, JOptionPane.QUESTION_MESSAGE);
                                    
        
       
         System.exit(0);
     }
     
    }