package javaapplication1;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


public class WorkWithFile 
{
    File dir = new File(".");
    File file = new File(dir, "html.html");
    
    public void createFile()
    {
        if (!file.exists())
        {
            try
            {
                boolean isFile =  file.createNewFile();
                System.out.println("Файл html создан.");
            }
            catch (IOException ex)
            {
                System.out.println("Создать html файл не удалось.");
            }
        }
    }
    
    public void readFile(Properties property)
    {
        FileInputStream fis;

        try
        {
            fis = new FileInputStream ("./info.properties");   
            property.load(fis);
        }
        catch (IOException ex)
        {
            System.err.println("ОШИБКА: Файл свойств отсуствует!");
        }
    }
    
    public void writeFile(String text)
    {
                
        try (FileOutputStream fos = new FileOutputStream (file))
        {
            byte[] builder = text.getBytes();
            fos.write(builder, 0, builder.length);
            System.out.println("Запись прошла успешно.");
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());     
        }
    }
    
    public void openFile() throws IOException
    {
         Desktop.getDesktop().open(file);
    }
    
    public void saveProp(Properties property) throws IOException
    {
        FileOutputStream out = new FileOutputStream("./info.properties");
        property.store(out,"мои пропертя");
    }
}
