package be.dewolf.customer.dao;

import be.dewolf.customer.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by yannis on 5/03/16.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}
