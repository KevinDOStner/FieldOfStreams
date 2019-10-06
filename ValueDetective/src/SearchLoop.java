/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvmiami;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CSVmiami {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        //String searchval = "";
        //String filepath = "";
        
    try{   
    int lineCt = 1;
    int finalPipCT = 0;
    int searchValInt = Character.getNumericValue(searchVal);
    int i = 0;

    while (br2.read() != searchValInt){
        System.out.println("Data:  " + scan2);
       int byteVal;
        byteVal = (byte)scan2.nextByte(i);

        if(byteVal == 10) {
                lineCt++;
                finalPipCT = 0;
        }

        if(byteVal == 124) {
            finalPipCT++;
        }   
    }

    System.out.println("Total | in line: "+ finalPipCT );
    System.out.println("Total lines til value: "+ lineCt );
    }
    catch(Exception e){
        System.out.println(e);
    }
}
}
