package be.dewolf.customer.service;

import be.dewolf.customer.dao.CustomerRepository;
import be.dewolf.customer.model.Customer;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by yannis on 5/03/16.
 */
@Component
public class CustomerService {

    @Resource
    private CustomerRepository customerRepository;


    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    public Customer getByLastName(String lastName){
        return customerRepository.findByLastName(lastName).get(0);
    }

}
