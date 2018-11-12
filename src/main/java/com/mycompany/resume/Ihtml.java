 package com.mycompany.resume;

import java.util.ArrayList;
import java.util.Properties;

interface Ihtml
        {
            String generateHtml(ArrayList<String> resum);
        }

        class GenerateHtml implements Ihtml
        {
            Properties property = new Properties();
            ArrayList<String> resum;
            String text;
            
            GenerateHtml (ArrayList<String> resum)
            {
                this.resum = resum;
            }
            
            public String generateHtml(ArrayList<String> resum)
            {
                 return text = "<html>\n" +
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
                        "<td> " + resum.get(0) + " <br>" +  resum.get(1) + " <br>" +  resum.get(2) + " <br>" +  resum.get(3) + " <br> </td>	\n" +
                        "<td> <img width = 200  src= " +  resum.get(4) + " ></img> </td> \n" +
                        " </tr> \n" +
                        " </table> <table><tr><td class=\"headinfo2\"><b> Цель:  </td> </tr> \n" +
                        " <tr><td class=\"text\"> " +  resum.get(5) + " </td></tr> \n" +
                        " <tr><td class=\"headinfo2\"><b> Опыт работы:  </td></tr> \n" +
                        " <tr><td class=\"text\"> " + resum.get(6) + " </td></tr> \n" +
                        " <tr><td class=\"headinfo2\"><b> Образование: </td></tr> \n" +
                        " <tr><td class=\"text\"> " +  resum.get(7) + " </td></tr> \n" +
                        " <tr><td class=\"headinfo2\"><b> Доп.образ. и курсы:  </td></tr> \n" +
                        " <tr><td class=\"text\"> " +  resum.get(8) + "  </td></tr> \n" +
                        " <tr><td class=\"headinfo2\"><b> Навыки:  </td></tr> \n" +
                        " <tr><td class=\"text\"> " +  resum.get(9) + " </td></tr> \n" +
                        " <tr><td class=\"headinfo2\"><b> Код:  </td></tr> \n" +
                        " <tr><td class=\"text\"> " +  resum.get(10) + " </td></tr> \n" +
                        "</table>\n" +
                        "</div>\n" +
                        " </center> \n" +
                        " </body> \n" +
                        " </html>";
            }
        }
