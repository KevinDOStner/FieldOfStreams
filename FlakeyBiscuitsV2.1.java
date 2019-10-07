package FlakeyBiscuits;

import java.io.*;

/**
 *
 * @author noodles
 */
public class FlakeyBiscuits {

 
    public static void main(String[] args) throws FileNotFoundException, IOException{
        
     File file = new File("/home/noodles/NetBeansProjects/ValueDetective/xanado.csv");
     FileInputStream fis = new FileInputStream(file);
    InputStreamSplitter is  = new InputStreamSplitter(new FileInputStream(file));
        InputStreamSplitter is2 = is.split();
        InputStreamSplitter is3 = is.split();
        BufferedReader br2 = new BufferedReader(new InputStreamReader(is2));
        BufferedReader br3 = new BufferedReader(new InputStreamReader(is3));
        boolean match = false;
        int finalPipCT = 0;
        int lineCt = 1;
        int searchVal = 104;


   try{
       
     while (!match && (is.read() != -1)) {
             int garfield = br2.read();
             int odie = br3.read();
             if(garfield == searchVal){
                 match = true;
             }
             if(garfield == 10){
                 //   System.out.println("END HERE");
                    lineCt++;
                    finalPipCT = 0;
             }
              if(garfield == 124){
                 //    System.out.println("START HERE");
                  finalPipCT++;
             }
       
       

     
             
     System.out.println("Data1:"+ (garfield));
     System.out.println("Data2:           "+ (odie));
     
          }
     System.out.println("X Value: " + finalPipCT);
     System.out.println("Y Value: " + lineCt);

   }
    catch(Exception e){
        
        System.out.println("Fail");
        System.out.println(e);
    }
    
    
}
}
