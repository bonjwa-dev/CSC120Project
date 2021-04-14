//CSC120Project1
import java.util.Scanner; 
import javax.swing.JOptionPane;
import javax.swing.JDialog;

public class project_mark_moreira {
   public static void main(String[] args)
      {
       String GpuSpeed, CpuSpeed, CpuCores, NumComputers, input;
         double ResMulti = 0, count;
             double MaxCompScore = 0, MinCompScore = 0;
               String CHGQRT = "Computer Hardware Graphics Quality Recommendation Tool";
     
   
     NumComputers=
         JOptionPane.showInputDialog("How many computers will you be testing?");
            int NumComputersInt=Integer.parseInt(NumComputers);
            
               while (NumComputersInt <= 0)
            {
                  NumComputers=
                     JOptionPane.showInputDialog("Cannot accept less than zero, please try again.");
                         NumComputersInt=Integer.parseInt(NumComputers);
                     }
                     
         JOptionPane.showMessageDialog(null,CHGQRT);
                                 
       for (count = 1; count <= NumComputersInt; count++)
       {

       
            GpuSpeed = 
               JOptionPane.showInputDialog("What is your GPU Speed in Megahertz");
                 int GpuSpeednum=Integer.parseInt(GpuSpeed);
                 
                 while (800>=GpuSpeednum || GpuSpeednum>=2000)
             {
                    GpuSpeed=
                     JOptionPane.showInputDialog("Select a Clock Speed Between 800 and 2000 Mhz.");
                         GpuSpeednum=Integer.parseInt(GpuSpeed);
                  }
                 
            CpuSpeed = 
               JOptionPane.showInputDialog("What is your CPU Speed in Megahertz");
                 int CpuSpeednum=Integer.parseInt(CpuSpeed);
                     
                 while (1000>=CpuSpeednum || CpuSpeednum>=5500)
             {
                    CpuSpeed=
                     JOptionPane.showInputDialog("Select a Clock Speed Between 1000 and 5500 Mhz.");
                         CpuSpeednum=Integer.parseInt(CpuSpeed);
                  }

                 
            CpuCores = 
               JOptionPane.showInputDialog("How many Cores does your CPU have?");
                 int CpuCoresnum=Integer.parseInt(CpuCores);
                     
                 while (1>=CpuCoresnum || CpuCoresnum>=16)
             {
                    CpuCores=
                     JOptionPane.showInputDialog("Select a Core Value Between 1 and 16.");
                         CpuCoresnum=Integer.parseInt(CpuCores);
                  }

      
           
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
     
            if (CompScore > MaxCompScore) {
                  MaxCompScore = CompScore;
                }  
                              
            if (count==1) {
               MinCompScore = CompScore;
               }
                  
            if (CompScore < MinCompScore) {
                  MinCompScore = CompScore;
                }  
                        
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
      
      
              
                   
                       
              JOptionPane.showMessageDialog(null, "GPU Clock Speed: " + GpuSpeednum + "\n" + 
                                            "CPU Clock Speed: " + CpuSpeednum + "\n" +
                                            "Number of Cores: " + CpuCoresnum + "\n" +
                                            "Monitor Resolution: " + Resinput + "\n" +
                                            "Performance Score: " + CompScore + "\n" +
                                            "Recommended Graphics Quality: " + ReccGraph,
                                             CHGQRT, JOptionPane.QUESTION_MESSAGE);
                                             
                                             
                          
                                          
          } 
          
          JOptionPane.showMessageDialog(null,"Highest Score was : " + MaxCompScore + "\n" 
                                         + "Lowest Score was : " + MinCompScore);
       
         System.exit(0);
     }
     
    }