package com.mycompany.resume;

import java.util.Properties;
import org.springframework.stereotype.Component;

@Component
class PropertyReader extends Thread {
    
    private String name;
    private Properties property;
    WorkWithFile wwf = new WorkWithFile();
    
    public PropertyReader(String name, Properties property)
    {
        this.name = name;
        this.property = property;
        this.start();
    }
    
    @Override
    public void run()
    {
        wwf.readFile(name, property);
        
    }
}
