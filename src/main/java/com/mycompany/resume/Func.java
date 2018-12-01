package com.mycompany.resume;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

public class Func {
       Properties property = new Properties();
       Properties property1 = new Properties();
       Properties property2 = new Properties();
       ArrayList<String> resum = new ArrayList<>();
       ArrayList<String> html = new ArrayList<>();    
       String text="";
       WorkWithFile wwf = new WorkWithFile();

       PropertyReader pr = new PropertyReader("person.properties", property2);
       PropertyReader pr1 = new PropertyReader("person1.properties", property1);
       
       public void func() throws IOException, InterruptedException
       {
       
       wwf.createFile();

        Thread.sleep(200);
        property.putAll(property1);
        property.putAll(property2);
        System.out.println("Основной проперти " + property + " записей " + property.size());
        System.out.println(property1 + " записей " + property1.size());
        System.out.println(property2 + " записей " + property2.size());

        ModelProperty mp = new ModelProperty(property);
        
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
