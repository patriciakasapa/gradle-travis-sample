package northwind;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.JDBCType;

public class JDBCCustomers {
    public static void main(String args[]){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        JdbcTemplate template = (JdbcTemplate) ctx.getBean("JdbcTemplate");
        int numRows = template.queryForObject("select count(0) from customers", Integer.class);
        System.out.println("There are " + numRows + " customers");



    }
}

