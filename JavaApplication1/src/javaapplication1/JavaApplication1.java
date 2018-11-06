package javaapplication1;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.*;
import java.util.ArrayList;
import java.util.Properties;

public class JavaApplication1 {

    public static void main(String[] args) throws IOException 
    {
       Properties property = new Properties();
       ArrayList<String> resum = new ArrayList<>();       
       
       WorkWithFile wwf = new WorkWithFile();
       wwf.createFile();
       wwf.readFile(property);
                
       ModelProperty mp = new ModelProperty(property);
       mp.setFIO("Бондаренко Екатерина Сергеевна");
       wwf.saveProp(mp.newProp());
       
       ValueFromProp vfp = new ValueFromProp(resum, property, mp);
       vfp.value(resum, property, mp);

       GenerateHtml genHTML = new GenerateHtml(resum);
       String text = genHTML.generateHtml(resum);
        
       wwf.writeFile(text);
       wwf.openFile(); 
    }
    }

        

        
  
