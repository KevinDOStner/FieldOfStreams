package FlakeyBiscuits;

import java.io.*;

/**
 *
 * @author noodles
 */
public class FlakeyBiscuits {

 
    public static void main(String[] args) throws FileNotFoundException, IOException{
        
     File file = new File("/home/noodles/NetBeansProjects/JavaApplicationTest/xanadu.csv");
     FileInputStream fis = new FileInputStream(file);
    InputStreamSplitter is  = new InputStreamSplitter(new FileInputStream(file));
        InputStreamSplitter is2 = is.split();
        InputStreamSplitter is3 = is.split();
        BufferedReader br2 = new BufferedReader(new InputStreamReader(is2));
        BufferedReader br3 = new BufferedReader(new InputStreamReader(is3));
        boolean match = false;


   try{
         int x = 0;
      
      
      
//  while((br2.readLine()) != null && (br3.readLine()) !=null) {
 String line;
     while (!match && (is.read() != -1)) {
             char garfield = (char) br2.read();
             char odie = (char) br3.read();
      
      System.out.println("Data1:"+ (garfield));
      System.out.println("Data2:           "+ (odie));
     
           }

   }
    catch(Exception e){
        
        System.out.println("Fail");
        System.out.println(e);
    }
    
    
}
}
