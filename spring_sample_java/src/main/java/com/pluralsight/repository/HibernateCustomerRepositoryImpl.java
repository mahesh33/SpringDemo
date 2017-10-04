package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	// Adding a default method just illustrate what we would be doing with this
	// object

	@Value("${dbUsername}")
	private String dbUsername;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pluralsight.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {

		System.out.println(dbUsername);

		List<Customer> customers = new ArrayList<>();

		Customer customer = new Customer();

		customer.setFirstname("Mahesh");
		customer.setLastname("Luitel");

		customers.add(customer);

		return customers;
	}
}

/*
 * To use this inside of Spring, we want to code this to the interface. So, what
 * we're going to do is now extract interface out. There are two ways to do
 * this: i. By right clicking ii. Extract an interface out.
 */