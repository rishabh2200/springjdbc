package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		System.out.println("bansal");
		JdbcTemplate template = context.getBean("JdbcTemplate", JdbcTemplate.class);
		System.out.println(template);
		System.out.println("rishabh");
		String query = "insert into springjdbc(id,studentName,studentAddress) values(?,?,?)";
		int result =template.update(query,246,"bansal","334");
		
	}
}
