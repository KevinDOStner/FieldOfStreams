
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author noodles
 */
public class BufferedStreamFork {
    
    static void BuffForkStream() throws FileNotFoundException, IOException {

        File file = new File("xanadu.csv");
        FileInputStream fis = new FileInputStream(file);
         InputStreamSplitter is  = new InputStreamSplitter(new FileInputStream(file));
        InputStreamSplitter is2 = is.split();
        InputStreamSplitter is3 = is.split();
        BufferedReader sherlock = new BufferedReader(new InputStreamReader(is2));
        BufferedReader watson = new BufferedReader(new InputStreamReader(is3));
        
        while(sherlock.readLine() != null){
        
            System.out.println("Sherlock: "+ sherlock);
            System.out.println("Watson: "+ watson);
        
    }
    }
}
        
      

    
    

