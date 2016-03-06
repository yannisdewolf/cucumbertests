package be.dewolf.customer;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.persistence.PersistenceContext;

/**
 * Created by yannis on 5/03/16.
 */
@Configuration
@ComponentScan(basePackages = "be.dewolf.customer")
public class CustomerContextConfig {

}
