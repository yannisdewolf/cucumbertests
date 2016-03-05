package be.dewolf.customer.dao;

import be.dewolf.customer.CustomerContextConfig;
import be.dewolf.customer.model.Customer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static org.junit.Assert.*;

/**
 * Created by yannis on 5/03/16.
 */
@TestExecutionListeners( { DependencyInjectionTestExecutionListener.class })
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CustomerContextConfig.class)
public class CustomerRepositoryTest {

    @Resource
    private CustomerRepository customerRepository;

    @Test
    public void testFindByLastName() throws Exception {
        Customer yannis = new Customer("Yannis", "De Wolf");
        customerRepository.save(yannis);

        Assert.assertNotNull(customerRepository.findByLastName("De Wolf"));

    }
}