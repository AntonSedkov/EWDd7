package by.epam.sedkov.main;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleExample {
    public static void main(String[] args) {
        System.out.println("1 - английский; \nдругое - русский.");
        char i = 0;
        try {
            i = (char) System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String country = "BY";
        String language = "RU";
        if (i == '1') {
            country = "US";
            language = "EN";
        }
        Locale current = new Locale(language, country);
        ResourceBundle resBundle = ResourceBundle.getBundle("property.message", current);
        String s1 = resBundle.getString("str1");
        System.out.println(s1);
        String s2 = resBundle.getString("str2");
        System.out.println(s2);
        String s3 = resBundle.getString("str3");
        System.out.println(s3);
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM, current);
        System.out.println(dateFormat.format(date));
    }
}
