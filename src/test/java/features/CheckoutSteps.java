package features;

import be.dewolf.customer.SpringContextTests;
import be.dewolf.customer.dao.CustomerRepository;
import be.dewolf.customer.model.Customer;
import com.google.common.collect.Lists;
import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by yannis on 5/03/16.
 */

public class CheckoutSteps extends SpringContextTests{

    @Resource
    private CustomerRepository customerRepository;

    private List<Customer> gevondenCustomers;

    @PersistenceContext
    private EntityManager em;

    @Before
    public void cleanup() {
        customerRepository.deleteAll();
    }

    public CheckoutSteps() {
        gevondenCustomers = Lists.newArrayList();
        System.out.println("maak leeg");
    }


    @Given("^Een customer met naam \"([^\"]*)\" bestaat$")
    public void eenCustomerMetNaamBestaat(String naam) throws Throwable {
        Assert.assertEquals(0L, customerRepository.count());
        System.out.println("persist with name " + naam);
        Customer iets = new Customer("iets", naam);
        customerRepository.save(iets);


    }

    @When("^I search customer met naam \"([^\"]*)\"$")
    public void iSearchCustomerMetNaam(String arg0) throws Throwable {
        System.out.println("find by name " + arg0);
        gevondenCustomers = Lists.newArrayList(customerRepository.findByLastName(arg0));
    }

    @Then("^I find (\\d+) customer$")
    public void iFindCustomer(int aantal) throws Throwable {
        assertEquals(aantal, Lists.newArrayList(gevondenCustomers).size());
    }
}
