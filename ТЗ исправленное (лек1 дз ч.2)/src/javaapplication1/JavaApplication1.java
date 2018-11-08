
package javaapplication1;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.*;
import java.util.Properties;
import org.apache.log4j.Logger;

public class JavaApplication1 {
    
    private static final Logger log = Logger.getLogger(JavaApplication1.class);
    
    public static void main(String[] args) throws IOException 
    {
       
        File em = new File(".");
        File au = new File(em, "html.html");
        
        if (!au.exists())
        {
            try
            {
                boolean isFile =  au.createNewFile();
                System.out.println("Файл html создан.");
                log.info("Файл html создан.");
            }
            catch (IOException ex)
            {
                System.out.println("Создать html файл не удалось.");
                log.error("Создать html файл не удалось.");
            }
        }
      
        
        Properties property = new Properties();
        FileInputStream qq;
//       
//        
//        property.setProperty("FIO", "Бондаренко Екатерина Сергеевна");
//        property.setProperty("DOB", "16.05.1996");
//        property.setProperty("email", "bondarenkokate73@yandex.ru");
//        property.setProperty("Skype", "kliffoss");
//        property.setProperty("avatar", "https://pp.userapi.com/c846019/v846019478/83ffe/dfD4D7Uy2Wo.jpg");
//        property.setProperty("target", "Успешное прохождение курсов");
//        
//        FileOutputStream out = new FileOutputStream("info.properties");
//        property.store(out,"мои пропертя");
//        
        try
        {
            qq = new FileInputStream ("./info.properties");   
            property.load(qq);
            log.info("Данные из файла проперти были загружены успешно.");
        }
        catch (IOException ex)
        {
                System.err.println("ОШИБКА: Файл свойств отсуствует!");
                log.error("ОШИБКА: Файл свойств отсуствует!");
        }
        
        String a = property.getProperty("FIO");
        String b = property.getProperty("DOB");
        String c = property.getProperty("email");
        String d = property.getProperty("Skype");
        String e = property.getProperty("avatar");
        String h = property.getProperty("target");
        String j = property.getProperty("experience");
        String k = property.getProperty("education");    
        String l = property.getProperty("courses");
        String m = property.getProperty("skills");
        String n = property.getProperty("code");

       String text = "<html>\n" +
                        "<style>\n" +
                        ".headinfo {text-align: right; font-size: 18}\n" +
                        ".headinfo2 {font-size: 22}\n" +
                        ".text {text-align: justify}\n" +
                        "div { margin-left:20%; margin-right: 20%}\n" +
                        "table {width:100%;}\n" +
                        "td {padding: 1%; font-size: 18}\n" +
                        "</style>\n" +
                        "<body background=\"http://avante.biz/wp-content/uploads/Wallpaper-Paper/Wallpaper-Paper-010.jpg\"> \n" +
                        "<center><h1> Резюме </h1>\n" +
                        "<div>\n" +
                        "<table>\n" +
                        "<tr>\n" +
                        "<td class=\"headinfo\"><b>ФИО:<br>Дата рождения:<br>  E-mail:<br> Skype:</b></td>\n" +
                        "<td> " + a + " <br>" +  b + " <br>" +  c + " <br>" +  d + " <br> </td>	\n" +
                        "<td> <img width = 200  src= " +  e + " ></img> </td> \n" +
                        " </tr> \n" +
                        " </table> <table><tr><td class=\"headinfo2\"><b> Цель:  </td> </tr> \n" +
                        " <tr><td class=\"text\"> " +  h + " </td></tr> \n" +
                        " <tr><td class=\"headinfo2\"><b> Опыт работы:  </td></tr> \n" +
                        " <tr><td class=\"text\"> " +  j + " </td></tr> \n" +
                        " <tr><td class=\"headinfo2\"><b> Образование: </td></tr> \n" +
                        " <tr><td class=\"text\"> " +  k + " </td></tr> \n" +
                        " <tr><td class=\"headinfo2\"><b> Доп.образ. и курсы:  </td></tr> \n" +
                        " <tr><td class=\"text\"> " +  l + "  </td></tr> \n" +
                        " <tr><td class=\"headinfo2\"><b> Навыки:  </td></tr> \n" +
                        " <tr><td class=\"text\"> " +  m + " </td></tr> \n" +
                        " <tr><td class=\"headinfo2\"><b> Код:  </td></tr> \n" +
                        " <tr><td class=\"text\"> " +  n + " </td></tr> \n" +
                        "</table>\n" +
                        "</div>\n" +
                        " </center> \n" +
                        " </body> \n" +
                        " </html>";
        
        try (FileOutputStream ww = new FileOutputStream (au))
        {
            byte[] builder = text.getBytes();
            ww.write(builder, 0, builder.length);
            System.out.println("Запись прошла успешно.");
            log.info("Запись прошла успешно.");
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());    
            log.error(ex.getMessage());
        }
         Desktop.getDesktop().open(au);
         log.info("Файл был открыт.");

        }
    
     
    }

  
