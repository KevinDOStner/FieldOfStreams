package FlakeyBiscuits;

import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
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
public class Biscuit{
    
    public static File file;
    public static int searchVal;
    
    public Biscuit(File file, int searchVal){
        this.file = file;
        this.searchVal = searchVal;
    }
    public Biscuit bakeBiscuit(){
     String input = JOptionPane.showInputDialog(System.in);
     int searchVal = Integer.valueOf(input);
     String inputFile = JOptionPane.showInputDialog(System.in);
     File file = new File(inputFile);
     
     return new Biscuit(file, searchVal);
    }
    }
