package spmvc;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserContainer {
	private static BeanFactory fa;

	public static void main(String[] args) {
		fa = new ClassPathXmlApplicationContext("spring-servlet.xml");
		User u=(User) fa.getBean("user");
		u.show();
		System.out.println("你好");
		System.out.println("下面开始面向切面AOP");
		System.out.println("再次提交");
	}
}
