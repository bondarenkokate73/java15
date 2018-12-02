package com.mycompany.resume;

import com.mycompany.resume.api.GenerateHtml;
import com.mycompany.resume.api.ValueFromProp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class HtmlGenerator {
    
    WorkWithFile wwf = new WorkWithFile();
    private String name;
    private Properties property;
    private ArrayList<String> resum;
    private ArrayList<String> html;
    private ModelProperty mp;
    ApplicationContext context;
    
    public void HtmlGenerator(String name, ApplicationContext context)
    {
        this.name = name;
        this.context = context;
    }
    
    public void generate() throws IOException
    {
        String text = "";
        
        wwf.createFile();
         
        PropertyReader ps = context.getBean(PropertyReader.class,name,property);
        property = ps.read();
        
        mp = new ModelProperty(property);
        
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
