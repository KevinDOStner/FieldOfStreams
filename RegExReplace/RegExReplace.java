/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author noodles
 */
public class JavaApplication11{

    /**
     * @param args the command line arguments
     */
    
    
public static void main(String[] args) throws IOException {
       FileReader fr = new FileReader("/home/noodles/Aspose/outfile4.txt"); 
        BufferedReader br = new BufferedReader(fr); 
        FileWriter fw = new FileWriter("/home/noodles/Aspose/outfileGOLD5.txt"); 
        String line;
        String line2;

        int lineNum = 0;
        while((line = br.readLine()) != null)
        { 
            //check if we are working with the first two lines 
            //(which should remain untouched)
            if (lineNum >= 0) {
                //make sure we ignore any empty lines
                if (line.trim().length() >= 0) {
                    //add a space to the end of each line to make 
                    //padding before we append the next line.
                     line = line.trim().replaceAll("([N][o][n][e]|[0]|[|]|[0-9]|[.]|[:]|[-])", "");
                //     line = line.trim().replaceAll("([a-z])(?=[A-Z])");
                     
                }
            } else {
                //remove all whitespace.
                line = line.trim().replaceAll("\\s", "");
               
               line = line + "\r";
             //   line = Arrays.toString(line.split("([a-z])(?=[A-Z])", 0));
             
            }
            fw.write(line);
            lineNum++;
        }
        fr.close();
        fw.close();
}
}
         
 //       System.out.println("X Value: " + finalPipCT);
 //    System.out.println("Y Value: " + lineCt);
    
