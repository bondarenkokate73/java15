package main.java.com.mycompany.resume;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.log4j.PatternLayout;


public class WorkWithFile 
{
    private static final Logger log = Logger.getLogger(WorkWithFile.class);

    
   String dir =  System.getProperty("user.dir") + "/src/main/resourses/";
 //   File dir = new File("/src/main/resources");
    File file = new File(dir, "html.html");
        
    
    public void createFile()
    {
        if (!file.exists())
        {
            try
            {
                boolean isFile =  file.createNewFile();
                System.out.println("Файл html создан.");
                log.info("Файл html создан.");
            }
            catch (IOException ex)
            {
                System.out.println("Создать html файл не удалось.");
                log.error("Создать html файл не удалось.");
            }
        }
    }
    
    public void readFile(Properties property)
    {
        FileInputStream fis;

        try
        {
            fis = new FileInputStream (dir + "/person.properties");   
            property.load(fis);
            log.info("Данные из файла проперти были загружены успешно.");
        }
        catch (IOException ex)
        {
            System.err.println("ОШИБКА: Файл свойств отсуствует в директории!" + dir);
            log.error("ОШИБКА: Файл свойств отсуствует!");
        }
    }
    
    public void writeFile(String text)
    {
                
        try (FileOutputStream fos = new FileOutputStream (file))
        {
            byte[] builder = text.getBytes();
            fos.write(builder, 0, builder.length);
            System.out.println("Запись прошла успешно.");
            log.info("Запись прошла успешно.");
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());     
        }
    }
    
    public void openFile() throws IOException
    {
         Desktop.getDesktop().open(file);
         log.info("Файл был открыт.");
    }
    
    public void saveProp(Properties property) throws IOException
    {
        FileOutputStream out = new FileOutputStream(dir + "/person.properties");
        property.store(out,"мои пропертя");
    }
}
