
package FlakeyBiscuits;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/**
 *
 * @author noodles
 */
public class Flow {

    public static BufferedReader br2;
    public static BufferedReader br3;
    public static FileInputStream fis;
    
    public Flow(BufferedReader br2, BufferedReader br3, FileInputStream fis){
        this.br2 = br2;
        this.br3 = br3;
        this.fis = fis;
    }
    
    public static Flow ForkFlow() throws FileNotFoundException
    {
        
    File file = Biscuit.file;
    FileInputStream fis = new FileInputStream(file);
     FlakeyBiscuits.InputStreamSplitter is  = new FlakeyBiscuits.InputStreamSplitter(new FileInputStream(file));
     FlakeyBiscuits.InputStreamSplitter is2 = is.split();
        FlakeyBiscuits.InputStreamSplitter is3 = is.split();
     BufferedReader br2 = new BufferedReader(new InputStreamReader(is2));
     BufferedReader br3 = new BufferedReader(new InputStreamReader(is3));
    
     
     return new Flow(br2, br3, fis);
      
    }
}  

    

