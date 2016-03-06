package be.dewolf.customer.dao;

import be.dewolf.customer.model.Customer;
import org.springframework.context.annotation.Scope;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by yannis on 5/03/16.
 */
@Scope("cucumber-glue")
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}
