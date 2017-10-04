import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * 
 * @author mahes "com.pluralsight" : it is the package name of the code that you
 *         want scanned for autowiring.
 */
@Configuration
@ComponentScan({ "com.pluralsight" })
@PropertySource("app.properties")
public class AppConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer gePropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	// @Bean(name = "customerService")
	// CustomerService getCustomerService() {
	//
	// // CustomerServiceImpl service = new
	// // CustomerServiceImpl(getCustomerRepository());
	//
	// CustomerServiceImpl service = new CustomerServiceImpl();
	//
	// // service.setCustomerRepository(getCustomerRepository());
	//
	// return service;
	// }

	// @Bean(name = "customerRepository")
	// public CustomerRepository getCustomerRepository() {
	// return new HibernateCustomerRepositoryImpl();
	// }
}
