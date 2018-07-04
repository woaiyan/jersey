package test;

import bean.testBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test2 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		testBean t = (testBean) context.getBean(testBean.class);
		t.showName("success");
	}
}
