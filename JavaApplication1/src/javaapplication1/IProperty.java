package javaapplication1;

import java.util.ArrayList;
import java.util.Properties;

public interface IProperty 
        {

           ArrayList<String> value (ArrayList<String> dictionary, Properties property);
    
        }

        class ValueFromProp implements IProperty
        {
            Properties property = new Properties();
            ArrayList<String> dictionary;
            
            ValueFromProp (ArrayList<String> dictionary, Properties property)
            {
                this.property = property;
                this.dictionary = dictionary;
            }
            
            public ArrayList<String> value(ArrayList<String> dictionary, Properties property){
                int sizeArr = dictionary.size();
                for (int i=0; i<sizeArr; i++)
                {
                    dictionary.set(i,property.getProperty(dictionary.get(i)));
                }
                        
                return dictionary;
            }
        }
