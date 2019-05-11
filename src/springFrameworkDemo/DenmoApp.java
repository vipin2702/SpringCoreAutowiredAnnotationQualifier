package springFrameworkDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DenmoApp {

	public static void main(String[] args) {
		
	//	BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
		
		
		
	}

}
