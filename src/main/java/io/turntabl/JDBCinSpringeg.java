package io.turntabl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/*public class JDBCinSpringeg {
    public static void main(String args[]){
        ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
        Books template = (Books) ctx.getBean("Books");

        int numRows = template.queryForObject("select count(0) from authors", Integer.class);
        System.out.println("There are " + numRows + " authors");
    }*/
//}
