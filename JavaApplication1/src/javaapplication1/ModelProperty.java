package javaapplication1;

import java.util.ArrayList;
import java.util.Properties;

public class ModelProperty 
{
    Properties property = new Properties();
    
    private String Skype;
    private String avatar;
    private String email;
    private String DOB;
    private String FIO;
    private String target;
    private String expirience;
    private String education;
    private String courses;
    private String skills;
    private String code;
    
    public ModelProperty(ArrayList<String> dictionary, Properties property)
    {
        this.property = property;
        this.Skype = dictionary.get(0); 
        this.avatar = dictionary.get(1); 
        this.email = dictionary.get(2); 
        this.DOB = dictionary.get(3); 
        this.FIO = dictionary.get(4); 
        this.target = dictionary.get(5); 
        this.expirience = dictionary.get(6); 
        this.education = dictionary.get(7); 
        this.courses = dictionary.get(8); 
        this.skills = dictionary.get(9); 
        this.code = dictionary.get(10); 
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
    
    public String getExpirience()
    {
        return expirience;
    }
    
    public void setExpirience(String expirience)
    {
        this.expirience = expirience;
        property.setProperty("expirience", expirience);
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
        return skills;
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
}
