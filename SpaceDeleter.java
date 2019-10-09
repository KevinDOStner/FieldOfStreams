/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author noodles
 */
public class SpaceDeleter{

    /**
     * @param args the command line arguments
     */
    
public static void main(String[] args) throws IOException {
       FileReader fr = new FileReader("/home/noodles/Aspose/natso"); 
        BufferedReader br = new BufferedReader(fr); 
        FileWriter fw = new FileWriter("/home/noodles/Aspose/noodleboy.txt"); 
        String line;
        String line2;

        int lineNum = 0;
        while((line = br.readLine()) != null)
        { 
            //check if we are working with the first two lines 
            //(which should remain untouched)
            if (lineNum > 1) {
                //make sure we ignore any empty lines
                if (line.trim().length() > 0) {
                    //add a space to the end of each line to make 
                    //padding before we append the next line.
                    line=line.trim().replaceAll("\\s+", "") + "";
                    line2=line.trim().replaceAll("\\s+\\s","");
                }
            } else {
                //remove all whitespace.
                line = line.trim().replaceAll("\\s+", "");
                line = line + "\n";
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
    
