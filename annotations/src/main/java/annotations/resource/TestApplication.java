package annotations.resource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TestApplication {
	public static void main(String[] args) {

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

		Applicationn app = (Applicationn) context.getBean("myApp");
		app.process();

	}
}
//test