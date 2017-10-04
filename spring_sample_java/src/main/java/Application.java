import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {

		// Instead of looking XML file to go ahead and look for the AppConfig
		// class
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

		CustomerService service = appContext.getBean("customerService", CustomerService.class);

		System.out.println(service);
		
		CustomerService service2 = appContext.getBean("customerService", CustomerService.class);

		System.out.println(service2);
		
		System.out.println(service.findAll().get(0).getFirstname());

		// Create instance of CustomerService :
		// CustomerService service = new CustomerServiceImpl();
	}

}
