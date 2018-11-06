
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

        ArrayList<String> dictionary = new ArrayList<String>();
        dictionary.add("FIO");
        dictionary.add("DOB");
        dictionary.add("email");
        dictionary.add("Skype");
        dictionary.add("avatar");
        dictionary.add("target");
        dictionary.add("experience");
        dictionary.add("education");
        dictionary.add("courses");
        dictionary.add("skills");
        dictionary.add("code");
        
        WorkWithFile wwf = new WorkWithFile();
        wwf.createFile();
        wwf.readFile(property);
        
        ModelProperty mp = new ModelProperty(dictionary, property);
        mp.setSkype("kliffoss");

        ValueFromProp vfp = new ValueFromProp(dictionary, property);
        dictionary  = vfp.value(dictionary, property);

       GenerateHtml genHTML = new GenerateHtml(dictionary);
       String text = genHTML.generateHtml(dictionary);
        
       wwf.writeFile(text);
       wwf.openFile();
        
    }
    }

        

        
  
