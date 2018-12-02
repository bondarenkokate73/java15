package com.mycompany.resume;

import java.util.Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class PropertyReader implements PropertyService//extends Thread 
{
    
    private String name;
    private Properties property;
    
    public PropertyReader(String name, Properties property)
    {
        this.name = name;
        this.property = property;
 //       this.start();
    }
    
    @Override
    public Properties read()
    {
       WorkWithFile wwf = new WorkWithFile();
       return wwf.readFile(name, property); 
    }

}
