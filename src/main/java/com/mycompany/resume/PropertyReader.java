package main.java.com.mycompany.resume;

import com.oracle.webservices.internal.api.message.PropertySet.Property;
import java.util.Properties;

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
    
    public void run()
    {
        wwf.readFile(name, property);
        
    }
}
