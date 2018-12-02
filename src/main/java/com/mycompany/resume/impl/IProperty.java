package com.mycompany.resume.impl;

import com.mycompany.resume.ModelProperty;
import java.util.ArrayList;
import java.util.Properties;

public interface IProperty 
{

    ArrayList<String> value (ArrayList<String> resum, Properties property, ModelProperty mp);
    
}