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
        boolean match = false;


   try{
         int x = 0;
      
      
      
//  while((br2.readLine()) != null && (br3.readLine()) !=null) {
 String line;
     while (!match && ((line = br2.readLine()) != null)) {
      sherlock = br2.read();
     // moriarty = br3.read();
      
      System.out.println("Data1:"+ (sherlock));
      System.out.println("Data2:           "+ (moriarty));
     
           }
   System.out.println(br2.markSupported());
   System.out.println(br3.markSupported());

   }
    catch(Exception e){
        
        System.out.println("Fail");
        System.out.println(e);
    }
    
    
}
}
