package cellsniffer;


import java.io.*;
import java.io.File;

class CellSniffer{

    public static void main (String[] args) throws FileNotFoundException, IOException{

        File file = new File("/home/noodles/NetBeansProjects/JavaApplicationTest/xanadu.csv");
        FileInputStream fis = 
                new FileInputStream(file);
   try{
        int sippyStraw = fis.read();
        int pipeCtr = 0;
        int finalPipCT = 0;
        int lineCt = 0;
        int pipLineCT = 0;
        int totalCharCT = 0;

      while((sippyStraw=fis.read())!=-1){
        
            int mouth = sippyStraw;
            int bigGulp = sippyStraw;
            if(mouth == 10)
            {
                lineCt++;
                pipLineCT = 0;
            }
            if(bigGulp == 124)
            {
                pipeCtr++;;
                pipLineCT++;
            }
            finalPipCT = pipeCtr;
            System.out.println("Data: " + sippyStraw + "\t" + (char)sippyStraw);
            totalCharCT++;
            
       
      }
      System.out.println("Total | in file: "+ finalPipCT );
      System.out.println("Total lines in file: "+ lineCt );
      System.out.println("Total lines in line: "+ pipLineCT );
      System.out.println("Total characters in file:" + totalCharCT);
    
   }        
    catch(Exception e){
       System.out.println("Somethings broke");
                        }
}
}



