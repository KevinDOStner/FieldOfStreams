package FlakeyBiscuits;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author noodles
 */
    public class PipeLineCount{
        public static int finalPipCT;
        public static int lineCt;
        public static boolean match;

   
        public PipeLineCount(int finalPipCT, int lineCt, boolean match){
            this.finalPipCT = finalPipCT;
            this.lineCt = lineCt;
            this.match = match;
        }
   
        public PipeLineCount CheckEm() throws IOException{
            while(!match && (Flow.fis.read() != -1)){
            int garfield = Flow.br2.read();

             if(garfield == Biscuit.searchVal){
                 match = true;
             }
             if(garfield == 10){
                    lineCt++;
                    finalPipCT = 0;
             }
              if(garfield == 124){
                  finalPipCT++;
             }
       
            }
            
           return new PipeLineCount(finalPipCT,lineCt,match);
        }
       
}
