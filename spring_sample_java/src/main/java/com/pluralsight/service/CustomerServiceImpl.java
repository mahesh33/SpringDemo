package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

//@Scope(...) : Spring has public static final String
@Service("customerService")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CustomerServiceImpl implements CustomerService {

	// Creating a new instance of CustomerRepository
	private CustomerRepository customerRepository;

	public CustomerServiceImpl() {

	}

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("We are using constructor injection..");
		this.customerRepository = customerRepository;
	}

	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("We are using setter injection...");
		this.customerRepository = customerRepository;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pluralsight.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
