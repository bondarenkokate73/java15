package main.java.com.mycompany.resume;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

public class JavaApplication1 {

    public static void main(String[] args) throws IOException 
    {
       Properties property = new Properties();
       ArrayList<String> resum = new ArrayList<>();
       ArrayList<String> html = new ArrayList<>();    
    //   HashMap<String, String> massive = new HashMap();
       String text="";
       
       WorkWithFile wwf = new WorkWithFile();
       wwf.createFile();
       wwf.readFile(property);
                
       ModelProperty mp = new ModelProperty(property);
//       mp.setFIO("Бондаренко Екатерина Сергеевна");
//       wwf.saveProp(mp.newProp());
       
       ValueFromProp vfp = new ValueFromProp(resum, property, mp);
       resum = vfp.value(resum, property, mp);

       GenerateHtml genHTML = new GenerateHtml(resum);
       html = genHTML.generateHtml(resum,html);
       
       int j=0;
       for (int i=0; i<html.size()-1; i++)
       {
               text = text + html.get(i) + resum.get(j);
               j++;
       }
       wwf.writeFile(text);
       wwf.openFile(); 
    }
    }

        

        
  
