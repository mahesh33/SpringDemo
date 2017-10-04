import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {

		// Create instance of CustomerService :
		CustomerService service = new CustomerServiceImpl();

		System.out.println(service.findAll().get(0).getFirstname());
	}

}
