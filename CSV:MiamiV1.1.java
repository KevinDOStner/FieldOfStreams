/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvmiami;

import java.io.*
import java.util.Scanner

/**
 *
 * @author noodles
 */
public class CSVmiami {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           String text = "|a|b|c|\n" + 
                "|d|e|f\n" + 
                "|g|h|i|j|";
    int lineCt = 1;
    int finalPipCT = 0;
    int searchVal = 104;

    for(int i = 0; i < text.length() && text.charAt(i) != 'h'; i++) {
  //  while (Scanner.hasNextByte() && (Scanner.nextByte() != searchVal)) {
        int byteVal = (byte) text.charAt(i);

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
    
}
