import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.service.CustomerService;

public class Application {

	public static void main(String[] args) {

		// Create instance of CustomerService :
		// CustomerService service = new CustomerServiceImpl();

		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Create : instance of CustomerService object to find the bean and use
		// the lookup method(so we can pass the name of the bean in and the
		// Class type, so we don't have to cast it and suppress any errors or
		// warnings that we have).
		CustomerService service = appContext.getBean("customerService", CustomerService.class);

		System.out.println(service);

		CustomerService service2 = appContext.getBean("customerService", CustomerService.class);

		System.out.println(service2);

		System.out.println(service.findAll().get(0).getFirstname());
	}

}
