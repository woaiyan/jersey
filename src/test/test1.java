package test;

import bean.Article;
import bean.Blog;
import java.io.PrintStream;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import serviceImpl.BlogSImpl;

public class test1 {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		BlogSImpl userService = (BlogSImpl) applicationContext.getBean("BlogSImpl");
		Blog s = userService.getBlog(3);

		System.out.println(s.getArticle().getA_name());
	}
}
