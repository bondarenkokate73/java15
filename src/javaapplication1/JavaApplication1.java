
package javaapplication1;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.*;
import java.util.Properties;

public class JavaApplication1 {

    public static void main(String[] args) throws IOException 
    {
        File dir = new File(".");
        File file = new File(dir, "html.html");
        
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
        
        Properties property = new Properties();
        FileInputStream fis;
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
            fis = new FileInputStream ("./info.properties");   
            property.load(fis);
        }
        catch (IOException ex)
        {
                System.err.println("ОШИБКА: Файл свойств отсуствует!");
        }
        
        String fio = property.getProperty("FIO");
        String dob = property.getProperty("DOB");
        String email = property.getProperty("email");
        String skype = property.getProperty("Skype");
        String avatar = property.getProperty("avatar");
        String target = property.getProperty("target");
        String experience = property.getProperty("experience");
        String education =   property.getProperty("education");    
        String courses = property.getProperty("courses");
        String skills = property.getProperty("skills");
        String code = property.getProperty("code");

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
                        "<td> " + fio + " <br>" +  dob + " <br>" +  email + " <br>" +  skype + " <br> </td>	\n" +
                        "<td> <img width = 200  src= " +  avatar + " ></img> </td> \n" +
                        " </tr> \n" +
                        " </table> <table><tr><td class=\"headinfo2\"><b> Цель:  </td> </tr> \n" +
                        " <tr><td class=\"text\"> " +  target + " </td></tr> \n" +
                        " <tr><td class=\"headinfo2\"><b> Опыт работы:  </td></tr> \n" +
                        " <tr><td class=\"text\"> " +  experience + " </td></tr> \n" +
                        " <tr><td class=\"headinfo2\"><b> Образование: </td></tr> \n" +
                        " <tr><td class=\"text\"> " +  education + " </td></tr> \n" +
                        " <tr><td class=\"headinfo2\"><b> Доп.образ. и курсы:  </td></tr> \n" +
                        " <tr><td class=\"text\"> " +  courses + "  </td></tr> \n" +
                        " <tr><td class=\"headinfo2\"><b> Навыки:  </td></tr> \n" +
                        " <tr><td class=\"text\"> " +  skills + " </td></tr> \n" +
                        " <tr><td class=\"headinfo2\"><b> Код:  </td></tr> \n" +
                        " <tr><td class=\"text\"> " +  code + " </td></tr> \n" +
                        "</table>\n" +
                        "</div>\n" +
                        " </center> \n" +
                        " </body> \n" +
                        " </html>";
        
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
         Desktop.getDesktop().open(file);

        }
    }
  
