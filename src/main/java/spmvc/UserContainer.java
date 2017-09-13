package spmvc;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserContainer {
	private static BeanFactory fa;

	public static void main(String[] args) {
		fa = new ClassPathXmlApplicationContext("spring-servlet.xml");
		User u=(User) fa.getBean("user");
		u.show();
	}
}
