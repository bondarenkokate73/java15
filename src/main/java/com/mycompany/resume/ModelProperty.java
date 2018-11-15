package main.java.com.mycompany.resume;

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
    
    public Properties newProp()
    {
        return property;
    }
}
