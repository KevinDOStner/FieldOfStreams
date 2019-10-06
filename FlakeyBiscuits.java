/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlakeyBiscuits;

import java.io.*;

/**
 *
 * @author noodles
 */
public class FlakeyBiscuits {

    private static Object sherlock;
    private static int moriarty;

 
    public static void main(String[] args) throws FileNotFoundException, IOException{
        
     File file = new File("/home/noodles/NetBeansProjects/JavaApplicationTest/xanadu.csv");
     FileInputStream fis = new FileInputStream(file);
    InputStreamSplitter is  = new InputStreamSplitter(new FileInputStream(file));
        InputStreamSplitter is2 = is.split();
        InputStreamSplitter is3 = is.split();
        BufferedReader br2 = new BufferedReader(new InputStreamReader(is2));
        BufferedReader br3 = new BufferedReader(new InputStreamReader(is3));
        


   try{
         int x = 0;
      sherlock = br2.read();
      moriarty = br3.read();
       int line = 0;

      
      
  while((br2.readLine()) != null) {
      
      line = br2.read();
      System.out.println("Data: "+ sherlock);
        
           }
  br2.close();
  br3.close();

   }
    catch(Exception e){
        
        System.out.println("Fail");
    }
    
    
}
}