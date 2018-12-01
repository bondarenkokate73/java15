package com.mycompany.resume;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Properties;

public class ModelProperty 
{
    Properties property = new Properties();
    private HashMap<String, Integer> massive = new HashMap<String, Integer>();
    private String Skype;
    private String avatar;
    private String email;
    private String DOB;
    private String FIO;
    private String target;
    private String experience;
    private String education;
    private String courses;
    private String skills;
    private String code;
    
    public ModelProperty(Properties property)
    {      
        this.property = property;
        this.FIO = property.getProperty("FIO");
        this.DOB = property.getProperty("DOB");
        this.email = property.getProperty("email");
        this.Skype = property.getProperty("Skype");
        this.avatar = property.getProperty("avatar");
        this.target = property.getProperty("target");
        this.experience = property.getProperty("experience");
        this.education = property.getProperty("education");
        this.courses = property.getProperty("courses");
        this.skills = property.getProperty("skills");
        this.code = property.getProperty("code");
    }
    
    public String mas(String perem)
    {
        String text="";
        String[] temp;
        String[] temp1;
        if (perem != null)
        {
        temp = perem.split(",");
        for (int i=0; i<temp.length;i++)
        {
            temp1 = temp[i].split(":");
            massive.put(temp1[0], Integer.parseInt(temp1[1]));
        }
        
        massive = sortHashMapByValues(massive);

        for (HashMap.Entry<String, Integer> i : massive.entrySet())
        {
             text += "<li>" + i.getKey() + " - опыт: " + i.getValue() + " месяцев. </li>";
        }
        return text;
        }
        return "";
    }
    
    public LinkedHashMap<String, Integer> sortHashMapByValues(HashMap<String, Integer> passedMap) 
    {
    List<String> mapKeys = new ArrayList<>(passedMap.keySet());
    List<Integer> mapValues = new ArrayList<>(passedMap.values());
    Collections.sort(mapValues);
    Collections.reverse(mapValues);
    Collections.sort(mapKeys);
    
    LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

    Iterator<Integer> valueIt = mapValues.iterator();
    while (valueIt.hasNext()) 
    {
        Integer val = valueIt.next();
        Iterator<String> keyIt = mapKeys.iterator();

        while (keyIt.hasNext()) 
        {
            String key = keyIt.next();
            Integer comp1 = passedMap.get(key);
            Integer comp2 = val;

            if (comp1.equals(comp2)) 
            {
                keyIt.remove();
                sortedMap.put(key, val);
                break;
            }
        }
    }
 
    return sortedMap;
}
    
    public ModelProperty()
    {
        
    }
    
    public String getSkype()
    {
        return Skype;
    }
    
    public void setSkype(String Skype)
    {
        this.Skype = Skype;
        property.setProperty("Skype", Skype);
    }
    
    public String getCourses()
    {
        return courses;
    }
    
    public void setCourses(String courses)
    {
        this.courses = courses;
        property.setProperty("courses", courses);
    }
    
        public String getAvatar()
    {
        return avatar;
    }
    
    public void setAvatar(String avatar)
    {
        this.avatar = avatar;
        property.setProperty("avatar", avatar);
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
        property.setProperty("email", email);
    }
    
    public String getDOB()
    {
        return DOB;
    }
    
    public void setDOB(String DOB)
    {
        this.DOB = DOB;
        property.setProperty("DOB", DOB);
    }
    
    public String getFIO()
    {
        return FIO;
    }
    
    public void setFIO(String FIO)
    {
        this.FIO = FIO;
        property.setProperty("FIO", FIO);
    }
    
    public String getTarget()
    {
        return target;
    }
    
    public void setTarget(String target)
    {
        this.target = target;
        property.setProperty("target", target);
    }
    
    public String getExperience()
    {
        return experience;
    }
    
    public void setExperience(String experience)
    {
        this.experience = experience;
        property.setProperty("experience", experience);
    }
    
    public String getEducation()
    {
        return education;
    }
    
    public void setEducation(String education)
    {
        this.education = education;
        property.setProperty("education", education);
    }
    
    public String getSkills()
    {
        return mas(skills);
    }
    
    public void setSkills(String skills)
    {
        this.skills = skills;
        property.setProperty("skills", skills);
    }
    
    public String getCode()
    {
        return code;
    }
    
    public void setCode(String code)
    {
        this.code = code;
        property.setProperty("code", code);
    }
    
    public Properties newProp()
    {
        return property;
    }
}
