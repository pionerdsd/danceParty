package by.learning;

import by.learning.Interfaces.Shows;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {




    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dance.xml");
        Shows shows = context.getBean(Shows.class);
        shows.dance();


        context.close();






    }

}

