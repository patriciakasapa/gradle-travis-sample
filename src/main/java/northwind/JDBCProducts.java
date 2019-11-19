package northwind;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JDBCProducts {
    public static void main(String args[]){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        JdbcTemplate template = (JdbcTemplate) ctx.getBean("JdbcTemplate");
        int numRows = template.queryForObject("select count(0) from products", Integer.class);
        System.out.println("There are " + numRows + " products");
    }
}
