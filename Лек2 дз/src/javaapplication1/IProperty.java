package javaapplication1;

import java.util.ArrayList;
import java.util.Properties;

public interface IProperty 
        {

           ArrayList<String> value (ArrayList<String> resum, Properties property, ModelProperty mp);
    
        }

        class ValueFromProp implements IProperty
        {
            Properties property = new Properties();
            ArrayList<String> resum = new ArrayList<>();
            ModelProperty mp = new ModelProperty(property);
            
            ValueFromProp (ArrayList<String> resum, Properties property, ModelProperty mp)
            {
                this.mp = mp;
                this.resum = resum;
                this.property = property;
            }
            
            public ArrayList<String> value(ArrayList<String> resum, Properties property, ModelProperty mp)
            {  
                resum.add(mp.getFIO());
                resum.add(mp.getDOB());
                resum.add(mp.getEmail());
                resum.add(mp.getSkype());
                resum.add(mp.getAvatar());
                resum.add(mp.getTarget());
                resum.add(mp.getExperience());
                resum.add(mp.getEducation());
                resum.add(mp.getCourses());
                resum.add(mp.getSkills());
                resum.add(mp.getCode());
                
                return resum;
            }
        }
